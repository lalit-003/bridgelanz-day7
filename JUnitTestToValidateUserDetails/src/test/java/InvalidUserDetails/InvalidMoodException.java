package InvalidUserDetails;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

// creating an custom exception class
public class InvalidMoodException extends Exception {
	// creating an enum
	public enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY
	}

	ExceptionType type;

	public InvalidMoodException(ExceptionType type, String message) {
		super(message);
		this.type = type;
		// TODO Auto-generated constructor stub
	}
}
