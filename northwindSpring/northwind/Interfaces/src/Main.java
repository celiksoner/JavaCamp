
public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(),new EmailLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer soner = new Customer(1,"Soner","Çelik");
		
		customerManager.add(soner);
		

	}

}
