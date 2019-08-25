class Student1 {

}

public class TestMethodWritenObject {

	Employee m1() {
		System.out.println("in m1 method");

		Employee e = new Employee();

		return e;

	}

	Student1 m2() {
		System.out.println("in m2 method");

		Student1 s = new Student1();

		return s;

	}

	public static void main(String[] args) {
		TestMethodWritenObject t = new TestMethodWritenObject();

		t.m1();
		t.m2();

	}
}
