package net.veroxuniverse.knightsnmages.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class KNMCropBlockItem extends ItemNameBlockItem {
    public List<Component> tooltip = new ArrayList<>();
    public Rarity rarity;

    public KNMCropBlockItem(Block pBlock, Properties pProperties) {
        super(pBlock, pProperties);
    }

    public KNMCropBlockItem withTooltip(Component tip) {
        tooltip.add(tip);
        return this;
    }

    public KNMCropBlockItem withTooltip(String tip) {
        tooltip.add(Component.translatable(tip));
        return this;
    }

    public KNMCropBlockItem withRarity(Rarity rarity) {
        this.rarity = rarity;
        return this;
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        return rarity != null ? rarity : super.getRarity(stack);
    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip2, TooltipFlag flagIn) {
        if (tooltip != null && !tooltip.isEmpty()) {
            tooltip2.addAll(tooltip);
        }
    }
}