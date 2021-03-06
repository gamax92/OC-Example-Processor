package li.cil.oc.example.processor;

import li.cil.oc.api.driver.EnvironmentHost;
import li.cil.oc.api.driver.item.Processor;
import li.cil.oc.api.driver.item.Slot;
import li.cil.oc.api.machine.Architecture;
import li.cil.oc.api.network.ManagedEnvironment;
import li.cil.oc.api.prefab.DriverItem;
import net.minecraft.item.ItemStack;

public class DriverPseudoProcessor extends DriverItem implements Processor {
    protected DriverPseudoProcessor() {
        super(new ItemStack(ModExampleProcessor.cpuPseudoProcessor));
    }

    // We want our item to be a cpu component, i.e. it can be placed into
    // computers' cpu slots.

    @Override
    public String slot(ItemStack stack) {
        return Slot.CPU;
    }

    @Override
    public ManagedEnvironment createEnvironment(ItemStack stack, EnvironmentHost host) {
        return null;
    }

    @Override
    public int supportedComponents(ItemStack stack) {
        if (stack.getItem() instanceof ItemPseudoProcessor)
            return 16;
        return 0;
    }

    @Override
    public Class<? extends Architecture> architecture(ItemStack stack) {
        if (stack.getItem() instanceof ItemPseudoProcessor)
            return PseudoArchitecture.class;
        return null;
    }
}
