package javaPack;

public class Variables {

	// local variable
	// instance / non-static variable
	// class / static variable

	int inst = 100;
	static int cl = 200;

	public void sum(int a, int b) {
		int c = a + b; // all a,b,c local variable
		System.out.println(c);
	}

	public static void main(String[] args) {

		int num = 10;

		Variables obj1 = new Variables();
		Variables obj2 = new Variables();

		obj1.inst++;
		Variables.cl++;
		obj2.inst++;
		Variables.cl++;

		System.out.println(obj2.inst);// 101
		System.out.println(Variables.cl);// 202

	}

}
