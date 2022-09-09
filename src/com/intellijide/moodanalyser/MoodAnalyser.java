package com.intellijide.moodanalyser;

public class MoodAnalyser {
    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.analyseMood("I am in sad mood");
    }

        public String analyseMood(String message) {
            if (message.contains("sad")){
                return "sad";
            }else {
                return "happy";
            }
        }
    }
