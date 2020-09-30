package Analyse_mood;

public class MoodAnalyzer {

	public String analyzeMood(String message) {
		// analyze mood method to check for sad keyword
		// if sad found it return string "SAD" otherwise return "HAPPY"
		if (message.contains("sad"))
			return "SAD";
		else
			return "HAPPY";

	}

}
