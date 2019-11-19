package javaPack;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException  {

		// Kind of error where compiler does not know how to proceed with
		// execution
		// Execution will be aborted
		//
		// Types of Exceptions:
		// Checked or compile time exception
		// Unchecked or runtime exception
		//
		// How to handle:
		// Try-catch block
		// Throws keyword

		System.out.println("First few lines of code...");

		Thread.sleep(5000);

		System.out.println("Last few lines of code...");

		int[] marksOfM = { 35, 43, 75, 63 };

		try {
			System.out.println(marksOfM[4]);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Thread.sleep(5000);

		System.out.println("few more codes...");
	}

}
