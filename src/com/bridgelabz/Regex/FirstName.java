package com.bridgelabz.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Check user first name with regex
 */
public class FirstName {
	public boolean regexCheck() {

		String firstName = "Shubham";
		String pattern = "^[A-Z][a-z]{3,}$";

		// Create a Pattern object
		Pattern r = Pattern.compile(pattern);
		// Now create a matcher object
		Matcher m = r.matcher(firstName);

		if (m.matches()) {
			return true;
		}
		return false;
	}

//Driver class.
	public static void main(String[] args) {
		FirstName fName = new FirstName();
		System.out.println(fName.regexCheck());
	}

}
