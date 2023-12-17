package net.veroxuniverse.knightsnmages.item.armor.client.renderer;


import net.veroxuniverse.knightsnmages.item.armor.client.model.AllthemodiumModel;
import net.veroxuniverse.knightsnmages.item.armor.custom.allthemodium.Allthemodium;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AllthemodiumRenderer extends GeoArmorRenderer<Allthemodium> {
    public AllthemodiumRenderer() {
        super(new AllthemodiumModel());
    }
}