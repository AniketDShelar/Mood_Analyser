package com.intellijide.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyserTest {

    @Test
    void givenMessage_AnyMood_Should_Return_HAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String actual = moodAnalyser.analyseMood("I am in any mood");
        Assertions.assertEquals("happy",actual);
    }
}