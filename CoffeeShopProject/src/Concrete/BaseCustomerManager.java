package src.Concrete;


import java.rmi.RemoteException;

import src.Abstract.CustomerService;
import src.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
	
	public void save (Customer customer) throws NumberFormatException, RemoteException{
		System.out.println("Saved to db : " + customer.firstName);
		
	}

}
