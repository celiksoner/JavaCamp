package Entities;

public class Campaign {
	private int campaingId;
	private String campaignName;
	private int campaignDiscount;
	
	
	public Campaign() {
	}


	public Campaign(int campaingId, String campaignName, int campaignDiscount) {
		this.campaingId = campaingId;
		this.campaignName = campaignName;
		this.campaignDiscount = campaignDiscount;
	}


	public int getCampaingId() {
		return campaingId;
	}


	public void setCampaingId(int campaingId) {
		this.campaingId = campaingId;
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}


	public int getCampaignDiscount() {
		return campaignDiscount;
	}


	public void setCampaignDiscount(int campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}
	
	

}
