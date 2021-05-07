package gameProject.dataAccess.concretes;

import gameProject.dataAccess.abstracts.SaleDao;
import gameProject.entities.concretes.Game;
import gameProject.entities.concretes.User;

public class HibernateSaleDao implements SaleDao{

	@Override
	public void add(User user, Game game) {
		System.out.println("HibernateSaleDao.add()");
		System.err.println("Sat�� bilgileri db eklendi: " + " Kullan�c� Id :"+user.getId() +" Oyun Id:"+ game.getId());
	}

}
