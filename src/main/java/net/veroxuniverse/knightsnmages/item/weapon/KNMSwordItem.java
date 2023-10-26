package net.veroxuniverse.knightsnmages.item.weapon;

import com.hollingsworth.arsnouveau.api.item.ICasterTool;
import com.hollingsworth.arsnouveau.api.mana.IManaDiscountEquipment;
import com.hollingsworth.arsnouveau.common.items.EnchantersSword;
import net.minecraft.world.item.Tier;

public class KNMSwordItem extends EnchantersSword implements ICasterTool, IManaDiscountEquipment {
    public KNMSwordItem(Tier iItemTier, int baseDamage, float baseAttackSpeed) {
        super(iItemTier, baseDamage, baseAttackSpeed);
    }

}
