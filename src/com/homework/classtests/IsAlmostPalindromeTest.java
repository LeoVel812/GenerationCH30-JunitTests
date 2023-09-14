package com.homework.classtests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.homework.palindrome.Palindrome;

class IsAlmostPalindromeTest {
	Palindrome isAlmostAPalindrome;

	@BeforeEach
	void setup() {
		isAlmostAPalindrome = new Palindrome("Oso");
	}

	@Test
	@DisplayName("Cheking if it's almost a palindrome")
	void testIsAlmostAPalindrome() {
		assertEquals(false, isAlmostAPalindrome.isAlmostPalindrome());
		assertEquals(true, isAlmostAPalindrome.isAlmostPalindrome("Ver"));
		assertEquals(false, isAlmostAPalindrome.isAlmostPalindrome("Hola"));
		assertEquals(true, isAlmostAPalindrome.isAlmostPalindrome("Ocho"));
		assertEquals(false, isAlmostAPalindrome.isAlmostPalindrome("Veronica"));
		assertEquals(true, isAlmostAPalindrome.isAlmostPalindrome("Anita lavo la tina"));
	}

}
