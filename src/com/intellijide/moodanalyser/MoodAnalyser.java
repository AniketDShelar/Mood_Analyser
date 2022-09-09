package com.intellijide.moodanalyser;

public class MoodAnalyser {
    public static void main(String[] args){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.analyseMood(null);
    }

        public String analyseMood(String message) {
            try{
                if (message.contains("sad"))
                    return "sad";

            } catch (Exception e) {
                System.out.println("Wrong Input " +e.getMessage());
            }
                return "Happy";
        }
    }
