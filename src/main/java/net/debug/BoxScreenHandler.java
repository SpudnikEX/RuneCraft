package net.debug;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.Generic3x3ContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.math.BlockPos;
import net.registry.RegisterDebug;

public class BoxScreenHandler extends Generic3x3ContainerScreenHandler implements PositionedScreenHandler {
    private final BlockPos pos;

    public BoxScreenHandler(int syncId, PlayerInventory playerInventory, PacketByteBuf buf) {
        super(syncId, playerInventory);
        this.pos = buf.readBlockPos();
    }

    public BoxScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory) {
        super(syncId, playerInventory, inventory);
        this.pos = BlockPos.ORIGIN;
    }

    @Override
    public BlockPos getPos() {
        return pos;
    }

    @Override
    public ScreenHandlerType<?> getType() {
        return RegisterDebug.BOX_SCREEN_HANDLER;
    }
}

