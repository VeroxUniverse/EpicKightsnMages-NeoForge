package net.veroxuniverse.knightsnmages.item.armor.custom;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.hollingsworth.arsnouveau.api.perk.IPerk;
import com.hollingsworth.arsnouveau.api.perk.IPerkHolder;
import com.hollingsworth.arsnouveau.api.perk.PerkAttributes;
import com.hollingsworth.arsnouveau.api.perk.PerkInstance;
import com.hollingsworth.arsnouveau.api.util.PerkUtil;
import com.hollingsworth.arsnouveau.common.armor.AnimatedMagicArmor;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.veroxuniverse.knightsnmages.KnightsnMages;
import net.veroxuniverse.knightsnmages.item.armor.KNMArmorItem;
import net.veroxuniverse.knightsnmages.item.armor.client.renderer.DarkKnightRenderer;
import net.veroxuniverse.knightsnmages.item.armor.client.renderer.EliteBattleMageRenderer;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.model.GeoModel;

import javax.annotation.Nullable;
import java.util.UUID;
import java.util.function.Consumer;

public class DarkKnight extends KNMArmorItem {
    public DarkKnight(ArmorMaterial materialIn, Type slot, Properties builder, GeoModel<AnimatedMagicArmor> model) {
        super(materialIn, slot, builder, model);
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
            consumer.accept(new IClientItemExtensions() {
                private DarkKnightRenderer renderer;

                @Override
                public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack,
                                                                       EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
                    if (this.renderer == null)
                        this.renderer = new DarkKnightRenderer();

                    this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);
                    return this.renderer;
                }
            });

    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot pEquipmentSlot, ItemStack stack) {
        ImmutableMultimap.Builder<Attribute, AttributeModifier> attributes = new ImmutableMultimap.Builder<>();
        attributes.putAll(super.getDefaultAttributeModifiers(pEquipmentSlot));
        if (this.type.getSlot() == pEquipmentSlot) {
            UUID uuid = ARMOR_MODIFIER_UUID_PER_TYPE.get(type);
            IPerkHolder<ItemStack> perkHolder = PerkUtil.getPerkHolder(stack);
            if (perkHolder != null) {
                attributes.put(PerkAttributes.MAX_MANA.get(), new AttributeModifier(uuid, "max_mana_armor", 30 * (perkHolder.getTier() + 1), AttributeModifier.Operation.ADDITION));
                attributes.put(PerkAttributes.MANA_REGEN_BONUS.get(), new AttributeModifier(uuid, "mana_regen_armor", perkHolder.getTier() + 2, AttributeModifier.Operation.ADDITION));
                for (PerkInstance perkInstance : perkHolder.getPerkInstances()) {
                    IPerk perk = perkInstance.getPerk();
                    attributes.putAll(perk.getModifiers(this.type.getSlot(), stack, perkInstance.getSlot().value));
                }

            }
        }
        return attributes.build();
    }


    @Override
    public @Nullable String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        return new ResourceLocation(KnightsnMages.MOD_ID, "textures/armor/dark_knight_armor_textures.png").toString();
    }

}
