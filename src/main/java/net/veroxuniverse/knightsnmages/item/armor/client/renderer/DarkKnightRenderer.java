package net.veroxuniverse.knightsnmages.item.armor.client.renderer;

import net.veroxuniverse.knightsnmages.item.armor.client.model.DarkKnightModel;
import net.veroxuniverse.knightsnmages.item.armor.custom.DarkKnight;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class DarkKnightRenderer extends GeoArmorRenderer<DarkKnight> {
    public DarkKnightRenderer() {
        super(new DarkKnightModel());
    }

}