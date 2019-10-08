package timmania.justtestingpleaseignore;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.handshake.ChannelRegistrationHandler;
import org.apache.logging.log4j.Logger;
import timmania.justtestingpleaseignore.item.ModItems;
import timmania.justtestingpleaseignore.proxy.CommonProxy;

@Mod(modid = JustTestingPleaseIgnore.MODID, name = JustTestingPleaseIgnore.NAME, version = JustTestingPleaseIgnore.VERSION)
public class JustTestingPleaseIgnore
{
    public static final String MODID = "jtpi";
    public static final String NAME = "Just Testing Please Ignore";
    public static final String VERSION = "1.0";
    public static final String MC_VERSION = "[1.12.2]";

    @SidedProxy(serverSide = "timmania.justtestingpleaseignore.proxy.CommonProxy", clientSide = "timmania.justtestingpleaseignore.proxy.ClientProxy")
    public static CommonProxy proxy;

    private static Logger logger;

    @Mod.EventBusSubscriber
    public static class RegistrationHandler{

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event){
            ModItems.register(event.getRegistry());
        }
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @EventHandler
    public void init(FMLInitializationEvent event){

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
