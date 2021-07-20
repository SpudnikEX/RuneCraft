package net;

import net.armor.HallowedArmor;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderingRegistry;
import net.minecraft.client.render.entity.feature.CapeFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.util.Identifier;
import net.registry.RegisterArmor;

public class RuneCraftClient implements ClientModInitializer {
    // Rendering only happens client side, register client models in a client initializer //

    @Override
    public void onInitializeClient() {
        RegisterArmor.render();

        /*
         * Registers our Cube Entity's renderer, which provides a model and texture for the entity.
         *
         * Entity Renderers can also manipulate the model before it renders based on entity context (EndermanEntityRenderer#render).
         */
    }
}
