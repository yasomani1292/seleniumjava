package javaPack;

public class ConstructorExample {

	public ConstructorExample() {
		System.out.println("This is constructor");// 3
	}

	static {
		System.out.println("static block");// 1
	}

	public void method() {
		System.out.println("This is method");// 4
	}

	public static void main(String[] args) {

		System.out.println("This is main method");// 2

		ConstructorExample ce = new ConstructorExample();
		ce.method();

		Login log = new Login("inu", "inp");
		log.homePage();

	}

}
