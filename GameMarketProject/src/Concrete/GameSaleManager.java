package Concrete;

import Abstract.GameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameSaleManager implements GameSaleService{

	@Override
	public void Sell(Player player, Game game, Campaign campaign) {
		double fiyat = game.getGamePrice() - (game.getGamePrice() * campaign.getCampaignDiscount() / 100 ); 
		
		System.out.println(player.getFirstName() + " oyuncusuna " + game.getGamePrice() + " de�erindeki " + game.getGameName() + " adl� oyun " + campaign.getCampaignName() + " kampanyas� kapsam�nda y�zde " + 
		campaign.getCampaignDiscount() + " indirimle " + fiyat + " fiyat�na sat�lm��t�r.");
		
	}

}
