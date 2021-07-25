package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public interface CustomerService {
	void save(Customer customer) throws NumberFormatException, RemoteException;
}
