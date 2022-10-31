package net.quix.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.quix.tutorialmod.block.ModBlocks;
import net.quix.tutorialmod.entity.ModEntities;
import net.quix.tutorialmod.entity.custom.JellyfishEntity;
import net.quix.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
        ModBlocks.registerModBlocks();
		GeckoLib.initialize();
		FabricDefaultAttributeRegistry.register(ModEntities.Jellyfish, JellyfishEntity.setAttributes());

	}
}
