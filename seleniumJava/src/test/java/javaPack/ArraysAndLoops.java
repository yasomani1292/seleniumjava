package javaPack;

import java.util.Arrays;

public class ArraysAndLoops {

	public static void main(String[] args) {

		// Group of values with same data-type; fixed in size

		// Approach 1 - when you know values
		int[] nums = { 10, 20, 30, 40, 50 };
		// indexes 0 1 2 3 4

		System.out.println("First value - " + nums[0]);

		int n = nums.length;
		System.out.println("Last value - " + nums[n - 1]);

		System.out.println("Print all values");
		for (int i = 0; i < n; i++) {
			System.out.println(nums[i]);
		}

		System.out.println(Arrays.toString(nums));

		// Approach 2 - when you know number of values
		int[] nums1 = new int[5];
		nums1[0] = 10;
		nums1[1] = 20;
		nums1[2] = 30;
		nums1[3] = 40;
		nums1[4] = 50;

		System.out.println(Arrays.toString(nums1));
	}

}
