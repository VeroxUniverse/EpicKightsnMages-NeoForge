package net.veroxuniverse.knightsnmages.item.perk;

import com.google.common.collect.Multimap;
import com.hollingsworth.arsnouveau.api.perk.IEffectResolvePerk;
import com.hollingsworth.arsnouveau.api.perk.Perk;
import com.hollingsworth.arsnouveau.api.perk.PerkInstance;
import com.hollingsworth.arsnouveau.api.perk.PerkSlot;
import com.hollingsworth.arsnouveau.api.spell.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.veroxuniverse.knightsnmages.KnightsnMages;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class NoblePerk extends Perk implements IEffectResolvePerk {

    public static NoblePerk INSTANCE = new NoblePerk(new ResourceLocation(KnightsnMages.MOD_ID, "thread_noble"));
    public static final UUID PERK_UUID = UUID.fromString("e49748e8-d0c4-497a-b35c-a943b4113003");
    public NoblePerk(ResourceLocation key) {
        super(key);
    }

    @Override
    public String getLangDescription() {
        return "The incoming damage is decreased for a small amount.";
    }

    @Override
    public String getLangName() {
        return "Noble";
    }

    @Override
    public PerkSlot minimumSlot() {
        return PerkSlot.THREE;
    }

    @Override
    public void onPreResolve(HitResult rayTraceResult, Level world, LivingEntity shooter, SpellStats spellStats, SpellContext spellContext, SpellResolver resolver, AbstractEffect effect, PerkInstance perkInstance) {
        // If the effect is a damage effect, the raytrace result is a living entity, and the entity hit is not the shooter, then apply slowness or weakness.
        if (effect instanceof IDamageEffect damageEffect && rayTraceResult instanceof EntityHitResult entityHitResult && entityHitResult.getEntity() instanceof LivingEntity livingEntity && livingEntity != shooter) {
            if (damageEffect.canDamage(livingEntity, spellStats, spellContext, resolver, entityHitResult.getEntity())) {
                int value = perkInstance.getSlot().value;
                livingEntity.addEffect(new MobEffectInstance(value < 3 ? MobEffects.MOVEMENT_SLOWDOWN : MobEffects.WEAKNESS, value * 5 * 20, value < 3 ? value : 1));
            }
        }
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getModifiers(EquipmentSlot pEquipmentSlot, ItemStack stack, int slotValue) {
        return attributeBuilder().put(Attributes.ARMOR, new AttributeModifier(PERK_UUID, "NoblePerk", 2, AttributeModifier.Operation.ADDITION)).build();
    }

    @Override
    public void onPostResolve(HitResult rayTraceResult, Level world, @NotNull LivingEntity shooter, SpellStats spellStats, SpellContext spellContext, SpellResolver resolver, AbstractEffect effect, PerkInstance perkInstance) {
    }
}
