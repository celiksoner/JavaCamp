
public class StudentManager {

		public void AddStudent(Student student) {
			System.out.println("��renci ba�ar�yla eklendi.");
		}
		
		public void GetStudents(Student[] students) {
			for (Student student : students) {
				System.out.println("Student Name: " + student.FirstName);
				System.out.println("Student Email: " + student.Email);
			}
		}

}
