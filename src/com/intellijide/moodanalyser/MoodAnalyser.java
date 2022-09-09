package com.intellijide.moodanalyser;

public class MoodAnalyser {
    private String message;


    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyseMood() {
        if (this.message.contains("sad"))
            return "happy";
        else
            return "sad";
    }
}