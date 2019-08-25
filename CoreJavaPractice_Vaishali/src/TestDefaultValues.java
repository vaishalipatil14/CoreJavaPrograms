
public class TestDefaultValues {

	boolean b;
	byte y;
	char c;
	short s;
	int i;
	long l;
	float f;
	double d;
	String r;

	public static void main(String[] args) {

		TestDefaultValues t = new TestDefaultValues();

		System.out.println("default value of boolean=" + t.b);
		System.out.println("default value of byte=" + t.y);
		System.out.println("default value for char=" + t.c);
		System.out.println("default value for short=" + t.s);
		System.out.println("default value for int=" + t.i);
		System.out.println("default value for long=" + t.l);
		System.out.println("default value for float=" + t.f);
		System.out.println("default value for double=" + t.d);
		System.out.println("default value for String=" + t.r);

	}

}
