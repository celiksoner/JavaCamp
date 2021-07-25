package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface GameSaleService {

	void Sell(Player player, Game game,Campaign campaign);
	
	
}
