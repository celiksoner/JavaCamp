
public class Main {

	public static void main(String[] args) {
		IndividualCustomer soner = new IndividualCustomer();
		soner.CustomerNumber="12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.CustomerNumber="6789";
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add(hepsiBurada);
		customerManager.Add(soner);
		
		Customer[] customers = {soner,hepsiBurada};
		
		customerManager.addMultiple(customers);
		
		

	}

}
