package net.veroxuniverse.knightsnmages.registry;

import com.hollingsworth.arsnouveau.api.perk.ArmorPerkHolder;
import com.hollingsworth.arsnouveau.api.perk.PerkSlot;
import com.hollingsworth.arsnouveau.api.registry.PerkRegistry;
import com.hollingsworth.arsnouveau.common.armor.AnimatedMagicArmor;
import com.hollingsworth.arsnouveau.common.armor.Materials;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.veroxuniverse.knightsnmages.KnightsnMages;
import net.veroxuniverse.knightsnmages.item.armor.custom.EliteBattleMage;
import software.bernie.geckolib.model.GeoModel;

import java.util.Arrays;
import java.util.List;

public class ItemsRegistry {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KnightsnMages.MOD_ID);

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
    }

    //* ITEMS *//

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


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
