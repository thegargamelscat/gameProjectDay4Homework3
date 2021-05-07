package gameProject.dataAccess.concretes;

import gameProject.dataAccess.abstracts.GameDao;
import gameProject.entities.concretes.Game;

public class HibernateGameDao implements GameDao {

	@Override
	public void add(Game game) {
		System.out.println("HibernateGameDao.add()");
		System.err.println("Db oyun eklendi: "+ game.getGameName());

	}

	@Override
	public void update(Game game) {
		System.out.println("HibernateGameDao.update()");
		System.err.println("Db oyun güncellendi: " + game.getGameName());
	}

	@Override
	public void delete(Game game) {
		System.out.println("HibernateGameDao.delete()");
		System.err.println("Db oyun silindi: " + game.getGameName());
	}

	

}
