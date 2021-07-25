

import java.rmi.RemoteException;


import Adapters.MernisServiceAdapter;
import Concrete.BaseCustomerManager;

import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException{
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		//A�a��daki TC do�ru de�il kendi bilgileriniz girerek deneyebilirsiniz.
		
		customerManager.save(new Customer(1,"Soner","�elik",1994,"45466961903"));
		
	}

}
