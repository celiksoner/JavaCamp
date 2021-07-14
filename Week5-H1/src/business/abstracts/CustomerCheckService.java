package business.abstracts;

import entities.concretes.Customer;

public interface CustomerCheckService {
	boolean checkFirstName(Customer customer);
	boolean checkLastName(Customer customer);
	boolean checkEmail(Customer customer);
	boolean checkPassword(Customer customer);
	boolean uniqueEmail(Customer customer);
	boolean isValid(Customer customer);
}
