package InvalidUserDetails;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JUnit_WithCustomException_TestClass_UC3 {
// testing for null input
	@Test
	public void givenNull_ShouldReturnHappy() {
		try {
			MoodAnalyzer_ForCustomException moodAnalyzer_ForCustomException = new MoodAnalyzer_ForCustomException(null);
			String mood = null;

			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(InvalidMoodException.class);
			mood = moodAnalyzer_ForCustomException.analyzeMoodAgain();
			Assert.assertEquals("HAPPY", mood);

		} catch (InvalidMoodException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

// testing for empty
	@Test
	public void givenNullOrEmpty_ShouldReturnExceptionMessage() {
		MoodAnalyzer_ForCustomException moodAnalyzer_ForCustomException = new MoodAnalyzer_ForCustomException("");

		try {
			moodAnalyzer_ForCustomException.analyzeMoodAgain();

		} catch (InvalidMoodException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
}
