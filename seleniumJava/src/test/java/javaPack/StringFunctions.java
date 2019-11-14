package javaPack;

import java.util.Arrays;

public class StringFunctions {

	public static void main(String[] args) {

		String name = "Manikandan P";
		System.out.println(name);

		// length
		System.out.println("Number of chars: " + name.length());

		// equals
		String name2 = "manikandan p";
		System.out.println("True if both are equal: " + name.equals(name2));

		// equalsIgnoreCase
		System.out.println("True if both are equal: " + name.equalsIgnoreCase(name2));

		// contains
		System.out.println("True if string contains: " + name.contains("dan"));

		// startsWith
		System.out.println("True if string starting with: " + name.startsWith("Mani"));

		// endsWith
		System.out.println("True if string ending with: " + name.endsWith("dan P"));

		// charAt
		System.out.println("Return a char for given index: " + name.charAt(2));

		// indexOf
		System.out.println("Return index for given char: " + name.indexOf('n'));

		// substring
		System.out.println("Substring from 2nd index to last: " + name.substring(2));
		System.out.println("Substring from 2nd index to 4th index: " + name.substring(2, 5));

		// split
		String[] arr = name.split(" ");
		System.out.println("Get string array based on delimiter: " + Arrays.toString(arr));

		// toCharArray
		char[] cArr = name.toCharArray();
		System.out.println("String to char array: " + Arrays.toString(cArr));

		// replace, replaceFirst, replaceAll
		String rStr = "Account# 24680\\d2468\\d0";
		System.out.println("Replace all matching string: " + rStr.replace("\\d", "_"));
		System.out.println("Replace first matching string: " + rStr.replaceFirst("24", "_"));
		System.out.println("Replace all matching pattern: " + rStr.replaceAll("\\d", "*"));

		// isEmpty
		System.out.println("True is string length is 0: " + name.isEmpty());
		String emptyStr = "";
		System.out.println("True is string length is 0: " + emptyStr.isEmpty());

		// toLowercase
		System.out.println("All chars to lowercase: " + name.toLowerCase());

		// toUppercase
		System.out.println("All chars to uppercase: " + name.toUpperCase());

		// valueOf
		int num = 123456789;
		String intToStr = String.valueOf(num);
		System.out.println("Convert int / char[] / boolean to String: " + intToStr.length());

		// trim
		String additionalSpace = " Manikandan P ";
		System.out.println("Before Trim: " + additionalSpace);
		System.out.println("After Trim: " + additionalSpace.trim());

		// matches
		String actNum = "Account# 2468024680";
		System.out.println(actNum.matches("[a-zA-Z# ]{9}[0-9]{10}"));

	}

}
