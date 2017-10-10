package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton askbutton;

        askbutton = (ImageButton) findViewById(R.id.askButton);

        final ImageView asQuestion = (ImageView) findViewById(R.id.askQuestion);

         final int[] questionArray = {
            R.drawable.askquestions2,
            R.drawable.askquestions3,
            R.drawable.askquestions4,
            R.drawable.askquestions5,
            R.drawable.askquestions6,
            R.drawable.askquestions7,
            R.drawable.askquestions8,
            R.drawable.askquestions9
         };

         askbutton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Log.d("Ask", "Hit it Baby!!");
                 Random randomnumber = new Random();

                 int number = randomnumber.nextInt(8);
                 asQuestion.setImageResource(questionArray[number]);
             }
         });

        }

    }

