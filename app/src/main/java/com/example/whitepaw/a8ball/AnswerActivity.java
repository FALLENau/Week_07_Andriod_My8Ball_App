package com.example.whitepaw.a8ball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView answerText;
    TextView questionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        answerText = (TextView) findViewById(R.id.answer_text);
        questionText = (TextView) findViewById(R.id.question_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answer = extras.getString("answer");
        String question = extras.getString("question");
        questionText.setText(question);
        answerText.setText(answer);
    }
}
