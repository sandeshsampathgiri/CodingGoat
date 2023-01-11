package inheritanceexamples2;

import inheritanceexamples.ClassA;

public class ClassD extends ClassA{
	
	String name;
	
	public static void main(String[] args)
	{
		ClassD cd = new ClassD();
		System.out.println(cd.text);
	}

}
