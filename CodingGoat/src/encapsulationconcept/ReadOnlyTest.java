package encapsulationconcept;

public class ReadOnlyTest {

	public static void main(String[] args) {

		Employee emp = new Employee("Sandesh", 17, "Kumarans");
		String name = emp.getName();
		int id = emp.getId();
		String companyName = emp.getNCompany();

		System.out.println("Employee Name=" + name);
		System.out.println("ID=" + id);
		System.out.println("Company Name=" + companyName);

	}
}