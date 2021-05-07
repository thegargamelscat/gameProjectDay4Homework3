package gameProject.business.concretes;

import gameProject.business.abstracts.SaleService;
import gameProject.dataAccess.abstracts.SaleDao;
import gameProject.entities.concretes.Campaign;
import gameProject.entities.concretes.Game;
import gameProject.entities.concretes.User;

public class SaleManager implements SaleService {
	
	private SaleDao saleDao;
	
	
	public SaleManager(SaleDao saleDao) {
		super();
		this.saleDao = saleDao;
	}

	@Override
	public void sale(User user, Game game) {
		System.out.println("SaleManager.sale()");
		System.err.println(game.getGameName()+ " adlý oyun " + game.getUnitPrice()+ " tl'ye " + user.getFirstName()+" adlý kullnýcýya satýlmýþtýr.");
		this.saleDao.add(user, game);
	}

	@Override
	public void campaignSale(User user, Game game, Campaign campaign) {
		System.out.println("SaleManager.campaignSale()");
		System.err.println(game.getGameName()+" adlý oyun "+((game.getUnitPrice()- game.getUnitPrice() * campaign.getDiscountRate())+" tl'ye " + user.getFirstName() +" adlý kullnýcýya satýlmýþtýr." ));
		this.saleDao.add(user, game);
	}

}
