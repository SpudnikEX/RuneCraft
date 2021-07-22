package net;

import net.client.model.ItemModelProvider;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import net.fabricmc.fabric.api.client.model.ModelResourceProvider;
import net.registry.RegisterArmor;

public class RuneCraftClient implements ClientModInitializer {
    // Rendering only happens client side, register client models in a client initializer //

    @Override
    public void onInitializeClient() {
        RegisterArmor.render();

        ModelLoadingRegistry.INSTANCE.registerResourceProvider(resourceManager -> new ItemModelProvider());
        /*
         * Registers our Cube Entity's renderer, which provides a model and texture for the entity.
         *
         * Entity Renderers can also manipulate the model before it renders based on entity context (EndermanEntityRenderer#render).
         */
    }
}
