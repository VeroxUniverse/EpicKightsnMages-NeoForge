package net.veroxuniverse.knightsnmages.item.armor.client.renderer;

import net.veroxuniverse.knightsnmages.item.armor.client.model.EliteBattleMageModel;
import net.veroxuniverse.knightsnmages.item.armor.custom.EliteBattleMage;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class EliteBattleMageRenderer extends GeoArmorRenderer<EliteBattleMage> {
    public EliteBattleMageRenderer() {
        super(new EliteBattleMageModel());
    }

/*

    @Override
    public ResourceLocation getTextureLocation(EliteBattleMage instance) {

        return new ResourceLocation(KnightsnMages.MOD_ID, "textures/models/armor/ars_nouveau/elite_mage_armor_textures" + instance.getColor(getCurrentStack()) + ".png");
    }

 */

}