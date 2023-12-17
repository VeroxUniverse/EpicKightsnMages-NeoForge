package net.veroxuniverse.knightsnmages.item.armor.client.model;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.knightsnmages.KnightsnMages;
import net.veroxuniverse.knightsnmages.item.armor.custom.allthemodium.Unobtainium;
import software.bernie.geckolib.model.GeoModel;

public class UnobtainiumModel extends GeoModel<Unobtainium> {
    @Override
    public ResourceLocation getModelResource(Unobtainium object) {
        return new ResourceLocation(KnightsnMages.MOD_ID, "geo/mage_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Unobtainium object) {
        //return null;
        return new ResourceLocation(KnightsnMages.MOD_ID, "textures/armor/mage_unobtainium.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Unobtainium animatable) {
        return new ResourceLocation(KnightsnMages.MOD_ID, "animations/armor.animation.json");
    }

}