package net.veroxuniverse.knightsnmages.item.armor.client.model;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.knightsnmages.KnightsnMages;
import net.veroxuniverse.knightsnmages.item.armor.custom.DarkKnight;
import software.bernie.geckolib.model.GeoModel;

public class DarkKnightModel extends GeoModel<DarkKnight> {
    @Override
    public ResourceLocation getModelResource(DarkKnight object) {
        return new ResourceLocation(KnightsnMages.MOD_ID, "geo/dark_knight_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DarkKnight object) {
        //return null;
        return new ResourceLocation(KnightsnMages.MOD_ID, "textures/armor/dark_knight_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DarkKnight animatable) {
        return new ResourceLocation(KnightsnMages.MOD_ID, "animations/empty.animation.json");
    }

}