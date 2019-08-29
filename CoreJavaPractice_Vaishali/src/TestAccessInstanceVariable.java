
public class TestAccessInstanceVariable {

	int a;
	int b;

	TestAccessInstanceVariable(int a) {
		
		System.out.println(a);

	}

	void disp() {
		System.out.println(a);

	}

	public static void main(String[] args) {
		TestAccessInstanceVariable t = new TestAccessInstanceVariable(10);
		t.disp();

	}

}
