package net.quix.tutorialmod.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.quix.tutorialmod.TutorialMod;
import net.quix.tutorialmod.entity.custom.JellyfishEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class JellyfishRenderer extends GeoEntityRenderer<JellyfishEntity> {
    public JellyfishRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new JellyfishModel());
        this.shadowRadius = (float) 0.4;
    }

    @Override
    public Identifier getTextureResource(JellyfishEntity animatable) {
        return new Identifier(TutorialMod.MOD_ID, "textures/entity/jellyfish.geo.json");
    }

    @Override
    public RenderLayer getRenderType(JellyfishEntity animatable, float partialTick, MatrixStack poseStack, @Nullable VertexConsumerProvider bufferSource, @Nullable VertexConsumer buffer, int packedLight, Identifier texture) {
        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }

    @Override
    public Identifier getTexture(JellyfishEntity entity) {
        return null;
    }
}
