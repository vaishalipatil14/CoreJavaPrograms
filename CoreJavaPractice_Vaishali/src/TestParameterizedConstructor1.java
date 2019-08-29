
public class TestParameterizedConstructor1 {
	int eno;
	String ename;

	TestParameterizedConstructor1(int eno, String ename) {
		System.out.println(eno);
		System.out.println(ename);
	}

	public static void main(String[] args) {
		TestParameterizedConstructor1 e1 = new TestParameterizedConstructor1(123, "Shri");
		TestParameterizedConstructor1 e2 = new TestParameterizedConstructor1(456, "Niwas");
	}
}
