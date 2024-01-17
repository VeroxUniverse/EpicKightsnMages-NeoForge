package net.veroxuniverse.knightsnmages.item.armor.client.renderer;

import net.veroxuniverse.knightsnmages.item.armor.client.model.BlueKnightModel;
import net.veroxuniverse.knightsnmages.item.armor.client.model.EliteBattleMageModel;
import net.veroxuniverse.knightsnmages.item.armor.custom.BlueKnight;
import net.veroxuniverse.knightsnmages.item.armor.custom.EliteBattleMage;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BlueKnightRenderer extends GeoArmorRenderer<BlueKnight> {
    public BlueKnightRenderer() {
        super(new BlueKnightModel());
    }

}