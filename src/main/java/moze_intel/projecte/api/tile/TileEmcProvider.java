package moze_intel.projecte.api.tile;

import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;

import javax.annotation.Nonnull;

/**
 * Reference implementation for IEMCProvider
 *
 * @author williewillus
 */
public class TileEmcProvider extends TileEmcBase implements IEmcProvider
{
	public TileEmcProvider(TileEntityType<?> type)
	{
		super(type);
	}

	@Override
	public double provideEMC(@Nonnull Direction side, double toExtract)
	{
		double toRemove = Math.min(currentEMC, toExtract);
		removeEMC(toRemove);
		return toRemove;
	}
}