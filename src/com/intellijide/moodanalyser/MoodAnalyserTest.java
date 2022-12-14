package com.intellijide.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyserTest {

    @Test
    void givenAnyMoodShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String actual = moodAnalyser.analyseMood();
        Assertions.assertEquals("sad",actual);
    }
}