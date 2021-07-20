package net.mixin;

import net.armor.RunecraftArmorModel;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(RunecraftArmorModel.class)
public class InspectorMixin {
    @Inject(at = @At("INVOKE"), method = "setAngles")
    private void init(CallbackInfo info) {
        System.out.println("Method Called ");
    }
}
