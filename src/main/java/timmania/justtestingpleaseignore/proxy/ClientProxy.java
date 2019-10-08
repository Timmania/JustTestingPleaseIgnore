package timmania.justtestingpleaseignore.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import timmania.justtestingpleaseignore.JustTestingPleaseIgnore;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(JustTestingPleaseIgnore.MODID + ":" + id, "inventory"));
    }
}
