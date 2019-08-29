
public class TestConstructorCallingEx {
	TestConstructorCallingEx() {

		this("Shri");
		System.out.println("0-args constructor");

	}

	TestConstructorCallingEx(int a, int b) {
		System.out.println("2- args constructor");
	}

	TestConstructorCallingEx(String s) {
		this(10, 20);
		System.out.println("1-args constructor");
	}

	public static void main(String[] args) {
		TestConstructorCallingEx t = new TestConstructorCallingEx();
	}
}
