package com.homework.chartype;

public class CharType {
	private String input;

	public CharType(String input) {
		this.input = input;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getCharType() {
		return getCharType(getInput());
	}

	public String getCharType(String input) {
		char firstChar = input.charAt(0);
		String charType = "";
		// if it's a number
		// if it's a upperCase letter
		// if it's a lowerCase letter
		// else other
		if (firstChar >= 48 && firstChar <= 57) {
			charType = "Number";
		} else if (firstChar >= 65 && firstChar <= 90) {
			charType = "Uppercase";
		} else if (firstChar >= 97 && firstChar <= 122) {
			charType = "Lowercase";
		} else {
			charType = "Other";
		}
		return charType;
	}
}
