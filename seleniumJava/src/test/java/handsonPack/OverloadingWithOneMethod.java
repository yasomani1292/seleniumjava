package handsonPack;

public class OverloadingWithOneMethod {

	public void sum(float... args) {
		System.out.println("Number of arguments: " + args.length);
		float total = 0;
		for (int i = 0; i < args.length; i++) {
			total = total + args[i];
		}
		System.out.println(total);
	}

	public static void main(String[] args) {

		OverloadingWithOneMethod ol = new OverloadingWithOneMethod();
		ol.sum(1, 2);
		ol.sum(1, 2, 3);
		ol.sum(1, 2.2f);
	}
}
