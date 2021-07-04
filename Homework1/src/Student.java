
public class Student {
	
	//Constructor
	public Student() {
		
	}
	
	//Constructor
	public Student(int Id,String FirstName,String LastName,String Email, String Password) {
		this.Id = Id;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Email = Email;
		this.Password = Password;
	}
	
	int Id;
	String FirstName;
	String LastName;
	String Email;
	String Password;
}
