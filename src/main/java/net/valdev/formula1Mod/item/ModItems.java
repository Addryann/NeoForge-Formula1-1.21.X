package net.valdev.formula1Mod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.valdev.formula1Mod.Formula1Mod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Formula1Mod.MOD_ID);

    public static final DeferredItem<Item> FORMULACOIN = ITEMS.register("formulacoin",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
