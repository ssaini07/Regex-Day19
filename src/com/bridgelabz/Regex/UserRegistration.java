package com.bridgelabz.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Testing all email id's provided. 
 */

public class UserRegistration {

	public boolean regexCheck(String oneSpecialCharacter) {

		String regex = "^[a-z.+_-]+[.a-z0-9]*+@[a-z0-9]+[.a-z]+[.a-z0-9]*$";

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
		System.out.println(passwordCheck.regexCheck("abc@yahoo.com"));
		System.out.println(passwordCheck.regexCheck("abc-100@yahoo.com"));
		System.out.println(passwordCheck.regexCheck("abc.100@yahoo.com"));
		System.out.println(passwordCheck.regexCheck("abc111@abc.com"));
		System.out.println(passwordCheck.regexCheck("abc-100@abc.net"));
		System.out.println(passwordCheck.regexCheck("abc.100@abc.com.au"));
		System.out.println(passwordCheck.regexCheck("abc@1.com"));
		System.out.println(passwordCheck.regexCheck("abc@yahoo.com.com"));
		System.out.println(passwordCheck.regexCheck("abc+100@yahoo.com"));
	}

}
