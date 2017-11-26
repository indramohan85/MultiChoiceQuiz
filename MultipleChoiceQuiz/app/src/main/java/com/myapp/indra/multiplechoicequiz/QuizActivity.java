package com.myapp.indra.multiplechoicequiz;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonQuit;

    private String mAnswer;
    private int mScore = 0;
    private int mQuesNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);

        mButtonQuit = (Button)findViewById(R.id.quit);

        updateQuestion();

        mButtonQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

        //Start of button listener for button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Logic for button click
                if(mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this,"Correct", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(QuizActivity.this,"Wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //End of button listner for button1

        //Start of button listener for button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Logic for button click
                if(mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this,"Correct", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(QuizActivity.this,"Wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //End of button listner for button2

        //Start of button listener for button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Logic for button click
                if(mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this,"Correct", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(QuizActivity.this,"Wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //End of button listner for button3
    }

    private void updateQuestion() {
        if(mQuestionLibrary.getQuesArrayLength() > mQuesNumber) {
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuesNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuesNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuesNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuesNumber));

            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuesNumber);
            mQuesNumber++;
        }
    }

    private void updateScore(int mScore) {
        mScoreView.setText("" + mScore);
    }
}
