package gameProject.dataAccess.concretes;

import gameProject.dataAccess.abstracts.CampaignDao;
import gameProject.entities.concretes.Campaign;

public class HibernateCampignDao implements CampaignDao {

	@Override
	public void add(Campaign campaign) {
		System.out.println("HibernateCampignDao.add()");
		System.err.println("db eklendi: " + campaign.getCampaignName());

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("HibernateCampignDao.update()");
		System.err.println("db güncellendi: " + campaign.getCampaignName());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("HibernateCampignDao.delete()");
		System.err.println("db silindi: " + campaign.getCampaignName());

	}
}
