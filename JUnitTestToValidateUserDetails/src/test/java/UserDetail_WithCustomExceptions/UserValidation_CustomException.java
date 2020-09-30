package UserDetail_WithCustomExceptions;

import InvalidUserDetails.InvalidMoodException.ExceptionType;

//creating an custom exception class
public class UserValidation_CustomException extends Exception {

	public UserValidation_CustomException(String message) {
		super(message);

		
	}

}
