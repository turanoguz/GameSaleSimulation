package Abstract;

import Entity.Customer;

public abstract class BaseCustomerService implements CustomerService{

	@Override
	public void add(Customer c) {
		System.out.println("Kullanýcý Eklendi : \n"
				+"Kullanýcý Adý : "+c.getFirstName()+"\n"
				+"Kullanýcý Soyadý : "+c.getLastName());
		
		
		
	}
	

	@Override
	public void update(Customer c) {
		System.out.println("Kullanýcý güncellendi : \n"
				+"Kullanýcý Adý : "+c.getFirstName()+"\n"
				+"Kullanýcý Soyadý : "+c.getLastName());
		
	}

	@Override
	public void delete(Customer c) {
		System.out.println("Kullanýcý silindi : \n"
				+"Kullanýcý Adý : "+c.getFirstName()+"\n"
				+"Kullanýcý Soyadý : "+c.getLastName());
		
	}

	

}
