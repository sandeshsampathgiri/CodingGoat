package inheritanceexamples2;

public class TestClass {

	public static void main(String[] args) {

		System.out.println("ParentClass pc = new ParentClass()");
		System.out.println();
		ParentClass pc = new ParentClass();
		System.out.println("Value of x=" + pc.x);
		System.out.println("Value of p=" + pc.p);
		pc.msg();
		pc.parentTest();

		System.out.println("==============================");
		System.out.println();
		System.out.println("ChildClass cc = new ChildClass()");

		ChildClass cc = new ChildClass();
		System.out.println("Value of x=" + cc.x);
		System.out.println("Value of p=" + cc.p);
		System.out.println("Value of p=" + cc.y);

		cc.msg();
		cc.parentTest();
		cc.childTest();

		System.out.println("==============================");
		System.out.println();
		System.out.println("ParentClass parentChild = new ChildClass()");
		ParentClass parentChild = new ChildClass();

		System.out.println("Value of x=" + parentChild.x);
		System.out.println("Value of p=" + parentChild.p);
		// System.out.println("Value of p="+parentChild.y);

		parentChild.msg();
		parentChild.parentTest();
		// parentChild.childTest();

	}

}
