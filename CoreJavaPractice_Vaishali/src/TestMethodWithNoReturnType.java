class Employee {

}

class Student {

}

public class TestMethodWithNoReturnType {

	public void m1(int i) {
		System.out.println("int value=" + i);

	}

	public void m3(boolean b) {
		System.out.println("boolean value=" + b);
	}

	public void m4(short s) {
		System.out.println("short value=" + s);

	}

	public void m5(long l) {
		System.out.println("long value=" + l);
	}

	public void m6(float f) {
		System.out.println("float value=" + f);
	}

	public void m7(double d) {
		System.out.println("double value=" + d);
	}

	static void m2(char c, String s) {

		System.out.println("characters value=" + c);
		System.out.println("String value=" + s);
	}

	public void m8(Employee e) {
		System.out.println("in m1 method");

	}

	public void m9(Student s) {
		System.out.println("in m2 method");
	}

	public static void main(String[] args) {

		TestMethodWithNoReturnType t = new TestMethodWithNoReturnType();
		t.m1(10);
		t.m2('A', "Techsum");
		t.m3(true);
		t.m4((short) 1);
		t.m5(232);
		t.m6(1.2f);
		t.m7(2.3d);

		Employee e = new Employee();
		Student s = new Student();

		TestMethodWithNoReturnType.m2('A', "Techsum");

		t.m8(e);
		t.m9(s);

	}
}
