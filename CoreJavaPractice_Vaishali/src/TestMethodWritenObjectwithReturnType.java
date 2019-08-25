
class Student2 {

}

public class TestMethodWritenObjectwithReturnType {

	Employee m1(Employee e) {
		System.out.println("in m1 method");

		return e;

	}

	Student m2(Student s) {
		System.out.println("in m2 method");
		return s;

	}

	public static void main(String[] args) {
		TestMethodWritenObjectwithReturnType t = new TestMethodWritenObjectwithReturnType();

		Employee e = new Employee();
		Student s = new Student();

		t.m1(e);
		t.m2(s);

	}

}
