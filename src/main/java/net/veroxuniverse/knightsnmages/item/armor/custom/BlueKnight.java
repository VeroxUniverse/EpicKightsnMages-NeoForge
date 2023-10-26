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
import net.veroxuniverse.knightsnmages.item.armor.client.renderer.BlueKnightRenderer;
import net.veroxuniverse.knightsnmages.item.armor.client.renderer.EliteBattleMageRenderer;
import net.veroxuniverse.knightsnmages.registry.ItemsRegistry;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.Animation;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.model.GeoModel;

import javax.annotation.Nullable;
import java.util.Set;
import java.util.function.Consumer;

public class BlueKnight extends KNMArmorItem {
    public BlueKnight(ArmorMaterial materialIn, Type slot, Properties builder, GeoModel<AnimatedMagicArmor> model) {
        super(materialIn, slot, builder, model);
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
            consumer.accept(new IClientItemExtensions() {
                private BlueKnightRenderer renderer;

                @Override
                public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack,
                                                                       EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
                    if (this.renderer == null)
                        this.renderer = new BlueKnightRenderer();

                    this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);
                    return this.renderer;
                }
            });

    }

    @Override
    public @Nullable String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        //return new ResourceLocation(KnightsnMages.MOD_ID, "textures/models/armor/ars_nouveau/elite_mage_armor_textures_" + this.getColor(stack) + ".png").toString();
        return new ResourceLocation(KnightsnMages.MOD_ID, "textures/armor/blue_knight_armor_textures_eyes.png").toString();
    }

}
