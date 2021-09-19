/**
 * 
 */
package com.LambadaExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Functional interface for the first name
interface FirstName {
	public abstract boolean checkValidFirstUserName(String firstName);
}
//Functional interface for the last name
interface lastName {
	public abstract boolean checkValidLastName(String lastName);
}
//Functional interface for the mobile number
interface Mobilenum {
	public abstract boolean checkValidMobilenumber(String mobilenumber);

}
//Functional interface for the email id
interface Email {
	public abstract boolean checkValidEmailId(String EmailId);

}
//Functional interface for the password
interface pass {
	public abstract boolean checkValidPassword(String Password);

}

/**
 * @author RUSHIKESH BHOSLE
 *
 */
public class LambdaProblem {

	/**
	 * Purpose: FirstName is valid or invalid
	 *  Return:True or False
	 */

	// check lambda function for first name
	public static void main(String[] args) {
		FirstName f1 = (firstName) -> {

			boolean isFirstName;
			String firstNameRegex = "^[A-Z]{1}[a-z]{2,}$";
			Pattern pattern = Pattern.compile(firstNameRegex);
			if (firstName == null) {
				isFirstName = false;
			}
			Matcher matcher = pattern.matcher(firstName);
			isFirstName = matcher.matches();
			return matcher.matches();
		};
		// Check lambda function for last name

		lastName f2 = (lastName) -> {
			boolean isLastName;// check the validation
			String LastNameRegex = "^[A-Z]{1}[a-z]{3,}$";
			Pattern pattern = Pattern.compile(LastNameRegex);
			if (lastName == null) {
				isLastName = false;
			}
			Matcher matcher = pattern.matcher(lastName);
			isLastName = matcher.matches();
			// print the output
			return matcher.matches();
		};

		// check lambda function for mobilenumber
		Mobilenum f3 = (mobilenumber) -> {
			boolean isMobilenumber;// check the validation
			String MobilenumberRegex = "^[0-9]{2}\s{1}[0-9]{10}$";
			Pattern pattern = Pattern.compile(MobilenumberRegex);
			if (mobilenumber == null) {
				isMobilenumber = false;
			}
			Matcher matcher = pattern.matcher(mobilenumber);
			isMobilenumber = matcher.matches();
			return matcher.matches();
		};

		// check lambda function for Email id
		Email f4 = (EmailId) -> {
			boolean isEmailId;// check the validation
			String EmailIdRegex = "^[a-z0-9+_.-]+@[a-z0-9.-]+$";
			Pattern pattern = Pattern.compile(EmailIdRegex);
			if (EmailId == null) {
				isEmailId = false;
			}
			Matcher matcher = pattern.matcher(EmailId);
			isEmailId = matcher.matches();
			return matcher.matches();
		};

		// check lambda function for password

		pass f5 = (password) -> {
			boolean ispassword;// check the validation
			String passwordRegex = "^[A-Z]{1}[a-z]{7,}[@]{1}[0-9]{1,}$";
			Pattern pattern = Pattern.compile(passwordRegex);
			if (password == null) {
				ispassword = false;
			}
			Matcher matcher = pattern.matcher(password);
			ispassword = matcher.matches();
			return matcher.matches();
		};

		// print the statement
		System.out.println(f1.checkValidFirstUserName("Rushikesh"));
		System.out.println(f2.checkValidLastName("Bhosle"));
		System.out.println(f3.checkValidMobilenumber("91 8788586956"));
		System.out.println(f4.checkValidEmailId("rushikeshb5078@gamil.com"));
		System.out.println(f5.checkValidPassword("Rushikesh@123"));
	}
}
