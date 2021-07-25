package src;



import java.rmi.RemoteException;


import src.Adapters.MernisServiceAdapter;
import src.Concrete.BaseCustomerManager;

import src.Concrete.StarbucksCustomerManager;
import src.Entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException{
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		//Aþaðýdaki TC doðru deðil kendi bilgileriniz girerek deneyebilirsiniz.
		
		customerManager.save(new Customer(1,"Soner","Çelik",1994,"1234567890"));
		
	}

}
