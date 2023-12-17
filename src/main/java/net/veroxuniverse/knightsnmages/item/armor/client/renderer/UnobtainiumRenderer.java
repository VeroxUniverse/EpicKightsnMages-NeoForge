package net.veroxuniverse.knightsnmages.item.armor.client.renderer;

import net.veroxuniverse.knightsnmages.item.armor.client.model.UnobtainiumModel;
import net.veroxuniverse.knightsnmages.item.armor.custom.allthemodium.Unobtainium;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class UnobtainiumRenderer extends GeoArmorRenderer<Unobtainium> {
    public UnobtainiumRenderer() {
        super(new UnobtainiumModel());
    }
}