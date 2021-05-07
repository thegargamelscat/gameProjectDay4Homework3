package gameProject.business.concretes;

import gameProject.business.abstracts.CampaignService;
import gameProject.dataAccess.abstracts.CampaignDao;
import gameProject.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {

	private CampaignDao campaignDao;

	public CampaignManager(CampaignDao campaignDao) {
		super();
		this.campaignDao = campaignDao;

	}

	@Override
	public void add(Campaign campaign) {
		System.out.println("CampaignManager.add()");

		System.out.println(campaign.getCampaignName() + " ile alýnabilcek oyunlar : ");
		for (String gameName : campaign.getDiscountGamesName()) {
			System.err.println(gameName);
		}

		this.campaignDao.add(campaign);
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("CampaignManager.delete()");
		this.campaignDao.delete(campaign);
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("CampaignManager.update()");
		this.campaignDao.update(campaign);
	}
}
