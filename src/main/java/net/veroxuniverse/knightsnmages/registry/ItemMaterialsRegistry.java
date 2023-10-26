package net.veroxuniverse.knightsnmages.registry;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ItemMaterialsRegistry {

    public static final ForgeTier NOBLE = new ForgeTier(4, 2031, 12.0f,
            0.0f, 25, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemsRegistry.NOBLE_MAGEBLOOM_FIBER.get()));

}
