package Abstract;

import Entity.Customer;
import Entity.Order;

public abstract class BaseSaleService implements SaleService {

	@Override
	public void sale(Order order) {
		if(order.getCampaign()!=null) {
			System.out.println("Oyun satýn alýndý : \n"
					+"Oyun adý : "+order.getGame().getName()+"\n"
					+"Oyunun fiyatý : "+order.getGame().getPrice()+"\n"
					+"Oyunu alan kullanýcý : "+order.getCustomer().getFirstName()+"\n"
					+"Kampanya : "+order.getCampaign().getCampaignNmae());
			
		}
		else {
			System.out.println("Oyun satýn alýndý : \n"
					+"Oyun adý : "+order.getGame().getName()+"\n"
					+"Oyunun fiyatý : "+order.getGame().getPrice()+"\n"
					+"Oyunu alan kullanýcý : "+order.getCustomer().getFirstName());
		}
	}
}
