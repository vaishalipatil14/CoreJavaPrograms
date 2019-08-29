
public class TestAccessInstanceVariableWithThis {

	int a;
	int b;
	int c;
	int d;

	TestAccessInstanceVariableWithThis(int a, int b) {
		this.a = a;
		this.b = b;

	}

	// TestAccessInstanceVariableWithThis(int a, int b) {
	//
	// c = a;
	// d = b;
	// System.out.println(a);
	// System.out.println(b);
	//
	// }

	void disp() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		TestAccessInstanceVariableWithThis t = new TestAccessInstanceVariableWithThis(10, 20);
		t.disp();
	}
}
