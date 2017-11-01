package in.vamsoft.training.EmployeeTest;

import in.vamsoft.training.employee.*;

public class DynamicTest {
	public static void main(String[] args) {
		C obj1 = new C();
		obj1.m1();
		obj1.m2();
		obj1.m3();

		B obj2 = new B();
		B obj3 = new C();
		((C) obj1).m3();

	}

}
