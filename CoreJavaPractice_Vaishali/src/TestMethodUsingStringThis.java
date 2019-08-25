
public class TestMethodUsingStringThis {

	String s = "Techsum";

	void m1(String s) {
		System.out.println(s);
		System.out.println(this.s);

	}

	public static void main(String[] args) {
		TestMethodUsingStringThis t = new TestMethodUsingStringThis();
		t.m1("Software");

	}

}
