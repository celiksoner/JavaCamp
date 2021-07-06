
public class Customer {

	private int Id;
	private String firstName;
	private String lastName;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String lastName) {
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
