
public class TestVariables {

	int i = 10;
	static int j = 20;

	void m1() {
		System.out.println("Inm1method");
		System.out.println(i);

	}

	void m2(int i) {
		System.out.println(i);

	}

	void m3(boolean f) {
		System.out.println(f);

	}

	void m4(byte b) {
		System.out.println(b);
	}

	void m5(float f) {
		System.out.println(f);
	}

	void m6(char c) {
		System.out.println(c);
	}

	void m7(short s) {
		System.out.println(s);

	}

	void m8(long l) {
		System.out.println(l);

	}

	void m9(double d) {
		System.out.println(d);

	}

	void m10(String s) {
		System.out.println(s);

	}

	public static void main(String[] args) {

		TestVariables t = new TestVariables();
		System.out.println(t.i);
		System.out.println(t.j);
		System.out.println(TestVariables.j);

		t.m2(10);

		// Integer

		t.m3(false);

		// Boolean

		t.m4((byte) 10);

		// Byte

		t.m5(10.2f);

		// Float

		t.m6('A');
		
		//Char
		
		
		t.m7((short) 10);
		
		//Short
		
		
		t.m8(5l);
		
		//Long
		
		
		t.m9(1.2d);
		
		//Double
		
		
		t.m10("Techsum");
		
		//String
	}
}
