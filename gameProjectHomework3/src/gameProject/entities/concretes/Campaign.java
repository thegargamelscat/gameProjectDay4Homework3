package gameProject.entities.concretes;

import java.util.List;

public class Campaign {
	private int id;
	private String campaignName;
	private double discountRate;
	private List<String> discountGamesName;
	
	public Campaign() {
		super();
	}
	public Campaign(int id, String campaignName, double discountRate,List<String> discountGamesName) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountRate = discountRate;
		this.discountGamesName = discountGamesName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public List<String> getDiscountGamesName() {
		return discountGamesName;
	}
	public void setDiscountGamesId(List<String>discountGamesName) {
		this.discountGamesName = discountGamesName;
	}
	
	

}
