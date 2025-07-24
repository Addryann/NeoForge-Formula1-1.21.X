package net.valdev.formula1Mod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.valdev.formula1Mod.Formula1Mod;

import java.util.function.Supplier;



public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Formula1Mod.MOD_ID);

    public static final Supplier<CreativeModeTab> FORMULA_ONE_ITEMS_TAB = CREATIVE_MODE_TAB.register("formula_one_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FORMULACOIN.get()))
                    .title(Component.translatable("creativetab.formula1mod.formula_one_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.FORMULACOIN);

                    })

                    .build());

    /*public static final Supplier<CreativeModeTab> FORMULA_ONE_ITEMS_TAB = CREATIVE_MODE_TAB.register("formula_one_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FORMULACOIN.get()))
                    .title(Component.translatable("creativetab.formula1mod.formula_one_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.FORMULACOIN);

                    })

                    .build());

     */

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
