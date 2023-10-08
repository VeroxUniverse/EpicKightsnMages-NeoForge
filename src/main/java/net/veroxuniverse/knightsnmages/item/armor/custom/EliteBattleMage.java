package net.veroxuniverse.knightsnmages.item.armor.custom;

import com.hollingsworth.arsnouveau.common.armor.AnimatedMagicArmor;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.veroxuniverse.knightsnmages.KnightsnMages;
import net.veroxuniverse.knightsnmages.item.armor.KNMArmorItem;
import net.veroxuniverse.knightsnmages.item.armor.client.renderer.EliteBattleMageRenderer;
import net.veroxuniverse.knightsnmages.registry.ItemsRegistry;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.constant.DefaultAnimations;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.Animation;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.model.GeoModel;

import javax.annotation.Nullable;
import java.util.Set;
import java.util.function.Consumer;

public class EliteBattleMage extends KNMArmorItem {
    public EliteBattleMage(ArmorMaterial materialIn, Type slot, Properties builder, GeoModel<AnimatedMagicArmor> model) {
        super(materialIn, slot, builder, model);
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
            consumer.accept(new IClientItemExtensions() {
                private EliteBattleMageRenderer renderer;

                @Override
                public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack,
                                                                       EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
                    if (this.renderer == null)
                        this.renderer = new EliteBattleMageRenderer();

                    this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);
                    return this.renderer;
                }
            });

    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, 20, state -> {
            state.setAnimation(RawAnimation.begin().then("animation.elite_mage.idle", Animation.LoopType.LOOP));

            Entity entity = state.getData(DataTickets.ENTITY);

            if (entity instanceof ArmorStand)
                return PlayState.CONTINUE;

            Set<Item> wornArmor = new ObjectOpenHashSet<>();

            for (ItemStack stack : entity.getArmorSlots()) {
                if (stack.isEmpty())
                    return PlayState.STOP;

                wornArmor.add(stack.getItem());
            }
            boolean isFullSet = wornArmor.containsAll(ObjectArrayList.of(
                    ItemsRegistry.ELITE_MAGE_HELMET.get(),
                    ItemsRegistry.ELITE_MAGE_CHESTPLATE.get(),
                    ItemsRegistry.ELITE_MAGE_LEGGINGS.get(),
                    ItemsRegistry.ELITE_MAGE_BOOTS.get()));

            return isFullSet ? PlayState.CONTINUE : PlayState.STOP;
        }));
    }


    @Override
    public @Nullable String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        //return new ResourceLocation(KnightsnMages.MOD_ID, "textures/models/armor/ars_nouveau/elite_mage_armor_textures_" + this.getColor(stack) + ".png").toString();
        return new ResourceLocation(KnightsnMages.MOD_ID, "textures/armor/elite_mage_armor_textures.png").toString();
    }

}
