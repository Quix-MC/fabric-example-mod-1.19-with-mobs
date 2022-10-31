package net.quix.tutorialmod.entity.client;

import net.minecraft.util.Identifier;
import net.quix.tutorialmod.TutorialMod;
import net.quix.tutorialmod.entity.custom.JellyfishEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class JellyfishModel extends AnimatedGeoModel <JellyfishEntity>{
    @Override
    public Identifier getModelResource(JellyfishEntity object) {
        return new Identifier(TutorialMod.MOD_ID, "geo/jellyfish.geo.json");
    }

    @Override
    public Identifier getTextureResource(JellyfishEntity object) {
        return new Identifier(TutorialMod.MOD_ID, "textures/entity/jellyfish.geo.json");
    }

    @Override
    public Identifier getAnimationResource(JellyfishEntity animatable) {
        return new Identifier(TutorialMod.MOD_ID, "animations/jellyfish.geo.json");
    }
}
