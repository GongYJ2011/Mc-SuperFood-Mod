package GYJ.Superfood;
import GYJ.Superfood.events.MobDeathHandler;
import GYJ.Superfood.init.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("superfooditem")
public class SuperFood {
    public static final String MOD_ID = "superfooditem"; // 必须定义
    
    public SuperFood() {
        // 初始化物品注册
        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(MobDeathHandler.class);
    }
}