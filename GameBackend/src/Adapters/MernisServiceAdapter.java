package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entity.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean check›fRealPerson(Customer customer) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean value=false;
		try {
			value =proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), Integer.parseInt(customer.getDateOfBirth()));
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		
		return value;
	}
	

}
