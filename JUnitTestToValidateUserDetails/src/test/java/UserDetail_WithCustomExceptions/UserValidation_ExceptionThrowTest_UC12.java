package UserDetail_WithCustomExceptions;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
// creating test class and declaring variables
public class UserValidation_ExceptionThrowTest_UC12 {
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private String password;
	private boolean expected;
	private UserValidator userValidator = new UserValidator();

//initialising variables in constructor
	public UserValidation_ExceptionThrowTest_UC12(final String firstName, final String lastName, final String email,
			final String mobile, final String password, final boolean expected) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.expected = expected;
	}

// making a collection / arraylist for different which will fail one test at a time
	@Parameters
	public static Collection input() {
		return Arrays.asList(
				new Object[][] { { "Lalit", "Gahlawat", "abc@yahoo.com", "96 3648478437", "AhbsddsB@123ggv", true },
						{ "La", "Gahlawat", "abc-100@yahoo.com", "96 3648478437", "AhbsddsB@123ggv", true },
						{ "Lait", "ahlawat", "abc.100@yahoo.com", "96 3648478437", "AhbsddsB@123ggv", true },
						{ "Lalt", "Gahlawat", "abc..111@yahoo.com", "96 3648478437", "sdjjksB@13ghggh", true },
						{ "Pulit", "Gahlawat", "abc-100@abc.net", "963648478437", "bdB236@hdh12", true },
						{ "Sumit", "Gahlawat", "abc.100@abc.com.au", "96 3648478437", "bdB236hdh12", true },
				// {"Rachit","Gahlawat","abc@1.com","96 3648478437","bdB236@hdh12",true},
				// {"Rach","Gahlawat","abc@gmail.com.com","96 3648478437","bdB236@hdh12",true},
				// {"Lalit","Gahlawat","abc+100@gmail.com","96 3648478437","bdB236@hdh12",true},
				// {"Lalit","Gahlawat","abc","96 3648478437","bdB236@hdh12",false},
				// {"Lalit","Gahlawat","abc@.com.my","96 3648478437","bdB236@hdh12",false},

				});
	}

// test to verify that last name  do not matches pattern and throws exception message

	@Test
	public void lastNameTest() {
		try {
			if (userValidator.validateLastName(lastName) != true)
				throw new UserValidation_CustomException("The last name is not valid");
		} catch (UserValidation_CustomException e) {
			System.err.println("Execution stopped because " + e.getMessage());
		}
	}

// test to verify that first name  do not matches pattern and throws exception message
	@Test
	public void firstNameTest() {
		try {
			if (userValidator.validateFirstName(firstName) != true)
				throw new UserValidation_CustomException("The first name is not valid");
		} catch (UserValidation_CustomException e) {
			System.err.println("Execution stopped because " + e.getMessage());
		}
	}

	// test to verify that email do not matches pattern and throws exception message

	@Test
	public void emailTest() {
		try {
			if (userValidator.validateEmail(email) != true)
				throw new UserValidation_CustomException("The email is not valid");
		} catch (UserValidation_CustomException e) {
			System.err.println("Execution stopped because " + e.getMessage());
		}
	}

	// test to verify that mobile number do not matches pattern and throws exception
	// message

	@Test
	public void phoneTest() {
		try {
			if (userValidator.validateMobileNumber(mobile) != true)
				throw new UserValidation_CustomException("The mobile is not valid");
		} catch (UserValidation_CustomException e) {
			System.err.println("Execution stopped because " + e.getMessage());
		}
	}

//// test to verify that password  do not matches pattern and throws exception message

	@Test
	public void passwordTest() {
		try {
			if (userValidator.validatePassword(password) != true)
				throw new UserValidation_CustomException("The password is not valid");
		} catch (UserValidation_CustomException e) {
			System.err.println("Execution stopped because " + e.getMessage());
		}
	}

}
