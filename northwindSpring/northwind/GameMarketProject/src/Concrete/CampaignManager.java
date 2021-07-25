package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void Add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyas� sisteme eklendi.");		
	}

	@Override
	public void Update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanya bilgileri g�ncellendi.");	
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyas� sistemden silindi.");	
	}

}
