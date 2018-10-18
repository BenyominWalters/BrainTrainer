package com.example.bwalters.braintrainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView sumTextView;
    TextView counterTextView;

    Button answerButton;

    Random random = new Random();

    public void newSum() {

        int randomNumber1 = random.nextInt(50);
        int randomNumber2 = random.nextInt(50);
        String mySum = String.valueOf(randomNumber1) + " + " + String.valueOf(randomNumber2);
        sumTextView.setText(mySum);

    }

    int problemCounter = 0;

    public void incrementCounter() {
        problemCounter ++;
        String currentCounter = String.valueOf(problemCounter);
        counterTextView.setText(currentCounter);

    }

    public void checkAnswer(View view) {
        newSum();
        incrementCounter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sumTextView = findViewById(R.id.sumTextView);
        counterTextView = findViewById(R.id.counterTextView);
        newSum();

    }
}
