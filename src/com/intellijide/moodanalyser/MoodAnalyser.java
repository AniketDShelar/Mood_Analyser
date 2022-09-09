package com.intellijide.moodanalyser;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws Exception {
        try {

            if (this.message.contains("sad"))
                return "sad";
            else
                return "happy";
        } catch (Exception e) {
            System.out.println("Invalid input" + e.getMessage());
        }
        return "happy";
    }
}
