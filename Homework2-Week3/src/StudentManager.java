
public class StudentManager extends UserManager{

	public void ListCourse(Student student) {
		System.out.println(student.getFirstName() + " ��rencisinin ald��� kurslar;");
		for (String courses : student.getEnrolledCourses()) {
			System.out.println(courses);
		}
		System.out.println("-------------------------------------------------------------");
	}
}
