package net.registry;

import net.RuneCraft;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterPaintings {
    public static final PaintingMotive LUMBRIDGE = new PaintingMotive(16,16);

    public static void register(){
        //Registry.register(Registry.PAINTING_MOTIVE, "Lumbridge", LUMBRIDGE);
        Registry.register(Registry.PAINTING_MOTIVE,new Identifier(RuneCraft.MOD_ID,"Lumbridge"),LUMBRIDGE);
    }
}
