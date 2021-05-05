package Abstract;

import Entity.Campaign;

public abstract class BaseCampignService implements CampaignServices {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi : "+campaign.getCampaignNmae());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi :"+campaign.getCampaignNmae());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi :"+campaign.getCampaignNmae());
		
	}
	

	
}
