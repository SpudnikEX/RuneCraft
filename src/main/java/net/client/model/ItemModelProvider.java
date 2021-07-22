package net.client.model;

import net.fabricmc.fabric.api.client.model.ModelProviderContext;
import net.fabricmc.fabric.api.client.model.ModelProviderException;
import net.fabricmc.fabric.api.client.model.ModelResourceProvider;
import net.minecraft.client.render.model.UnbakedModel;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

public class ItemModelProvider implements ModelResourceProvider {

    public static final Identifier FOUR_SIDED_FURNACE_MODEL = new Identifier("runecraft","four_sided_furnace");
    /**
     * @param resourceId The resource identifier to be loaded.
     * @param context
     * @return The loaded UnbakedModel, or null if this ModelResourceProvider doesn't handle a specific Identifier
     * (or if there was no error!).
     */
    @Override
    public @Nullable UnbakedModel loadModelResource(Identifier resourceId, ModelProviderContext context) throws ModelProviderException {
        if(resourceId.equals(FOUR_SIDED_FURNACE_MODEL)){
            return new ItemModel();
        } else {
            return null;
        }
    }
}
