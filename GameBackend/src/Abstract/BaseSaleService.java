package Abstract;

import Entity.Customer;
import Entity.Order;

public abstract class BaseSaleService implements SaleService {

	@Override
	public void sale(Order order) {
		if(order.getCampaign()!=null) {
			System.out.println("Oyun sat�n al�nd� : \n"
					+"Oyun ad� : "+order.getGame().getName()+"\n"
					+"Oyunun fiyat� : "+order.getGame().getPrice()+"\n"
					+"Oyunu alan kullan�c� : "+order.getCustomer().getFirstName()+"\n"
					+"Kampanya : "+order.getCampaign().getCampaignNmae());
			
		}
		else {
			System.out.println("Oyun sat�n al�nd� : \n"
					+"Oyun ad� : "+order.getGame().getName()+"\n"
					+"Oyunun fiyat� : "+order.getGame().getPrice()+"\n"
					+"Oyunu alan kullan�c� : "+order.getCustomer().getFirstName());
		}
	}
}
