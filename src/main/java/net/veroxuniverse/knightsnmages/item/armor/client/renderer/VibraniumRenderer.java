package net.veroxuniverse.knightsnmages.item.armor.client.renderer;

import net.veroxuniverse.knightsnmages.item.armor.client.model.VibraniumModel;
import net.veroxuniverse.knightsnmages.item.armor.custom.allthemodium.Vibranium;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class VibraniumRenderer extends GeoArmorRenderer<Vibranium> {
    public VibraniumRenderer() {
        super(new VibraniumModel());
    }
}