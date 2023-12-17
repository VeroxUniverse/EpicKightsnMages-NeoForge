package net.veroxuniverse.knightsnmages.item.armor.client.model;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.knightsnmages.KnightsnMages;
import net.veroxuniverse.knightsnmages.item.armor.custom.allthemodium.Allthemodium;
import software.bernie.geckolib.model.GeoModel;

public class AllthemodiumModel extends GeoModel<Allthemodium> {
    @Override
    public ResourceLocation getModelResource(Allthemodium object) {
        return new ResourceLocation(KnightsnMages.MOD_ID, "geo/mage_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Allthemodium object) {
        //return null;
        return new ResourceLocation(KnightsnMages.MOD_ID, "textures/armor/mage_allthemodium2.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Allthemodium animatable) {
        return new ResourceLocation(KnightsnMages.MOD_ID, "animations/armor.animation.json");
    }

}