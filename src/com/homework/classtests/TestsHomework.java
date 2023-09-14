package com.homework.classtests;

import com.homework.chartype.CharType;
import com.homework.palindrome.Palindrome;

public class TestsHomework {

	public static void main(String[] args) {
		Palindrome test = new Palindrome("Oso");
		System.out.println(test.isAlmostPalindrome());
		System.out.println(test.isAlmostPalindrome("Ver"));

		CharType aChar = new CharType("12 Street");
		System.out.println(aChar.getCharType());
		System.out.println(aChar.getCharType("Hola"));
	}

}
