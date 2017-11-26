package com.myapp.indra.multiplechoicequiz;

public class QuestionLibrary {
    private String mQuestions [] = {
            "What is our planet called ?",
            "Sun rises in which direction ?",
            "Sunset happens in which direction ?",
            "What do we call our star ?"
    };

    private String mChoices [][] = {
            {"Moon","Mars","Earth"},
            {"South","North","East"},
            {"West","East","South"},
            {"Sun","Earth","Jupitor"},
    };

    private String mCorrectAnswers [] = {"Earth","East","West","Sun"};

    public String getQuestion(int queNumber){
        String question = mQuestions[queNumber];
        return question;
    }

    public String getChoice1(int choiceNumber){
        String choice1 = mChoices[choiceNumber][0];
        return  choice1;
    }

    public String getChoice2(int choiceNumber){
        String choice2 = mChoices[choiceNumber][1];
        return  choice2;
    }

    public String getChoice3(int choiceNumber){
        String choice3 = mChoices[choiceNumber][2];
        return  choice3;
    }

    public String getCorrectAnswer(int queNumber){
        String correctAns = mCorrectAnswers[queNumber];
        return correctAns;
    }

    public int getQuesArrayLength(){
        return mQuestions.length;
    }
}
