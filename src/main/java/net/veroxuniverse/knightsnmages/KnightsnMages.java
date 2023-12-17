package net.veroxuniverse.knightsnmages;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.veroxuniverse.knightsnmages.compat.ATMCompat;
import net.veroxuniverse.knightsnmages.registry.BlocksRegistry;
import net.veroxuniverse.knightsnmages.registry.CreativeTabRegistry;
import net.veroxuniverse.knightsnmages.registry.ItemsRegistry;
import org.slf4j.Logger;
import software.bernie.geckolib.GeckoLib;

@Mod(KnightsnMages.MOD_ID)
public class KnightsnMages
{

    public static final String MOD_ID = "knightsnmages";
    private static final Logger LOGGER = LogUtils.getLogger();

    public KnightsnMages()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        GeckoLib.initialize();
        ItemsRegistry.register(modEventBus);
        ItemsRegistry.registerPerks();
        BlocksRegistry.register(modEventBus);
        CreativeTabRegistry.register(modEventBus);
        //* LOOT MODIFIERS *//
        //ModLootModifiers.register(modEventBus);

        if(ModList.get().isLoaded("allthemodium")) {
            ATMCompat.register(modEventBus);
        }

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

    }

    public static ResourceLocation prefix(String path) {
        return new ResourceLocation(KnightsnMages.MOD_ID, path);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM COMMON SETUP");
        ItemsRegistry.registerPerkProviders();

        if(ModList.get().isLoaded("allthemodium")) {
            ATMCompat.registerPerkProviders();
        }
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("HELLO from server starting");
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            LOGGER.info("HELLO FROM CLIENT SETUP");

            //* CUSTOM PROPERTIES *//
            event.enqueueWork(() -> {
                //ModItemProperties.addCustomItemProperties();
            });

        }
    }
}

