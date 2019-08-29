
public class TestConstructorCalling {
	TestConstructorCalling() {
		this(10);
		System.out.println("0-args constructor");

	}

	TestConstructorCalling(int i) {
		System.out.println("1-args constructor");
	}

	public static void main(String[] args) {
		TestConstructorCalling t = new TestConstructorCalling();
	}
}
