package handsonPack;

public class CompareTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = { 3, 6, 2, 4, 5 };
		int[] arr2 = { 5, 3, 2, 6, 4 };

		System.out.println(arr1);
		boolean isEqual = false;
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[i] == arr2[j]) {
						isEqual = true;
						break;
					} else {
						isEqual = false;
					}
				}

			}
		}
		System.out.println(isEqual);

	}
}
