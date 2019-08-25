
public class TestMethodUsingThis {

	int a = 100;
	int b = 200;

	void m1(int a, int b) {
		System.out.println(a + b);
		System.out.println(a + b);

	}

	void m2(int a, int b) {
		System.out.println(this.a + this.b);
	}

	public static void main(String[] args) {

		TestMethodUsingThis t = new TestMethodUsingThis();
		t.m1(300, 400);
		t.m2(100, 200);
	}

}
