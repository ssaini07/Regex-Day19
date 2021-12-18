package com.bridgelabz.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Checking for user password rule 4 with regex
 * minimum of 8 character
 * one upper case
 * one numeric
 *  at least 1 special character must be there. 
 */

public class UserRegistration {

	public boolean regexCheck(String oneSpecialCharacter) {

		String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[~!#@%^&*(){}])[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}$";

		// Create a Pattern object
		Pattern r = Pattern.compile(regex);
		// Now create a matcher object
		Matcher m = r.matcher(oneSpecialCharacter);

		if (m.matches()) {
			return true;
		}
		return false;
	}

//Driver class.
	public static void main(String[] args) {
		UserRegistration passwordCheck = new UserRegistration();
		System.out.println(passwordCheck.regexCheck("aBvfk%()efn98n"));
		System.out.println(passwordCheck.regexCheck("AAAbbbccc#$%^@123"));
		System.out.println(passwordCheck.regexCheck("A~$^+=<>a1"));
		System.out.println(passwordCheck.regexCheck("abvlkkm.-"));

	}

}
