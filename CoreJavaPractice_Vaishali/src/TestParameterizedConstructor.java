
public class TestParameterizedConstructor {

	int eno;
	String ename;

	TestParameterizedConstructor() {
		eno = 123;
		ename = "Shri";

		System.out.println(eno);
		System.out.println(ename);

	}

	public static void main(String[] args) {
		TestParameterizedConstructor e1 = new TestParameterizedConstructor();
		TestParameterizedConstructor e2 = new TestParameterizedConstructor();

	}

}