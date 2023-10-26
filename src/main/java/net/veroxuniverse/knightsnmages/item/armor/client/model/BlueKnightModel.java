package net.veroxuniverse.knightsnmages.item.armor.client.model;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.knightsnmages.KnightsnMages;
import net.veroxuniverse.knightsnmages.item.armor.custom.BlueKnight;
import net.veroxuniverse.knightsnmages.item.armor.custom.EliteBattleMage;
import software.bernie.geckolib.model.GeoModel;

public class BlueKnightModel extends GeoModel<BlueKnight> {
    @Override
    public ResourceLocation getModelResource(BlueKnight object) {
        return new ResourceLocation(KnightsnMages.MOD_ID, "geo/blue_knight_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BlueKnight object) {
        //return null;
        return new ResourceLocation(KnightsnMages.MOD_ID, "textures/armor/blue_knight_armor_textures_eyes.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BlueKnight animatable) {
        return new ResourceLocation(KnightsnMages.MOD_ID, "animations/empty.animation.json");
    }

}