package net.quix.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.quix.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutourialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
