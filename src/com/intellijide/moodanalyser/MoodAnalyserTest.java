package com.intellijide.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyserTest {
    @Test
    void  givenNullMoodShouldThrowMoodAnalysisException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String actual;
        try {
            actual = moodAnalyser.analyseMood();
        } catch (Exception e) {
            throw new RuntimeException("Invalid input " +e);
        }
        Assertions.assertEquals("happy",actual);
    }
}