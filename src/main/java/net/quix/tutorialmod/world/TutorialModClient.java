package net.quix.tutorialmod.world;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.quix.tutorialmod.entity.ModEntities;
import net.quix.tutorialmod.entity.client.JellyfishRenderer;

public class TutorialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.Jellyfish, JellyfishRenderer::new);









    }
}
