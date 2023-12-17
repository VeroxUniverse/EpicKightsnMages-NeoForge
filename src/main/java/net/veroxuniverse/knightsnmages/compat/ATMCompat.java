package net.veroxuniverse.knightsnmages.compat;

import com.hollingsworth.arsnouveau.api.perk.ArmorPerkHolder;
import com.hollingsworth.arsnouveau.api.perk.PerkSlot;
import com.hollingsworth.arsnouveau.api.registry.PerkRegistry;
import com.hollingsworth.arsnouveau.common.armor.AnimatedMagicArmor;
import com.thevortex.allthemodium.material.AArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.veroxuniverse.knightsnmages.KnightsnMages;
import net.veroxuniverse.knightsnmages.item.armor.custom.allthemodium.Allthemodium;
import net.veroxuniverse.knightsnmages.item.armor.custom.allthemodium.Unobtainium;
import net.veroxuniverse.knightsnmages.item.armor.custom.allthemodium.Vibranium;
import software.bernie.geckolib.model.GeoModel;

import java.util.Arrays;
import java.util.List;

public class ATMCompat {
    public static final DeferredRegister<Item> ITEMS_ATM =
            DeferredRegister.create(ForgeRegistries.ITEMS, KnightsnMages.MOD_ID);

    //* ITEMS *//

    //* ARMOR ITEMS *//

    public static GeoModel<AnimatedMagicArmor> model;

