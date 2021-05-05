package Concrete;
import Abstract.BaseCustomerService;
import Abstract.CustomerCheckService;
import Entity.Customer;



public class CustomerManager extends BaseCustomerService {
	
	private CustomerCheckService checkService;
	

	public CustomerManager(CustomerCheckService checkService) {
		this.checkService=checkService;
		
	}


	@Override
	public void add(Customer c) {
		if(checkService.checkÝfRealPerson(c)) {
			super.add(c);
		}
		else {
			System.out.println("kullanýcý eklenemedi\n"
					+"Kullanýcý Adý :"+c.getFirstName());
		}
		
	}


	@Override
	public void update(Customer c) {
		if(checkService.checkÝfRealPerson(c)) {
			super.update(c);
		}
		
	}


	@Override
	public void delete(Customer c) {
		
		super.delete(c);
	}
	


	

	
	

}
