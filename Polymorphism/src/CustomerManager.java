

public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	
	public void add() {
		System.out.println("M��teri eklendi");
		this.logger.log("Log Mesaj�");
	}

}
