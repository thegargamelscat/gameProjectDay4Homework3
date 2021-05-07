package gameProject.business.abstracts;

import gameProject.entities.concretes.Campaign;
import gameProject.entities.concretes.Game;
import gameProject.entities.concretes.User;

public interface SaleService {
	void sale(User user,Game game);
	void campaignSale(User user,Game game,Campaign campaign);

}
