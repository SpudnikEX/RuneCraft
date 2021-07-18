package net;

import net.armor.HallowedArmor;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderingRegistry;
import net.minecraft.util.Identifier;
import net.registry.RegisterArmor;

public class RuneCraftClient implements ClientModInitializer {
    // Rendering only happens client side, register client models in a client initializer //

    @Override
    public void onInitializeClient() {
        /*
         * Registers our Cube Entity's renderer, which provides a model and texture for the entity.
         *
         * Entity Renderers can also manipulate the model before it renders based on entity context (EndermanEntityRenderer#render).
         */


    }

    // Adds custom entity models to hallowed and metallurgium armor
    public void renderHallowedArmorModel() {
        ArmorRenderingRegistry.ModelProvider modelProvider = (entity, stack, slot, original) -> ((HallowedArmor) stack.getItem()).getArmorModel(entity, stack, slot, original);
        ArmorRenderingRegistry.TextureProvider textureProvider = (entity, stack, slot, secondLayer, suffix, original) -> new Identifier(((HallowedArmor) stack.getItem()).getArmorTexture(stack, slot));
        ArmorRenderingRegistry.registerModel(modelProvider, RegisterArmor.HALLOWED_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, RegisterArmor.HALLOWED_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, RegisterArmor.HALLOWED_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, RegisterArmor.HALLOWED_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, RegisterArmor.HALLOWED_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, RegisterArmor.HALLOWED_LEGGINGS);
    }
}
