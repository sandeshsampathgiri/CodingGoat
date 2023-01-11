package stringmanipulation;

public class StringMethods {

	public static void main(String[] args) {

		// 1. charAt()
		String str1 = "Hello World";
		System.out.println(str1.charAt(1));

		// 2. concat()
		String str2a = "Hello";
		String str2b = " World";
		str2a = str2a.concat(str2b);
		System.out.println("Concatenated String=" + str2a);

		// 3. contains()
		String str3 = "Take it easy policy";
		System.out.println(str3.contains("it")); // Returns true
		System.out.println(str3.contains("not")); // Returns false

		// 4. contentEquals()
		String str4 = "Hello World";
		System.out.println(str4.contentEquals("Hello World")); // Returns true
		System.out.println(str4.contentEquals(str3)); // Returns false

		// 5. copyValueOf()
		char[] arr = { 't', 'h', 'i', 's', ' ', ' ', 'i', 's', ' ', 'i', 'n', 'd', 'i', 'a' };
		String str5a = "";
		String str5b = "";
		System.out.println(str5a.copyValueOf(arr));
		System.out.println(str5b.copyValueOf(arr, 2, 4));

		// 6. endsWith()
		String str6 = "This is India";
		System.out.println(str6.endsWith("India"));

		// 7. equals()
		String str7a = "This is India";
		String str7b = "This is India";
		System.out.println(str7a.equals(str7b));

		// 8. equalsIgnoreCase()
		String str8a = "This is India";
		String str8b = "This is india";
		System.out.println(str8a.equalsIgnoreCase(str8b));

		// 9. hashCode()
		String str9 = "This is India";
		System.out.println(str9.hashCode());

		// 10. indexOf()
		String str10 = "This is India";
		System.out.println(str10.indexOf("Ind"));
		System.out.println(str10.indexOf("USA"));

		// 11. isEmpty()
		String str11 = "This is India";
		System.out.println(str11.isEmpty());

		// 12. lastIndexOf()
		String str12 = "This is India India is This";
		System.out.println(str12.lastIndexOf("is"));
		System.out.println(str12.lastIndexOf('a'));

		// 13. length()
		String str13 = "This is India";
		System.out.println(str13.length());

		// 14. replace()
		String str14 = "This is India";
		str14 = str14.replace('a', 'A');
		System.out.println(str14);

		str14 = str14.replace(str14, str12);
		System.out.println(str14);

		// 15. replaceFirst()
		String str15 = "New Delhi was the capital was of India";
		str15 = str15.replaceFirst("was", "is");
		System.out.println(str15);

		// 16. replaceAll()
		String str16 = "New Delhi was the capital was of India";
		str16 = str16.replaceAll("was", "is");
		System.out.println(str16);

		// 17. split()
		String str17 = "New Delhi is the capital of India";
		String[] strArray17 = str17.split(" ");

		// Iterating the elements of the String Array
		for (int i = 0; i < strArray17.length; i++) {
			System.out.println(strArray17[i]);
		}

		// 18. startsWith()
		String str18 = "This is India";
		System.out.println(str18.startsWith("This"));
		System.out.println(str18.startsWith("this"));

		// 19. substring()
		String str19a = "This is India";
		String str19b = str19a.substring(5);
		System.out.println(str19b);
		String str19c = str19a.substring(0, 3);
		System.out.println(str19c);

		// 20. toCharArray()
		String str20 = "This is India";
		char[] charArray = str20.toCharArray();

		// 21. toLowerCase()
		String str21a = "This is India";
		String str21b = str21a.toLowerCase();
		System.out.println(str21b);

		// 22. toString()
		String str22 = "This is India";
		System.out.println(str22.toString());

		// 23. toUpperCase()
		String str23a = "This is India";
		String str23b = str23a.toUpperCase();
		System.out.println(str23b);

		// 24. trim()
		String str24a = "This is India";
		String str24b = str24a.trim();
		System.out.println(str24b);

		// 25. valueOf()
		String str25a = "This is India";
		System.out.println(str25a.valueOf('a'));

	}

}
