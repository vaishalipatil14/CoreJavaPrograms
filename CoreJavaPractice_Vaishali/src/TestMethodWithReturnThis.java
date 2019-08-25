
public class TestMethodWithReturnThis {
	int i = 10;

	int m1(int i) {
		return this.i;

	}

	int a = 20;

	int m2(int a) {
		return a;

	}

	public static void main(String[] args) {
		TestMethodWithReturnThis t = new TestMethodWithReturnThis();

		System.out.println(t.m1(20));
		System.out.println(t.m2(20));

	}
}
