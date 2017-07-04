package com.example.whitepaw.a8ball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class My8BallActivity extends AppCompatActivity {
    EditText questionEditText;
    Button shakeButton;
    Answers answers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my8_ball);
        Log.d(getClass().toString(), "onCreate called");

        questionEditText = (EditText) findViewById(R.id.question_text);
        shakeButton = (Button) findViewById(R.id.shake_button);
    }

    public void onShakeButtonClicked(View Button) {
        answers = new Answers();
        String question = questionEditText.getText().toString();
        Log.d(getClass().toString(), "onShakeButtonClicked was called");
        Log.d(getClass().toString(), "The question asked was '" + question + "'");
        String answer = answers.getAnswer();

//        answerText.setText(answers.getAnswer());

        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("answer", answer);
        intent.putExtra("question", question);
        startActivity(intent);
    }

}
