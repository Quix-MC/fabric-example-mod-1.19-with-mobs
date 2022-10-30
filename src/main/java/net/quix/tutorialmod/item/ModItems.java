package net.quix.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.quix.tutorialmod.TutorialMod;
import net.minecraft.util.registry.Registry;
import net.quix.tutorialmod.item.custom.ModAxeItem;
import net.quix.tutorialmod.item.custom.ModHoeItem;
import net.quix.tutorialmod.item.custom.ModPickaxeItem;

public class ModItems {
    public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    public static final Item TANZANITE_HOE = registerItem("tanzanite_hoe",
            new ModHoeItem(ModToolMaterial.TANZANITE, 0, 3f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item TANZANITE_SWORD = registerItem("tanzanite_sword",
            new SwordItem(ModToolMaterial.TANZANITE, 8, 3f,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item TANZANITE_PICKAXE = registerItem("tanzanite_pickaxe",
            new ModPickaxeItem(ModToolMaterial.TANZANITE, 6, 3f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item TANZANITE_SHOVEL = registerItem("tanzanite_shovel",
            new ShovelItem(ModToolMaterial.TANZANITE, 5, 3f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item TANZANITE_AXE = registerItem("tanzanite_axe",
            new ModAxeItem(ModToolMaterial.TANZANITE, 7, 3f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));

        private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}


