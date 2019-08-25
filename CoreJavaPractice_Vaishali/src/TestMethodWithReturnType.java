
public class TestMethodWithReturnType {

	public void m1() {

	}

	public int m2() {

		return 10;
	}

	public boolean m3() {

		return true;

	}

	public byte m4() {

		return 2;

	}

	public char m5() {

		return 'A';

	}

	public short m6() {

		return 23;

	}

	public long m7() {

		return 232;

	}

	public float m8() {

		return 1.2f;

	}

	public double m9() {

		return 1.3d;

	}

	public String m10() {

		return "Techsum";

	}

	public static void main(String[] args) {

		TestMethodWithReturnType t = new TestMethodWithReturnType();

		System.out.println(t.m2());
		System.out.println(t.m3());
		System.out.println(t.m4());
		System.out.println(t.m5());
		System.out.println(t.m6());
		System.out.println(t.m7());
		System.out.println(t.m8());
		System.out.println(t.m9());
		System.out.println(t.m10());

	}
}
