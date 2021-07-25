

import java.rmi.RemoteException;


import Adapters.MernisServiceAdapter;
import Concrete.BaseCustomerManager;

import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException{
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		//Aþaðýdaki TC doðru deðil kendi bilgileriniz girerek deneyebilirsiniz.
		
		customerManager.save(new Customer(1,"Soner","Çelik",1994,"45466961903"));
		
	}

}
