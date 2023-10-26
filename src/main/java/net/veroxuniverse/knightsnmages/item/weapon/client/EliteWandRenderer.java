package net.veroxuniverse.knightsnmages.item.weapon.client;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.knightsnmages.KnightsnMages;
import net.veroxuniverse.knightsnmages.item.weapon.KNMWandItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class EliteWandRenderer extends GeoItemRenderer<KNMWandItem> {
    public EliteWandRenderer() {
        super(new GeoModel<KNMWandItem>() {
            @Override
            public ResourceLocation getModelResource(KNMWandItem animatable) {
                return new ResourceLocation(KnightsnMages.MOD_ID, "geo/elite_wand.geo.json");
            }

            @Override
            public ResourceLocation getTextureResource(KNMWandItem animatable) {
                return new ResourceLocation(KnightsnMages.MOD_ID, "textures/item/elite_wand.png");
            }

            @Override
            public ResourceLocation getAnimationResource(KNMWandItem animatable) {
                return new ResourceLocation(KnightsnMages.MOD_ID, "animations/elite_wand.animation.json");
            }
        });
    }
}
