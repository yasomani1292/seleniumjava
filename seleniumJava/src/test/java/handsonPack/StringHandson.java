package handsonPack;

public class StringHandson {

	public static void main(String[] args) {

		//Number of Chars and words
		String add = "number of chars and words";
		String[] words = add.split("\\s+");

		System.out.println("Number of chars: " + add.length());
		System.out.println("Number of words: " + words.length);

		String sentence = "This is the new America";
		char[] cArray = sentence.toCharArray();
		for (int i = 0; i < cArray.length; i++) {
			System.out.println(cArray[i]);
		}

		//Words
		String s1 = "Thank you for downloading Eclipse";
		String[] words1 = s1.split(" ");
		for (int i = 0; i < words1.length; i++) {
			System.out.println(words1[i]);
		}

		// Reverse string
		String str = "hello";
		int len = str.length() - 1;

		for (int i = len; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();

		// Check if both string are equal without using 'equalsIgnoreCase()' method
		String str1 = "Check";
		String str2 = "check";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		System.out.println(str1.equals(str2));

	}

}
