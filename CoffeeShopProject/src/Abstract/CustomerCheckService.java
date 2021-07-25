package src.Abstract;

import java.rmi.RemoteException;

import src.Entities.Customer;



public interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
