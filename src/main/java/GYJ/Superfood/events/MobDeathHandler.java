package GYJ.Superfood.events;

import java.util.Random;

import GYJ.Superfood.init.ItemInit;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class MobDeathHandler {
    private static final float DROP_CHANCE = 0.2F; // 20%掉落概率

    @SubscribeEvent
    public static void onEntityDeath(LivingDropsEvent event) {
        LivingEntity entity = event.getEntityLiving();
        DamageSource source = event.getSource();

        // 检查是否为敌对生物且由玩家击杀
        if (entity instanceof Monster && source.getEntity() instanceof Player) {
            Random random = new Random();
            if (random.nextFloat() <= DROP_CHANCE) {
                ItemStack superFood = new ItemStack(ItemInit.SUPER_FOOD.get());
                entity.level.addFreshEntity(new ItemEntity(
                    entity.level, 
                    entity.getX(), 
                    entity.getY(), 
                    entity.getZ(), 
                    superFood
                ));
            }
        }
    }
}
