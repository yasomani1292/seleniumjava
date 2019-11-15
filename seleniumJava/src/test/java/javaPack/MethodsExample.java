package javaPack;

public class MethodsExample {

	public void nonStaticMethod() {
		System.out.println("nonStaticMethod");
	}

	public static void staticMethod() {
		System.out.println("staticMethod");
	}

	// Overloading - all sum methods
	public int sum(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}

	public void sum(int a, float b) {
		System.out.println(a + b);
	}

	public void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public void sumAndMultiplyBy2(int a, int b) {
		int res = sum(a, b);
		multiply(res, 2);
	}

	public static void main(String[] args) {

		MethodsExample obj = new MethodsExample();
		obj.nonStaticMethod();
		MethodsExample.staticMethod();
		obj.sum(2, 4.4f);

		obj.multiply(10, 20);
		obj.sumAndMultiplyBy2(10, 20);
	}

}
