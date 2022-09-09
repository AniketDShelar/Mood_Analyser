package com.intellijide.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {

    @Test
    void voidGivenSadMoodShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String actual = moodAnalyser.analyseMood("I am in sad mood");
        Assertions.assertEquals("sad",actual);
    }
}