package Entity;

public class Campaign {
	int campaignId;
	String campaignNmae;
	int discauntRate;
	
	
	public Campaign(int campaignId, String campaignNmae, int discauntRate) {
		super();
		this.campaignId = campaignId;
		this.campaignNmae = campaignNmae;
		this.discauntRate = discauntRate;
	}
	
	
	public int getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	public String getCampaignNmae() {
		return campaignNmae;
	}
	public void setCampaignNmae(String campaignNmae) {
		this.campaignNmae = campaignNmae;
	}
	public int getDiscauntRate() {
		return discauntRate;
	}
	public void setDiscauntRate(int discauntRate) {
		this.discauntRate = discauntRate;
	}
	
	

}
