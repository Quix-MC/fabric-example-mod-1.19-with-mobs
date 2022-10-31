package net.quix.tutorialmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.quix.tutorialmod.TutorialMod;
import net.quix.tutorialmod.entity.custom.JellyfishEntity;
import static net.quix.tutorialmod.TutorialMod.MOD_ID;


public class ModEntities {
    public static final EntityType<JellyfishEntity> Jellyfish = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(TutorialMod,MOD_ID, "jellyfish"),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE, JellyfishEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 0.4)).build());
}
