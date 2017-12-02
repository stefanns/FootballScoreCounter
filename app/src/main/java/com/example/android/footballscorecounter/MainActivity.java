package com.example.android.footballscorecounter;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scoreLiverpool = 0;  // keep track of score for Liverpool
    int scoreManchester = 0; // keep track of score for Manchester
    int foulLiverpool = 0;   // keep track of fouls for Liverpool
    int foulManchester = 0;
    int yellowCardLiverpool = 0;
    int redCardLiverpool = 0;
    int yellowCardManchester = 0;
    int redCardManchester = 0;//   keep track of fouls for Manchester

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //LIVERPOOL
    // Goal for Liverpol
    public void goalForLiverpool(View v) {
        ++scoreLiverpool;
        displayLiverpolScore(scoreLiverpool);
    }

    // foul for Liverpool
    public void foulForLiverpool(View v) {
        ++foulLiverpool;
        displayfoulForLiverpool(foulLiverpool);
    }

    // red card for Liverpool
    public void redCardLiverpool(View v) {
        ++redCardLiverpool;
        if (redCardLiverpool < 4)
            displayredCardLiverpool(redCardLiverpool);
        else {
            scoreManchester = 3;
            scoreLiverpool = 0;
            redCardLiverpool = 4;
            displayLiverpolScore(scoreLiverpool);
            displayManchesterScore(scoreManchester);
            displayredCardLiverpool(redCardLiverpool);
        }
    }

    //yellow card for liverpool
    public void yellowCardLiverpool(View v) {
        ++yellowCardLiverpool;
        displayyellowCardLiverpool(yellowCardLiverpool);
    }
    //MANCHESTER
    //goal for Manchester
    public void goalForManchester(View v) {
        ++scoreManchester;
        displayManchesterScore(scoreManchester);
    }

    // foul for Manchester
    public void foulForManchester(View v) {
        ++foulManchester;
        displayfoulForManchester(foulManchester);
    }

    // red card for Manchester
    public void redCardManchester(View v) {
        ++redCardManchester;
        if (redCardManchester < 4)
            displayredCardManchester(redCardManchester);
        else {
            scoreLiverpool = 3;
            scoreManchester = 0;
            redCardManchester = 4;
            displayLiverpolScore(scoreLiverpool);
            displayManchesterScore(scoreManchester);
            displayredCardManchester(redCardManchester);
        }
    }

    //yellow card for Manchester
    public void yellowCardManchester(View v) {
        ++yellowCardManchester;
        displayyellowCardManchester(yellowCardManchester);
    }

    public void resetScore(View v) {
        scoreLiverpool = 0;  // keep track of score for Liverpool
        scoreManchester = 0; // keep track of score for Manchester
        foulLiverpool = 0;   // keep track of fouls for Liverpool
        foulManchester = 0;
        yellowCardLiverpool = 0;
        redCardLiverpool = 0;
        yellowCardManchester = 0;
        redCardManchester = 0;
        displayyellowCardManchester(yellowCardManchester);
        displayredCardManchester(redCardManchester);
        displayyellowCardLiverpool(yellowCardLiverpool);
        displayredCardLiverpool(redCardLiverpool);
        displayManchesterScore(scoreManchester);
        displayLiverpolScore(scoreLiverpool);
        displayfoulForManchester(foulManchester);
        displayfoulForLiverpool(foulLiverpool);
    }

    /**
     * Displays the score, fouls, yellow and red cards for Liverpool and Manchester
     */
    public void displayLiverpolScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.liverpol_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayManchesterScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.manchester_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayfoulForLiverpool(int score) {
        TextView scoreView = (TextView) findViewById(R.id.liverpool_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void displayfoulForManchester(int score) {
        TextView scoreView = (TextView) findViewById(R.id.manchester_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void displayyellowCardLiverpool(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_liverpool);
        scoreView.setText(String.valueOf(score));
    }

    public void displayredCardLiverpool(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_liverpool);
        scoreView.setText(String.valueOf(score));
    }

    public void displayyellowCardManchester(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_manchester);
        scoreView.setText(String.valueOf(score));
    }

    public void displayredCardManchester(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_manchester);
        scoreView.setText(String.valueOf(score));
    }
}
