package abstractionconcept;

public class Person extends Identity {

	@Override
	void getName(String name) {
		System.out.println("Name=" + name);

	}

	@Override
	void getGender(String gender) {
		System.out.println("Gender=" + gender);

	}

	@Override
	void getCity(String city) {
		System.out.println("City=" + city);

	}

	void getCountry(String country) {
		System.out.println("Country=" + country);
	}

}