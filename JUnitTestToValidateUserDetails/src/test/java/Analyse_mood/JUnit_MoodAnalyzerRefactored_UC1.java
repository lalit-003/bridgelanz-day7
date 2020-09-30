package Analyse_mood;

import org.junit.Assert;
import org.junit.Test;

public class JUnit_MoodAnalyzerRefactored_UC1 {

	MoodAnalyzerRefactored moodAnalyzerRefactored;

	// testing for sad mood by passing an string argument which contains "Sad" word
	@Test
	public void giveMessage_WhenSad_ReturnSadMood() {
		moodAnalyzerRefactored = new MoodAnalyzerRefactored("I am in sad mood");
		String mood = moodAnalyzerRefactored.analyzeMood();
		Assert.assertEquals("SAD", mood);
	}

	// testing for happy mood by passing an string argument which contains
	// "Happy" word
	@Test
	public void giveMessage_WhenHappy_ReturnHappyMood() {
		moodAnalyzerRefactored = new MoodAnalyzerRefactored("I am in happy mood");
		String mood = moodAnalyzerRefactored.analyzeMood();
		Assert.assertEquals("HAPPY", mood);
	}

	// testing for happy mood by passing an string argument which contains
	// "Any" word
	@Test
	public void giveMessage_WhenAnyMood_ReturnHappyMood() {
		moodAnalyzerRefactored = new MoodAnalyzerRefactored("I am in any  mood");
		String mood = moodAnalyzerRefactored.analyzeMood();
		Assert.assertEquals("HAPPY", mood);
	}

}
