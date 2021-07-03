package com.bridgelabz.moodanalyzer.MoodAnalyzer;

/**
 * Hello world!
 *
 */
public class MoodAnalyzer {

	public String analyseMood(String message) {
		if (message.toLowerCase().contains("sad"))
			return "SAD";
		else
			return "HAPPY";
	}
}
