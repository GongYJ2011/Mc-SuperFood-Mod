package GYJ.Superfood.init;
import GYJ.Superfood.SuperFood;
import GYJ.Superfood.items.SuperFoodItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SuperFood.MOD_ID);
    
    public static final RegistryObject<Item> SUPER_FOOD = ITEMS.register("super_food", 
        () -> new SuperFoodItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD))
    );
}