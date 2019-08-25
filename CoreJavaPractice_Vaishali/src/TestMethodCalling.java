
public class TestMethodCalling {

	void m1() {
		m2();
		System.out.println("in m1 method");
	}

	void m2() {
		System.out.println("in m2 method");

	}
	void m4() {
		System.out.println("in m2 method");

	}

	void m3() {
		System.out.println("in m3 method");
	}

	public static void main(String[] args) {
		TestMethodCalling t = new TestMethodCalling();

		t.m1();
	}
}
