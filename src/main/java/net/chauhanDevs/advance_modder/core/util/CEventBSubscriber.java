package net.chauhanDevs.advance_modder.core.util;

import net.chauhanDevs.advance_modder.advance_gun_mod;
import net.chauhanDevs.advance_modder.client.keyBindingsInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = advance_gun_mod.ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CEventBSubscriber {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event){
        keyBindingsInit.register(event);
    }
}
