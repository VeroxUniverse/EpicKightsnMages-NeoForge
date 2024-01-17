package net.veroxuniverse.knightsnmages.item.weapon.client;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.knightsnmages.KnightsnMages;
import net.veroxuniverse.knightsnmages.item.weapon.KNMBookItem;
import net.veroxuniverse.knightsnmages.item.weapon.KNMWandItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class EliteSpellBookRenderer extends GeoItemRenderer<KNMBookItem> {
    public EliteSpellBookRenderer() {
        super(new GeoModel<KNMBookItem>() {
            @Override
            public ResourceLocation getModelResource(KNMBookItem animatable) {
                return new ResourceLocation(KnightsnMages.MOD_ID, "geo/elite_spell_book.geo.json");
            }

            @Override
            public ResourceLocation getTextureResource(KNMBookItem animatable) {
                return new ResourceLocation(KnightsnMages.MOD_ID, "textures/item/elite_spell_book.png");
            }

            @Override
            public ResourceLocation getAnimationResource(KNMBookItem animatable) {
                return new ResourceLocation(KnightsnMages.MOD_ID, "animations/elite_spell_book.animation.json");
            }
        });
    }
}
