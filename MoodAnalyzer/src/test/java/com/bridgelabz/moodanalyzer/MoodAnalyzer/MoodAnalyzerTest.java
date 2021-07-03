package com.bridgelabz.moodanalyzer.MoodAnalyzer;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;


public class MoodAnalyzerTest {
	@Test
	public void givenSadMessage_WhenAnalysed_MessageShouldReturnSad() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer();
		String mood = moodAnalyser.analyseMood("sad Mood");
		// assertTrue( true );
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenAnyMoodMessage_WhenAnalysed_MessageShouldReturnHappy() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer();
		String mood = moodAnalyser.analyseMood("happy Mood");
		Assert.assertEquals("HAPPY", mood);
	}

}