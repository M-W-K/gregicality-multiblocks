package gregicality.multiblocks.api.fluids.fluidType;

import gregtech.api.fluids.fluidType.FluidTypeLiquid;
import net.minecraftforge.fluids.Fluid;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FluidTypeMolten extends FluidTypeLiquid {

    public FluidTypeMolten(@NotNull String name, @Nullable String prefix, @Nullable String suffix, @NotNull String localization) {
        super(name, prefix, suffix, localization);
    }

    @Override
    protected void setFluidProperties(@NotNull Fluid fluid) {
        super.setFluidProperties(fluid);
    }
}
