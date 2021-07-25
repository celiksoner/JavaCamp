package src.Concrete;


import src.Abstract.CustomerCheckService;
import src.Entities.Customer;


public class CustomerCheckManager implements CustomerCheckService {


	public boolean CheckIfRealPerson(Customer customer) {
		return true;		
	}

}
