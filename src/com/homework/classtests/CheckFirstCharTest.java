package com.homework.classtests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.homework.chartype.CharType;

class CheckFirstCharTest {
	CharType firstChar;

	@BeforeEach
	void setup() {
		firstChar = new CharType("12 Street");
	}

	@Test
	@DisplayName("Checking type of first char of a string")
	void testCharType() {
		assertEquals("Number", firstChar.getCharType());
		assertEquals("Uppercase", firstChar.getCharType("Hola"));
		assertEquals("Lowercase", firstChar.getCharType("crayoli"));
		assertEquals("Other", firstChar.getCharType("#ch30"));
	}
}
