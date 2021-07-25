package Concrete;


import java.rmi.RemoteException;

import Abstract.CustomerService;
import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
	
	@Override
	public void save (Customer customer) throws NumberFormatException, RemoteException{
		System.out.println("Saved to db : " + customer.firstName);
		
	}

}
