package timmania.justtestingpleaseignore.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import timmania.justtestingpleaseignore.JustTestingPleaseIgnore;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(JustTestingPleaseIgnore.MODID)
public class ModItems {

    public static final Item FIRST_ITEM = null;

    @EventBusSubscriber(modid = JustTestingPleaseIgnore.MODID)
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerItems(Register<Item> event) {
            final Item[] items = {
                    new Item().setRegistryName(JustTestingPleaseIgnore.MODID, "first_item").setCreativeTab(CreativeTabs.MISC)
            };

            event.getRegistry().registerAll(items);
        }
    }
}
