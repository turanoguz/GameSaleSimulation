package Main;

import Abstract.BaseCampignService;
import Abstract.BaseCustomerService;
import Abstract.BaseGameService;
import Abstract.BaseSaleService;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Entity.Campaign;
import Entity.Customer;
import Entity.Game;
import Entity.Order;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerService cs= new CustomerManager(new MernisServiceAdapter());
		Customer customer1 = new Customer(1,"Oðuzhan","TURAN","23180575922","1999");
		Customer customer2=new Customer(2,"Engin","DEMÝROÐ","12345678964","1985");
		Customer customer3 = new Customer(3, "Mustafa murat", "COÞKUN", "98765432156", "1986");
		
		
		cs.add(customer1);
		cs.add(customer2);
		cs.add(customer3);
		cs.delete(customer2);
		cs.update(customer3);
		//cs.add(new Customer(2, "ahmet", "BAÞER", "46578912354", "1996"));		
		
		
		
		BaseGameService gameService=new GameManager();
		Game csgo=new Game(1,"CS go",250);
		//gameService.add(new Game(1, "CS Go", 50));
		
		gameService.add(new Game(2,"Pubg",80));
		
		//gameService.update(new Game(1,"CS go",80));
		
		BaseCampignService baseCampignService = new CampaignManager();
		Campaign bahar=new Campaign(1,"Bahar kampanyasý",20);
		baseCampignService.add(new Campaign(1, "Bahar kampanyasý", 20));
		
		BaseSaleService baseSaleService=new SaleManager();
		baseSaleService.sale(new Order(1, customer1, csgo,bahar));
		
		
		
		
		

	}

}
