package Abstract;

import Entity.Customer;

public abstract class BaseCustomerService implements CustomerService{

	@Override
	public void add(Customer c) {
		System.out.println("Kullan�c� Eklendi : \n"
				+"Kullan�c� Ad� : "+c.getFirstName()+"\n"
				+"Kullan�c� Soyad� : "+c.getLastName());
		
		
		
	}
	

	@Override
	public void update(Customer c) {
		System.out.println("Kullan�c� g�ncellendi : \n"
				+"Kullan�c� Ad� : "+c.getFirstName()+"\n"
				+"Kullan�c� Soyad� : "+c.getLastName());
		
	}

	@Override
	public void delete(Customer c) {
		System.out.println("Kullan�c� silindi : \n"
				+"Kullan�c� Ad� : "+c.getFirstName()+"\n"
				+"Kullan�c� Soyad� : "+c.getLastName());
		
	}

	

}
