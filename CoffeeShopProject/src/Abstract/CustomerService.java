package src.Abstract;

import java.rmi.RemoteException;


import src.Entities.Customer;

public interface CustomerService {
	void save(Customer customer) throws NumberFormatException, RemoteException;
}
