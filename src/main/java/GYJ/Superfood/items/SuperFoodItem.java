package GYJ.Superfood.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;


public class SuperFoodItem extends Item {
    public SuperFoodItem(Properties properties) {
        super(new Item.Properties()
                .tab(CreativeModeTab.TAB_FOOD) // 物品栏分类
                .food(new FoodProperties.Builder()
                        .nutrition(20) // 饱食度
                        .saturationMod(20.0F) // 饱和度
                        .alwaysEat() // 允许随时食用（即使饱食度满）

                        .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 2400, 2), 1.0F)
                        .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 2), 1.0F)
                        .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2400, 2), 1.0F)
                        .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 2400, 2), 1.0F)
                        .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 2400, 2), 1.0F)
                        .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 2400, 2), 1.0F)
                        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 2), 1.0F)
                        .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2400, 2), 1.0F)
                        .effect(() -> new MobEffectInstance(MobEffects.INVISIBILITY, 2400, 2), 1.0F)
                        .effect(() -> new MobEffectInstance(MobEffects.JUMP, 2400, 2), 1.0F)
                        .effect(() -> new MobEffectInstance(MobEffects.LUCK, 2400, 2), 1.0F)
                        .effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 2400, 2), 1.0F)
                        .effect(() -> new MobEffectInstance(MobEffects.CONDUIT_POWER, 2400, 2), 1.0F)
                        .effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 2400, 2), 1.0F)
                        .effect(() -> new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 2400, 2), 1.0F)
                        .effect(() -> new MobEffectInstance(MobEffects.SATURATION, 2400, 2), 1.0F)
                        .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 2400, 3), 1.0F)
                        .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 2), 1.0F)
                        .effect(() -> new MobEffectInstance(MobEffects.HEAL, 1, 8), 1.0F)
                        
                        .build()
                )
        );
    }
}
