package InvalidUserDetails;

import java.util.EmptyStackException;

import javax.management.InvalidAttributeValueException;

import InvalidUserDetails.InvalidMoodException.ExceptionType;

public class MoodAnalyzer_ForCustomException {

	private String message;

	public MoodAnalyzer_ForCustomException(String message) {
		this.message = message;
	}

	public String analyzeMood() {

		try {
			return analyzeMoodAgain();
		} catch (InvalidMoodException e) {
			return "HAPPY";
		}

	}

	// analyze mood method to check for sad keyword
	// if sad found it return string "SAD" otherwise return "HAPPY"
	// also return Exception message in case of null or empty input

	public String analyzeMoodAgain() throws InvalidMoodException {
		// TODO Auto-generated method stub
		try {
			if (message.length() == 0)
				throw new InvalidMoodException(ExceptionType.ENTERED_EMPTY,
						"Empty  Values not accepted -Please enter valid Mood");
			if (message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException | EmptyStackException e) {
			throw new InvalidMoodException(ExceptionType.ENTERED_NULL,
					"Null  Values not accepted -Please enter valid Mood");
		}

	}
}
