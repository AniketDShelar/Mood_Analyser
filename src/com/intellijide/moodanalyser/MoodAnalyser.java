package com.intellijide.moodanalyser;

public class MoodAnalyser {
    public static void main(String[] args){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.analyseMood("I am in any mood");
    }

        public String analyseMood(String message) {
            try{
                if (message.contains("sad"))
                    return "sad";
                else
                    return "happy";
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return message;
        }
    }
