
public class CustomerManager {

	public void Add(Customer customer) {
		System.out.println(customer.CustomerNumber + " kaydedildi.");
	}
	
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			Add(customer);
		}
	}
	
}
