package Abstract;


import java.rmi.RemoteException;

import Entities.Customer;

public interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
