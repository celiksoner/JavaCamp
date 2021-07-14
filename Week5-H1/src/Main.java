
import business.concretes.CustomerCheckManager;
import business.concretes.CustomerManager;
import business.concretes.MailVerificationManager;
import dataAccess.concretes.HibernateCustomerDao;
import entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setCustomerId(1);
		customer1.setFirstName("Soner");
		customer1.setLastName("Çelik");
		customer1.setEmail("sonercelik@hotmail.com");
		customer1.setPassword("123456");
		
		Customer customer2 = new Customer();
		customer2.setCustomerId(2);
		customer2.setFirstName("Soner");
		customer2.setLastName("Çelik");
		customer2.setEmail("sonercelik@hotmail.com");
		customer2.setPassword("123456");
		
		Customer customer3 = new Customer();
		customer3.setCustomerId(3);
		customer3.setFirstName("Alpay");
		customer3.setLastName("Çelik");
		customer3.setEmail("alpaycelik@hotmail.com");
		customer3.setPassword("123456");

		CustomerManager customerManager = new CustomerManager(new CustomerCheckManager(),new MailVerificationManager(),new HibernateCustomerDao());
		
		customerManager.signUp(customer1);
		customerManager.signUp(customer2);
		
	
		
	}

}
