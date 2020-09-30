package Analyse_mood;

public class MoodAnalyzerRefactored {

	public String message;

	public MoodAnalyzerRefactored(String message) {
		this.message = message;
	}
	/*
	 * public String analyzeMood(String message) { this.message = message; return
	 * analyzeMood();
	 * 
	 * }
	 * 
	 */

	// analyze mood method to check for sad keyword
	// if sad found it return string "SAD" otherwise return "HAPPY"
// also return "HAPPY" in case of null input 
	public String analyzeMood() {
		// TODO Auto-generated method stub
		try {
			if (message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException nu) {
			return "HAPPY";
		}
	}

}
