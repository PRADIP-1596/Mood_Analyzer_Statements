package com.bridgelabz.moodanalyzer.MoodAnalyzer;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
	private static final Assert Assertions = null;
	@Test
	public void givenSadMessage_WhenAnalysed_MessageShouldReturnSad() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("i am in sad mood");
		String mood = moodAnalyser.analyseMood();
		// assertTrue( true );
		Assertions.assertEquals("SAD", mood);
	}

	@Test
	public void givenAnyMoodMessage_WhenAnalysed_MessageShouldReturnHappy() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("i am in happy Mood");
		String mood = moodAnalyser.analyseMood();
		Assertions.assertEquals("HAPPY", mood);
	}
	 @Test
	    public void givenHappyMessage_WhenAnalysed_Message_ShouldReturnSad(){
		 MoodAnalyzer moodAnalyser = new MoodAnalyzer(" i am in happy Mood");
	        String mood = moodAnalyser.analyseMood();
	        Assertions.assertEquals("SAD", mood);
	    }

}