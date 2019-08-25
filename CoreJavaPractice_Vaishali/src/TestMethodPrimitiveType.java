
public class TestMethodPrimitiveType {

	public int m1(int i) {

		return i;

	}

	public float m2(float f) {
		return f;

	}

	public String m3(String s) {
		return s;

	}

	public char m4(char c) {
		return c;

	}

	public boolean m5(boolean b) {
		return b;

	}

	public static void main(String[] args) {
		TestMethodPrimitiveType t = new TestMethodPrimitiveType();
		int i = t.m1(10);
		float f = t.m2(2.2f);
		String s = t.m3("Techsum");
		char c = t.m4('A');
		boolean b = t.m5(true);

		System.out.println(i);
		System.out.println(f);
		System.out.println(s);
		System.out.println(c);
		System.out.println(b);
	}
}
