package Concrete;

import java.rmi.RemoteException;

import Abstract.PlayerCheckService;
import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService {
	
	PlayerCheckService playerCheckService;

	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void Add(Player player) throws NumberFormatException, RemoteException {
		if(playerCheckService.CheckIfRealPlayer(player)){
			System.out.println(player.getFirstName() + " oyuncusu sisteme eklendi.");
		}else {
			System.out.println("Hatal� kullan�c� giri�i");
			Delete(player);
		}		
				
	}

	@Override
	public void Update(Player player) {
		System.out.println(player.getFirstName() + " oyuncusunun bilgileri g�ncellendi.");	
	}

	@Override
	public void Delete(Player player) {
		System.out.println(player.getFirstName() + " oyuncusu sistemden silindi.");
	}

}
