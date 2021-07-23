package net.client.model;

import com.mojang.datafixers.util.Pair;
import net.fabricmc.fabric.api.client.model.ModelResourceProvider;
import net.fabricmc.fabric.api.renderer.v1.Renderer;
import net.fabricmc.fabric.api.renderer.v1.RendererAccess;
import net.fabricmc.fabric.api.renderer.v1.mesh.Mesh;
import net.fabricmc.fabric.api.renderer.v1.mesh.MeshBuilder;
import net.fabricmc.fabric.api.renderer.v1.mesh.MutableQuadView;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.model.FabricBakedModel;
import net.fabricmc.fabric.api.renderer.v1.render.RenderContext;
import net.fabricmc.fabric.api.rendering.data.v1.RenderAttachedBlockView;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.model.*;
import net.minecraft.client.render.model.json.ModelOverrideList;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockRenderView;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class ItemModel implements UnbakedModel, BakedModel, FabricBakedModel {

    private static final SpriteIdentifier[] SPRITE_IDS = new SpriteIdentifier[]{
            new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, new Identifier("minecraft:block/furnace_front_on")),
            new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, new Identifier("minecraft:block/furnace_top"))
    };


    private Sprite[] SPRITES = new Sprite[2];
    private Mesh mesh;

    /**
     * When true, signals renderer this producer is implemented through {@link BakedModel#getQuads(BlockState, Direction, Random)}.
     * Also means the model does not rely on any non-vanilla features.
     * Allows the renderer to optimize or route vanilla models through the unmodified vanilla pipeline if desired.
     *
     * <p>Fabric overrides to true for vanilla baked models.
     * Enhanced models that use this API should return false,
     * otherwise the API will not recognize the model.
     */
    @Override
    public boolean isVanillaAdapter() {
        return false;
    }

    /**
     * This method will be called during chunk rebuilds to generate both the static and
     * dynamic portions of a block model when the model implements this interface and
     * {@link #isVanillaAdapter()} returns false.
     *
     * <p>During chunk rebuild, this method will always be called exactly one time per block
     * position, irrespective of which or how many faces or block render layers are included
     * in the model. Models must output all quads/meshes in a single pass.
     *
     * <p>Also called to render block models outside of chunk rebuild or block entity rendering.
     * Typically this happens when the block is being rendered as an entity, not as a block placed in the world.
     * Currently this happens for falling blocks and blocks being pushed by a piston, but renderers
     * should invoke this for all calls to {@link BlockModelRenderer#render(BlockRenderView, BakedModel, BlockState, BlockPos, MatrixStack, VertexConsumer, boolean, Random, long, int)}
     * that occur outside of chunk rebuilds to allow for features added by mods, unless
     * {@link #isVanillaAdapter()} returns true.
     *
     * <p>Outside of chunk rebuilds, this method will be called every frame. Model implementations should
     * rely on pre-baked meshes as much as possible and keep transformation to a minimum.  The provided
     * block position may be the <em>nearest</em> block position and not actual. For this reason, neighbor
     * state lookups are best avoided or will require special handling. Block entity lookups are
     * likely to fail and/or give meaningless results.
     *
     * <p>In all cases, renderer will handle face occlusion and filter quads on faces obscured by
     * neighboring blocks (if appropriate).  Models only need to consider "sides" to the
     * extent the model is driven by connection with neighbor blocks or other world state.
     *
     * <p>Note: with {@link BakedModel#getQuads(BlockState, Direction, Random)}, the random
     * parameter is normally initialized with the same seed prior to each face layer.
     * Model authors should note this method is called only once per block, and call the provided
     * Random supplier multiple times if re-seeding is necessary. For wrapped vanilla baked models,
     * it will probably be easier to use {@link RenderContext#fallbackConsumer} which handles
     * re-seeding per face automatically.
     *
     * @param blockView      Access to world state. Using {@link RenderAttachedBlockView#getBlockEntityRenderAttachment(BlockPos)} to
     *                       retrieve block entity state unless thread safety can be guaranteed.
     *                       param safeBlockEntityAccessor Thread-safe access to block entity data
     * @param state          Block state for model being rendered.
     * @param pos            Position of block for model being rendered.
     * @param randomSupplier Random object seeded per vanilla conventions. Call multiple times to re-seed.
     *                       Will not be thread-safe. Do not cache or retain a reference.
     * @param context        Accepts model output.
     */
    @Override
    public void emitBlockQuads(BlockRenderView blockView, BlockState state, BlockPos pos, Supplier<Random> randomSupplier, RenderContext context) {
        // Render function

        // We just render the mesh
        context.meshConsumer().accept(mesh);
    }

    /**
     * This method will be called during item rendering to generate both the static and
     * dynamic portions of an item model when the model implements this interface and
     * {@link #isVanillaAdapter()} returns false.
     *
     * <p>Vanilla item rendering is normally very limited. It ignores lightmaps, vertex colors,
     * and vertex normals. Renderers are expected to implement enhanced features for item
     * models. If a feature is impractical due to performance or other concerns, then the
     * renderer must at least give acceptable visual results without the need for special-
     * case handling in model implementations.
     *
     * <p>Calls to this method will generally happen on the main client thread but nothing
     * prevents a mod or renderer from calling this method concurrently. Implementations
     * should not mutate the ItemStack parameter, and best practice will be to make the
     * method thread-safe.
     *
     * <p>Implementing this method does NOT mitigate the need to implement a functional
     * {@link BakedModel#getOverrides()} method, because this method will be called
     * on the <em>result</em> of  {@link BakedModel#getOverrides}.  However, that
     * method can simply return the base model because the output from this method will
     * be used for rendering.
     *
     * <p>Renderer implementations should also use this method to obtain the quads used
     * for item enchantment glint rendering.  This means models can put geometric variation
     * logic here, instead of returning every possible shape from {@link BakedModel#getOverrides}
     * as vanilla baked models.
     *
     * @param stack
     * @param randomSupplier
     * @param context
     */
    @Override
    public void emitItemQuads(ItemStack stack, Supplier<Random> randomSupplier, RenderContext context) {
        context.fallbackConsumer();
    }

    @Override
    public List<BakedQuad> getQuads(@Nullable BlockState state, @Nullable Direction face, Random random) {
        return null;
    }

    @Override
    public boolean useAmbientOcclusion() {
        return true;
    }

    @Override
    public boolean hasDepth() {
        return false;
    }

    /**
     * Allows control of the lighting when rendering a model in a GUI.
     * <p>
     * True, the model will be lit from the side, like a block.
     * <p>
     * False, the model will be lit from the front, like an item.
     */
    @Override
    public boolean isSideLit() {
        return false;
    }

    @Override
    public boolean isBuiltin() {
        return false;
    }

    @Override
    public Sprite getSprite() {
        return SPRITES[1];
    }

    @Override
    public ModelTransformation getTransformation() {
        return null;
    }

    @Override
    public ModelOverrideList getOverrides() {
        return null;
    }

    @Override
    public Collection<Identifier> getModelDependencies() {
        return Collections.emptyList();
    }

    @Override
    public Collection<SpriteIdentifier> getTextureDependencies(Function<Identifier, UnbakedModel> unbakedModelGetter, Set<Pair<String, String>> unresolvedTextureReferences) {
        return Arrays.asList(SPRITE_IDS);
    }

    @Nullable
    @Override
    public BakedModel bake(ModelLoader loader, Function<SpriteIdentifier, Sprite> textureGetter, ModelBakeSettings rotationContainer, Identifier modelId) {
        for (int i = 0; i < SPRITES.length; i++){
            SPRITES[i] = textureGetter.apply(SPRITE_IDS[i]);
        }

        Renderer renderer = RendererAccess.INSTANCE.getRenderer();
        MeshBuilder builder = renderer.meshBuilder();
        QuadEmitter emitter = builder.getEmitter();

        for (Direction direction : Direction.values()){
            int spriteIdx = direction == Direction.UP || direction == Direction.DOWN ? 1 : 0;
            // Add a new face to the mesh
            emitter.square(direction, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f);
            // Set the sprite of the face, must be called after .square()
            // We haven't specified any UV coordinates, so we want to use the whole texture. BAKE_LOCK_UV does exactly that.
            emitter.spriteBake(0, SPRITES[spriteIdx], MutableQuadView.BAKE_LOCK_UV);
            // Enable texture usage
            emitter.spriteColor(0, -1, -1, -1, -1);
            // Add the quad to the mesh
            emitter.emit();
        }
        mesh = builder.build();

        return this;
    }
}