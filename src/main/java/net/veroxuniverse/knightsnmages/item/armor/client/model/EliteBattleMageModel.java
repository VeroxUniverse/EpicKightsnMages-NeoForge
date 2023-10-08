package net.veroxuniverse.knightsnmages.item.armor.client.model;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.knightsnmages.KnightsnMages;
import net.veroxuniverse.knightsnmages.item.armor.custom.EliteBattleMage;
import software.bernie.geckolib.model.GeoModel;

public class EliteBattleMageModel extends GeoModel<EliteBattleMage> {
    @Override
    public ResourceLocation getModelResource(EliteBattleMage object) {
        return new ResourceLocation(KnightsnMages.MOD_ID, "geo/elite_mage_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EliteBattleMage object) {
        //return null;
        return new ResourceLocation(KnightsnMages.MOD_ID, "textures/armor/elite_mage_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EliteBattleMage animatable) {
        return new ResourceLocation(KnightsnMages.MOD_ID, "animations/elite_mage_armor.animation.json");
    }

}