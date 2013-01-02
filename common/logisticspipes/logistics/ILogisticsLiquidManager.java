package logisticspipes.logistics;

import java.util.List;
import java.util.UUID;

import logisticspipes.routing.IRouter;
import logisticspipes.utils.Pair;
import net.minecraftforge.liquids.LiquidStack;

public interface ILogisticsLiquidManager {
	public Pair<UUID, Integer> getBestReply(LiquidStack stack, IRouter sourceRouter, List<UUID> jamList);
}
