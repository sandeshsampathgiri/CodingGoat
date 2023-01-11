package encapsulationconcept;

public class StudentTest {

	public static void main(String[] args) {

		// Setting the values using the setters:

		Student s = new Student();
		s.setStudentName("Sandesh");
		s.setStudentAge(38);
		s.setParentName("Sampathgiri");
		s.setDateOfBirth("04-01-1985");

		// Getting the values of the variables using getters:

		System.out.println("Student Name=" + s.getStudentName());
		System.out.println("Student Age=" + s.getStudentAge());
		System.out.println("Student's parent name=" + s.getParentName());
		System.out.println("Student's Date Of Birth=" + s.getDateOfBirth());

	}

}
