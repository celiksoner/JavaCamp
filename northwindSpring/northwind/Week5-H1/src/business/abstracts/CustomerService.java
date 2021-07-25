package business.abstracts;

import entities.concretes.Customer;

public interface CustomerService {
	void signUp(Customer customer);
	void signIn(Customer customer);	
}
