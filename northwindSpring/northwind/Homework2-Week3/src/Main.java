

public class Main {

	public static void main(String[] args) {		 
		
		String[] courses = new String[2];
		courses[0] = "C# Kursu";
		courses[1] = "Java Kursu";
		
		Instructor instructor1 = new Instructor();
		Student student1 = new Student();
		
		//Adding Instructor
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setEmail("engindemirog@kodlama.io");
		instructor1.setPassword("1234");
		instructor1.setHavingCourses(courses);
		
		//Adding Student
		student1.setId(2);
		student1.setFirstName("Soner");
		student1.setLastName("Çelik");
		student1.setEmail("snrclk94@outlook.com");
		student1.setPassword("5678");
		student1.setEnrolledCourses(new String[] {courses[0]});
		
		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		userManager.add(instructor1);		
		userManager.add(student1);
		
		instructorManager.ListCourse(instructor1);
		studentManager.ListCourse(student1);
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
	}

}
