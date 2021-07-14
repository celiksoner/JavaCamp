package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Customer;

public interface CustomerDao {
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	boolean getEmail(String email);
	boolean getPassword(String email);
	List<Customer> getAll();

}
