package handsonPack;

public class MethodsHandson {

	public void reverseString(String strToBeRev) {
		int len = strToBeRev.length() - 1;
		for (int i = len; i >= 0; i--) {
			System.out.print(strToBeRev.charAt(i));
		}
		System.out.println();
	}

	public int getNumberOfChars(String str) {
		return str.length();
	}

	public int getNumberOfWords(String str) {
		return str.split("\\s+").length;
	}

	public void printChars(String str) {
		char[] cArray = str.toCharArray();
		for (int i = 0; i < cArray.length; i++) {
			System.out.println(cArray[i]);
		}
	}

	public void printValues(String str) {
		String[] words = str.split("\\s+");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}

	public void equalsIgnoreCase(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		System.out.println(s1.equals(s2));
	}

	public static void main(String[] args) {

		MethodsHandson mh = new MethodsHandson();
		
		// Reversing string
		mh.reverseString("hello");

		// Number of Chars and words
		String add = "number of chars and words";
		System.out.println(mh.getNumberOfChars(add));
		System.out.println(mh.getNumberOfWords(add));

		// Print chars
		String sentence = "This is the new America";
		mh.printChars(sentence);

		// Print words
		String s1 = "Thank you for downloading Eclipse";
		mh.printValues(s1);

		// Check if both string are equal without using 'equalsIgnoreCase()' method
		String str1 = "Check";
		String str2 = "check";
		mh.equalsIgnoreCase(str1, str2);

	}

}
