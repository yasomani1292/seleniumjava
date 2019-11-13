package handsonPack;

public class FindBigAndSmallValue {

	public static void main(String[] args) {
		
		//Anu
		int[] arr1 = { 3, 6, 2, 4, 5 };
		int biggestVal = arr1[0];
		int smallestVal = arr1[0];

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > biggestVal) {
				biggestVal = arr1[i];
			} else if (arr1[i] < smallestVal) {
				smallestVal = arr1[i];
			}
		}

		System.out.println("biggest number:" + biggestVal);
		System.out.println("Smallest number:" + smallestVal);

	}

}
