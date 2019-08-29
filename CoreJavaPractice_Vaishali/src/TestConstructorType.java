
public class TestConstructorType {

	TestConstructorType() {
		System.out.println("Default Constructor");

	}

	TestConstructorType(int i) {
		System.out.println("Parameterized Constructor");

	}

	public static void main(String[] args) {
		TestConstructorType t1 = new TestConstructorType();

		TestConstructorType t2 = new TestConstructorType(10);
	}
}