    public static final RegistryObject<Item> MAGE_ALLTHEMODIUM_HELMET = ITEMS_ATM.register("mage_allthemodium_helmet",
            () -> new Allthemodium(AArmorMaterial.ALLTHEMODIUM, ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.EPIC).fireResistant(), model));
    public static final RegistryObject<Item> MAGE_ALLTHEMODIUM_CHESTPLATE = ITEMS_ATM.register("mage_allthemodium_chestplate",
            () -> new Allthemodium(AArmorMaterial.ALLTHEMODIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.EPIC).fireResistant(), model));
    public static final RegistryObject<Item> MAGE_ALLTHEMODIUM_LEGGINGS = ITEMS_ATM.register("mage_allthemodium_leggings",
            () -> new Allthemodium(AArmorMaterial.ALLTHEMODIUM, ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.EPIC).fireResistant(), model));
    public static final RegistryObject<Item> MAGE_ALLTHEMODIUM_BOOTS = ITEMS_ATM.register("mage_allthemodium_boots",
            () -> new Allthemodium(AArmorMaterial.ALLTHEMODIUM, ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.EPIC).fireResistant(), model));

    public static final RegistryObject<Item> MAGE_VIBRANIUM_HELMET = ITEMS_ATM.register("mage_vibranium_helmet",
            () -> new Vibranium(AArmorMaterial.VIBRANIUM, ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.EPIC).fireResistant(), model));
    public static final RegistryObject<Item> MAGE_VIBRANIUM_CHESTPLATE = ITEMS_ATM.register("mage_vibranium_chestplate",
            () -> new Vibranium(AArmorMaterial.VIBRANIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.EPIC).fireResistant(), model));
    public static final RegistryObject<Item> MAGE_VIBRANIUM_LEGGINGS = ITEMS_ATM.register("mage_vibranium_leggings",
            () -> new Vibranium(AArmorMaterial.VIBRANIUM, ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.EPIC).fireResistant(), model));
    public static final RegistryObject<Item> MAGE_VIBRANIUM_BOOTS = ITEMS_ATM.register("mage_vibranium_boots",
            () -> new Vibranium(AArmorMaterial.VIBRANIUM, ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.EPIC).fireResistant(), model));

    public static final RegistryObject<Item> MAGE_UNOBTAINIUM_HELMET = ITEMS_ATM.register("mage_unobtainium_helmet",
            () -> new Unobtainium(AArmorMaterial.UNOBTAINIUM, ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.EPIC).fireResistant(), model));
    public static final RegistryObject<Item> MAGE_UNOBTAINIUM_CHESTPLATE = ITEMS_ATM.register("mage_unobtainium_chestplate",
            () -> new Unobtainium(AArmorMaterial.UNOBTAINIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.EPIC).fireResistant(), model));
    public static final RegistryObject<Item> MAGE_UNOBTAINIUM_LEGGINGS = ITEMS_ATM.register("mage_unobtainium_leggings",
            () -> new Unobtainium(AArmorMaterial.UNOBTAINIUM, ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.EPIC).fireResistant(), model));
    public static final RegistryObject<Item> MAGE_UNOBTAINIUM_BOOTS = ITEMS_ATM.register("mage_unobtainium_boots",
            () -> new Unobtainium(AArmorMaterial.UNOBTAINIUM, ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.EPIC).fireResistant(), model));

    //* PERK PROVIDERS *//

    public static void registerPerkProviders(){
        PerkRegistry.registerPerkProvider(MAGE_ALLTHEMODIUM_HELMET.get(), stack -> new ArmorPerkHolder(stack, Arrays.asList(
                List.of(PerkSlot.ONE),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO),
                Arrays.asList(PerkSlot.ONE, PerkSlot.ONE, PerkSlot.TWO)
        )));
        PerkRegistry.registerPerkProvider(MAGE_ALLTHEMODIUM_CHESTPLATE.get(), stack -> new ArmorPerkHolder(stack, Arrays.asList(
                List.of(PerkSlot.TWO),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO, PerkSlot.THREE)
        )));
        PerkRegistry.registerPerkProvider(MAGE_ALLTHEMODIUM_LEGGINGS.get(), stack -> new ArmorPerkHolder(stack, Arrays.asList(
                List.of(PerkSlot.ONE),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO),
                Arrays.asList(PerkSlot.ONE, PerkSlot.ONE, PerkSlot.TWO)
        )));
        PerkRegistry.registerPerkProvider(MAGE_ALLTHEMODIUM_BOOTS.get(), stack -> new ArmorPerkHolder(stack, Arrays.asList(
                List.of(PerkSlot.ONE),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO),
                Arrays.asList(PerkSlot.ONE, PerkSlot.ONE, PerkSlot.TWO)
        )));

        PerkRegistry.registerPerkProvider(MAGE_VIBRANIUM_HELMET.get(), stack -> new ArmorPerkHolder(stack, Arrays.asList(
                List.of(PerkSlot.ONE),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO),
                Arrays.asList(PerkSlot.ONE, PerkSlot.ONE, PerkSlot.TWO)
        )));
        PerkRegistry.registerPerkProvider(MAGE_VIBRANIUM_CHESTPLATE.get(), stack -> new ArmorPerkHolder(stack, Arrays.asList(
                List.of(PerkSlot.TWO),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO, PerkSlot.THREE)
        )));
        PerkRegistry.registerPerkProvider(MAGE_VIBRANIUM_LEGGINGS.get(), stack -> new ArmorPerkHolder(stack, Arrays.asList(
                List.of(PerkSlot.ONE),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO),
                Arrays.asList(PerkSlot.ONE, PerkSlot.ONE, PerkSlot.TWO)
        )));
        PerkRegistry.registerPerkProvider(MAGE_VIBRANIUM_BOOTS.get(), stack -> new ArmorPerkHolder(stack, Arrays.asList(
                List.of(PerkSlot.ONE),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO),
                Arrays.asList(PerkSlot.ONE, PerkSlot.ONE, PerkSlot.TWO)
        )));

        PerkRegistry.registerPerkProvider(MAGE_UNOBTAINIUM_HELMET.get(), stack -> new ArmorPerkHolder(stack, Arrays.asList(
                List.of(PerkSlot.ONE),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO),
                Arrays.asList(PerkSlot.ONE, PerkSlot.ONE, PerkSlot.TWO)
        )));
        PerkRegistry.registerPerkProvider(MAGE_UNOBTAINIUM_CHESTPLATE.get(), stack -> new ArmorPerkHolder(stack, Arrays.asList(
                List.of(PerkSlot.TWO),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO, PerkSlot.THREE)
        )));
        PerkRegistry.registerPerkProvider(MAGE_UNOBTAINIUM_LEGGINGS.get(), stack -> new ArmorPerkHolder(stack, Arrays.asList(
                List.of(PerkSlot.ONE),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO),
                Arrays.asList(PerkSlot.ONE, PerkSlot.ONE, PerkSlot.TWO)
        )));
        PerkRegistry.registerPerkProvider(MAGE_UNOBTAINIUM_BOOTS.get(), stack -> new ArmorPerkHolder(stack, Arrays.asList(
                List.of(PerkSlot.ONE),
                Arrays.asList(PerkSlot.ONE, PerkSlot.TWO),
                Arrays.asList(PerkSlot.ONE, PerkSlot.ONE, PerkSlot.TWO)
        )));
    }

    public static void register(IEventBus eventBus) {
        ITEMS_ATM.register(eventBus);
    }
}
