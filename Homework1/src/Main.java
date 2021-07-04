
public class Main {

	public static void main(String[] args) {
		
		StudentManager studentmanager = new StudentManager();
		
		Student student1 = new Student();
		
		student1.Id=1;
		student1.FirstName="Soner";
		student1.LastName="Çelik";
		student1.Email="snrclk94@outlook.com";
		student1.Password="123";
		
		Student student2 = new Student(2,"Caner","Çelik","cnrclk@outlook.com","1234");
		
		Student[] students = {student1,student2};
		
		for (Student student : students) {
			System.out.println(student.FirstName);
		}
		
		
		studentmanager.AddStudent(student1);

	}

}
