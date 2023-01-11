package abstractionconcept;

public class MainClass {

	public static void main(String[] args) {

		Identity i = new Person();
		i.getName("Deepak");
		i.getGender("Male");
		i.getCity("Bangalore");
		// i.getCountry("India"); Compile-time error because we cannot access newly added method in subclass 
		//using superclass reference. 

	}
}