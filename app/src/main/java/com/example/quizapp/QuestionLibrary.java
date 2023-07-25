package com.example.quizapp;

public class QuestionLibrary {
    private String mQuestions [] = {
            "Which part of the plants holds it in the soil?",
            "This part of the plant absorbs energy from the sun.",
            "This part of the plant attracts bees, butterflies ant human",
            "The _holds the plant upright"
    };

    private String mChoices [][] = {
            {"Roots", "Stem", "Flower"},
            {"Fruits", "Leaves", "Seeds"},
            {"Bark", "Flower", "Roots"},
            {"Fruits", "Leaves", "Seeds"}
    };

    private String mCorrectAnswers[] = {
            "Roots",
            "Leaves",
            "Flower",
            "Seeds"
    };

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0=mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice0=mChoices[a][1];
        return choice0;
    }

    public String getChoice3(int a){
        String choice0=mChoices[a][2];
        return choice0;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
