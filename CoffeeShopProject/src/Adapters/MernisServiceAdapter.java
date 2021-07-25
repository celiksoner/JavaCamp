package src.Adapters;

import java.rmi.RemoteException;

import src.Abstract.CustomerCheckService;
import src.Entities.Customer;
import src.tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
	KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
	
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId),customer.firstName.toUpperCase(), customer.lastName.toUpperCase(), customer.dateOfBirth);
		if(result == true)
		{
			System.out.println("Ba�ar�l�");
			return true;
			
		}else {
			System.out.println("Ba�ar�s�z");
			return false;
		}
		
	}
	

}
