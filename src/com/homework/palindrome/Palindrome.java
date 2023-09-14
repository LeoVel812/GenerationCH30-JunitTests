package com.homework.palindrome;

public class Palindrome {
	private String word;

	public Palindrome(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public boolean isAlmostPalindrome() {
		return isAlmostPalindrome(getWord());
	}

	public boolean isAlmostPalindrome(String word) {
		String noSpacesLowerCase = word.replaceAll(" ", "").toLowerCase();
		// System.out.println(noSpacesLowerCase);
		// from string to an array of chars:
		char[] strArray = noSpacesLowerCase.toCharArray();
		// Indexes to the limits of the string
		int rightIndex = strArray.length - 1;
		int leftIndex = 0;
		int mismatch = 0;
		// looping through the char string
		while (leftIndex < rightIndex) {
//			System.out.println("r: " + rightIndex + " l: " + leftIndex);
//			System.out.println("r: " + strArray[rightIndex] + " l: " + strArray[leftIndex]);
			// increment the mismatch if there's a mismatch
			if (strArray[rightIndex] != strArray[leftIndex]) {
				mismatch++;
			}
			// modifying indexes to keep the comparison
			leftIndex++;
			rightIndex--;
		}
		// System.out.println(mismatch);
		// if there's only a mismatch, then is almost a palindrome (true), otherwise is
		// false
		return mismatch == 1 ? true : false;
	}
}
