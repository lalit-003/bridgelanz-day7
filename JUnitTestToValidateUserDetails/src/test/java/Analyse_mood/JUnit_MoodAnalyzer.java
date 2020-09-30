package Analyse_mood;

import org.junit.Test;
import org.junit.Assert;

public class JUnit_MoodAnalyzer {

	MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

	// testing for sad mood by passing an string argument which contains "Sad" word
	@Test
	public void giveMessage_WhenSad_ReturnSadMood() {
		String mood = moodAnalyzer.analyzeMood("I am in Sad mood");
		Assert.assertEquals("SAD", mood);
	}

	// testing for happy mood by passing an string argument which contains
	// "Happy" word
	@Test
	public void giveMessage_WhenHappy_ReturnHappyMood() {
		String mood = moodAnalyzer.analyzeMood("I am in Happy mood");
		Assert.assertEquals("HAPPY", mood);
	}

	// testing for happy mood by passing an string argument which contains
	// "Any" word
	@Test
	public void giveMessage_WhenAnyMood_ReturnHappyMood() {
		String mood = moodAnalyzer.analyzeMood("I am in  Any mood");
		Assert.assertEquals("HAPPY", mood);
	}

}
