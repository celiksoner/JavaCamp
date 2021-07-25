import java.rmi.RemoteException;
import Abstract.PlayerCheckService;
import Adapter.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GameSaleManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		//Oyuncu Ekleme
		Player player1 = new Player(1,"Soner","Çelik","123456789",1994);
		//Oyun EKleme
		Game game1 = new Game(1,"Battlefield 1",400);
		//Kampanya ekleme
		Campaign campaign1 = new Campaign(1,"Black Friday",15);
		
		
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.Add(player1);			
		
		
		GameManager gameManager = new GameManager();
		gameManager.Add(game1);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.Add(campaign1);
		
		PlayerCheckService playerCheckService = new MernisServiceAdapter(); 

		
		GameSaleManager gameSaleManager = new GameSaleManager();
		if( playerCheckService.CheckIfRealPlayer(player1) == true) {
		gameSaleManager.Sell(player1, game1, campaign1);
		}else {
			System.out.println("Kullanýcý doðrulanamadýðý için oyun satýþý gerçekleþtirilemedi.");
		}
			

	}

}
