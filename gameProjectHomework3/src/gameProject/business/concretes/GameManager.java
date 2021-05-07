package gameProject.business.concretes;

import gameProject.business.abstracts.GameService;
import gameProject.dataAccess.abstracts.GameDao;
import gameProject.entities.concretes.Game;

public class GameManager implements GameService {

	private GameDao gameDao;
	
	public GameManager(GameDao gameDao) {
		super();
		this.gameDao = gameDao;
	}

	@Override
	public void add(Game game) {
		System.out.println("GameManager.add()");
		this.gameDao.add(game);
	}

	@Override
	public void update(Game game) {
		System.out.println("GameManager.update()");
		this.gameDao.update(game);
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("GameManager.delete()");
		this.gameDao.delete(game);
		
	}
}
