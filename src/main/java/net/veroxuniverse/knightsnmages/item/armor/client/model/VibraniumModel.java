package net.veroxuniverse.knightsnmages.item.armor.client.model;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.knightsnmages.KnightsnMages;
import net.veroxuniverse.knightsnmages.item.armor.custom.allthemodium.Vibranium;
import software.bernie.geckolib.model.GeoModel;

public class VibraniumModel extends GeoModel<Vibranium> {
    @Override
    public ResourceLocation getModelResource(Vibranium object) {
        return new ResourceLocation(KnightsnMages.MOD_ID, "geo/mage_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Vibranium object) {
        //return null;
        return new ResourceLocation(KnightsnMages.MOD_ID, "textures/armor/mage_vibranium2.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Vibranium animatable) {
        return new ResourceLocation(KnightsnMages.MOD_ID, "animations/armor.animation.json");
    }

}