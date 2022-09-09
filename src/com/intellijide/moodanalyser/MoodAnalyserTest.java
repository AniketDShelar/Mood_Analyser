package com.intellijide.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyserTest {

    @Test
    void analyseMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String actual = moodAnalyser.analyseMood("I am in sad mood");
        Assertions.assertEquals("sad",actual);
    }
}