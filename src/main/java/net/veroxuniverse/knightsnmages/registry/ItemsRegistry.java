package net.veroxuniverse.knightsnmages.registry;

import com.hollingsworth.arsnouveau.api.perk.ArmorPerkHolder;
import com.hollingsworth.arsnouveau.api.perk.PerkSlot;
import com.hollingsworth.arsnouveau.api.registry.PerkRegistry;
import com.hollingsworth.arsnouveau.common.armor.AnimatedMagicArmor;
import com.hollingsworth.arsnouveau.common.items.ModItem;
import com.hollingsworth.arsnouveau.setup.registry.APIRegistry;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.veroxuniverse.knightsnmages.KnightsnMages;
import net.veroxuniverse.knightsnmages.item.KNMCropBlockItem;
import net.veroxuniverse.knightsnmages.item.armor.custom.BlueKnight;
import net.veroxuniverse.knightsnmages.item.armor.custom.EliteBattleMage;
import net.veroxuniverse.knightsnmages.item.perk.BlankElitePerkItem;
import net.veroxuniverse.knightsnmages.item.perk.NoblePerk;
import net.veroxuniverse.knightsnmages.item.weapon.KNMSwordItem;
import net.veroxuniverse.knightsnmages.item.weapon.KNMWandItem;
import software.bernie.geckolib.model.GeoModel;

import java.util.Arrays;
import java.util.List;

