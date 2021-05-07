package gameProject.dataAccess.abstracts;

import gameProject.entities.concretes.Game;
import gameProject.entities.concretes.User;

public interface SaleDao {
	void add(User user,Game game);
}
