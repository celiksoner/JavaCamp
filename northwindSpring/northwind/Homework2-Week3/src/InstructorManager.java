
public class InstructorManager extends UserManager{
	
	public void ListCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " eðitmeninin verdiði kurslar;");
		for (String courses : instructor.getHavingCourses()) {
			System.out.println(courses);
		}
		System.out.println("-------------------------------------------------------------");
				
	}
}
