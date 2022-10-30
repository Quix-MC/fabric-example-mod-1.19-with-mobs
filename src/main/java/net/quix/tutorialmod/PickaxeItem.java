/*
 * Decompiled with CFR 0.1.1 (FabricMC 57d88659).
 */
package net.quix.tutorialmod;

import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.tag.BlockTags;

/**
 * Access widened by fabric-transitive-access-wideners-v1 to accessible
 */
public class PickaxeItem
extends MiningToolItem {
    /**
     * Access widened by fabric-transitive-access-wideners-v1 to accessible
     */
    public PickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(attackDamage, attackSpeed, material, BlockTags.PICKAXE_MINEABLE, settings);
    }
}

