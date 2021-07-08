package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void Add(Game game) {
		System.out.println(game.getGameName() + " oyunu sisteme eklendi.");		
	}

	@Override
	public void Update(Game game) {
		System.out.println(game.getGameName() + " oyun bilgileri güncellendi.");	
	}

	@Override
	public void Delete(Game game) {
		System.out.println(game.getGameName() + " oyunu sistemden silindi.");	
	}

}
