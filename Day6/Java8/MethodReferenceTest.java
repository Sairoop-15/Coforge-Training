package com.coforge.Day6.Java8;

@FunctionalInterface
interface MyReference {
	void showMessage();
}

public class MethodReferenceTest {
	void myInstanceMethod() {
		System.out.println("Example for Instance Method Reference");
	}

	static void myStaticMethod() {
		System.out.println("Example for Static Method Reference");
	}

	MethodReferenceTest() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		MethodReferenceTest ref = new MethodReferenceTest();
		MyReference reference = ref::myInstanceMethod;
		reference.showMessage();
		
		reference = MethodReferenceTest::myStaticMethod;
		reference.showMessage();
		
		reference = MethodReferenceTest::new;
		reference.showMessage();
	}

}