public class ItemsRegistry {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KnightsnMages.MOD_ID);

    //* ITEMS *//

    public static final RegistryObject<Item> ELITE_MAGEBLOOM = ITEMS.register("elite_magebloom",
            () -> new ModItem(new Item.Properties()).withTooltip("knightsnmages.tooltip.elite_magebloom"));

    public static final RegistryObject<Item> ELITE_MAGEBLOOM_FIBER = ITEMS.register("elite_magebloom_fiber",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ELITE_MAGEBLOOM_SEED = ITEMS.register("elite_magebloom_seed",
            () -> new KNMCropBlockItem(BlocksRegistry.ELITE_MAGEBLOOM_CROP.get(), new Item.Properties()).withTooltip("knightsnmages.tooltip.elite_magebloom_seed"));

    public static final RegistryObject<Item> ELITE_SOURCE_GEM = ITEMS.register("elite_source_gem",
            () -> new ModItem(new Item.Properties()).withTooltip("knightsnmages.tooltip.elite_source_gem"));

    public static final RegistryObject<Item> NOBLE_MAGEBLOOM = ITEMS.register("noble_magebloom",
            () -> new ModItem(new Item.Properties()).withTooltip("knightsnmages.tooltip.noble_magebloom"));

    public static final RegistryObject<Item> NOBLE_MAGEBLOOM_FIBER = ITEMS.register("noble_magebloom_fiber",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NOBLE_MAGEBLOOM_SEED = ITEMS.register("noble_magebloom_seed",
            () -> new KNMCropBlockItem(BlocksRegistry.NOBLE_MAGEBLOOM_CROP.get(), new Item.Properties()).withTooltip("knightsnmages.tooltip.noble_magebloom_seed"));

    public static final RegistryObject<Item> NOBLE_SOURCE_GEM = ITEMS.register("noble_source_gem",
            () -> new ModItem(new Item.Properties()).withTooltip("knightsnmages.tooltip.noble_source_gem"));

    public static final RegistryObject<Item> SCARLET_GEM = ITEMS.register("scarlet_gem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CITRIN_GEM = ITEMS.register("citrin_gem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MOONLIGHT_GEM = ITEMS.register("moonlight_gem",
            () -> new Item(new Item.Properties()));


    //* ARMOR ITEMS *//

    public static GeoModel<AnimatedMagicArmor> model;
    public static final RegistryObject<Item> ELITE_MAGE_HELMET = ITEMS.register("elite_mage_helmet",
            () -> new EliteBattleMage(ArmorMaterialsRegistry.ELITE, ArmorItem.Type.HELMET, new Item.Properties(), model));
    public static final RegistryObject<Item> ELITE_MAGE_CHESTPLATE = ITEMS.register("elite_mage_chestplate",
            () -> new EliteBattleMage(ArmorMaterialsRegistry.ELITE, ArmorItem.Type.CHESTPLATE, new Item.Properties(), model));

    public static final RegistryObject<Item> ELITE_MAGE_LEGGINGS = ITEMS.register("elite_mage_leggings",
            () -> new EliteBattleMage(ArmorMaterialsRegistry.ELITE, ArmorItem.Type.LEGGINGS, new Item.Properties(), model));
    public static final RegistryObject<Item> ELITE_MAGE_BOOTS = ITEMS.register("elite_mage_boots",
            () -> new EliteBattleMage(ArmorMaterialsRegistry.ELITE, ArmorItem.Type.BOOTS, new Item.Properties(), model));

    public static final RegistryObject<Item> BLUE_KNIGHT_HELMET = ITEMS.register("blue_knight_helmet",
            () -> new BlueKnight(ArmorMaterialsRegistry.NOBLE, ArmorItem.Type.HELMET, new Item.Properties(), model));
    public static final RegistryObject<Item> BLUE_KNIGHT_CHESTPLATE = ITEMS.register("blue_knight_chestplate",
            () -> new BlueKnight(ArmorMaterialsRegistry.NOBLE, ArmorItem.Type.CHESTPLATE, new Item.Properties(), model));

    public static final RegistryObject<Item> BLUE_KNIGHT_LEGGINGS = ITEMS.register("blue_knight_leggings",
            () -> new BlueKnight(ArmorMaterialsRegistry.NOBLE, ArmorItem.Type.LEGGINGS, new Item.Properties(), model));
    public static final RegistryObject<Item> BLUE_KNIGHT_BOOTS = ITEMS.register("blue_knight_boots",
            () -> new BlueKnight(ArmorMaterialsRegistry.NOBLE, ArmorItem.Type.BOOTS, new Item.Properties(), model));

    //* WEAPONS *//

    public static final RegistryObject<Item> ELITE_WAND = ITEMS.register("elite_wand",
            () -> new KNMWandItem(ItemMaterialsRegistry.NOBLE,5, -3.0f));

    public static final RegistryObject<Item> NOBLE_SWORD = ITEMS.register("noble_sword",
            () -> new KNMSwordItem(ItemMaterialsRegistry.NOBLE,8, -2.4f));

    //* PERK PROVIDERS *//

    public static void registerPerkProviders(){
        PerkRegistry.registerPerkProvider(ELITE_MAGE_HELMET.get(), stack -> new ArmorPerkHolder(stack, Arrays.asList(
                List.of(PerkSlot.ONE),
                Arrays.asList(PerkSlot.ONE, PerkSlot.ONE),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO, PerkSlot.TWO)
        )));
        PerkRegistry.registerPerkProvider(ELITE_MAGE_CHESTPLATE.get(), stack -> new ArmorPerkHolder(stack, Arrays.asList(
                List.of(PerkSlot.ONE),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO, PerkSlot.THREE)
        )));
        PerkRegistry.registerPerkProvider(ELITE_MAGE_LEGGINGS.get(), stack -> new ArmorPerkHolder(stack, Arrays.asList(
                List.of(PerkSlot.ONE),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO, PerkSlot.THREE)
        )));
        PerkRegistry.registerPerkProvider(ELITE_MAGE_BOOTS.get(), stack -> new ArmorPerkHolder(stack, Arrays.asList(
                List.of(PerkSlot.ONE),
                Arrays.asList(PerkSlot.ONE, PerkSlot.ONE),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO, PerkSlot.TWO)
        )));

        PerkRegistry.registerPerkProvider(BLUE_KNIGHT_HELMET.get(), stack -> new ArmorPerkHolder(stack, Arrays.asList(
                List.of(PerkSlot.ONE),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO),
                Arrays.asList(PerkSlot.ONE, PerkSlot.ONE, PerkSlot.TWO)
        )));
        PerkRegistry.registerPerkProvider(BLUE_KNIGHT_CHESTPLATE.get(), stack -> new ArmorPerkHolder(stack, Arrays.asList(
                List.of(PerkSlot.TWO),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO, PerkSlot.THREE)
        )));
        PerkRegistry.registerPerkProvider(BLUE_KNIGHT_LEGGINGS.get(), stack -> new ArmorPerkHolder(stack, Arrays.asList(
                List.of(PerkSlot.ONE),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO),
                Arrays.asList(PerkSlot.ONE, PerkSlot.ONE, PerkSlot.TWO)
        )));
        PerkRegistry.registerPerkProvider(BLUE_KNIGHT_BOOTS.get(), stack -> new ArmorPerkHolder(stack, Arrays.asList(
                List.of(PerkSlot.ONE),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO),
                Arrays.asList(PerkSlot.ONE, PerkSlot.ONE, PerkSlot.TWO)
        )));
    }

    public static final RegistryObject<Item> BLANK_ELITE_THREAD = ITEMS.register("blank_elite_thread",
            () -> new BlankElitePerkItem(new Item.Properties()));

    public static void registerPerks() {
        APIRegistry.registerPerk(NoblePerk.INSTANCE);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
