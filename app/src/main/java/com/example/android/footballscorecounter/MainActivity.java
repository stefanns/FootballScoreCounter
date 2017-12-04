package com.example.android.footballscorecounter;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scoreLiverpool = 0;         // keep track of score for Liverpool
    int scoreManchester = 0;        // keep track of score for Manchester
    int foulLiverpool = 0;          // keep track of fouls for Liverpool
    int foulManchester = 0;         // keep track of fouls for Manchester
    int yellowCardLiverpool = 0;    // keep track of yellow cards for Liverpool
    int redCardLiverpool = 0;       // keep track of red cards Liverpool
    int yellowCardManchester = 0;   // keep track of yellow card for Manchester
    int redCardManchester = 0;      // keep track of red cards for Manchester


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //For saving variables
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("scoreLiverpool", scoreLiverpool);
        savedInstanceState.putInt("scoreManchester", scoreManchester);
        savedInstanceState.putInt("foulLiverpool", foulLiverpool);
        savedInstanceState.putInt("foulManchester", foulManchester);
        savedInstanceState.putInt("redCardLiverpool", redCardLiverpool);
        savedInstanceState.putInt("yellowCardLiverpool", yellowCardLiverpool);
        savedInstanceState.putInt("redCardManchester", redCardManchester);
        savedInstanceState.putInt("yellowCardManchester", yellowCardManchester);

    }

    // for restoring variables
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreLiverpool = savedInstanceState.getInt("scoreLiverpool");
        displayLiverpoolScore(scoreLiverpool);
        scoreManchester = savedInstanceState.getInt("scoreManchester");
        displayManchesterScore(scoreManchester);
        foulLiverpool = savedInstanceState.getInt("foulLiverpool");
        displayfoulForLiverpool(foulLiverpool);
        foulManchester = savedInstanceState.getInt("foulManchester");
        displayfoulForManchester(foulManchester);
        redCardLiverpool = savedInstanceState.getInt("redCardLiverpool");
        displayredCardLiverpool(redCardLiverpool);
        yellowCardLiverpool = savedInstanceState.getInt("yellowCardLiverpool");
        displayyellowCardLiverpool(yellowCardLiverpool);
        redCardManchester = savedInstanceState.getInt("redCardManchester");
        displayredCardManchester(redCardManchester);
        yellowCardManchester = savedInstanceState.getInt("yellowCardManchester");
        displayyellowCardManchester(yellowCardManchester);

    }

    //LIVERPOOL
    // goal for Liverpool
    public void goalForLiverpool(View v) {
        ++scoreLiverpool;
        displayLiverpoolScore(scoreLiverpool);
    }

    // foul for Liverpool
    public void foulForLiverpool(View v) {
        ++foulLiverpool;
        displayfoulForLiverpool(foulLiverpool);
    }

    // red card for Liverpool
    public void redCardLiverpool(View v) {
        ++redCardLiverpool;
        if (redCardLiverpool < 5)
            displayredCardLiverpool(redCardLiverpool);
        else {
            scoreManchester = 3;
            scoreLiverpool = 0;
            redCardLiverpool = 5;
            displayLiverpoolScore(scoreLiverpool);
            displayManchesterScore(scoreManchester);
            displayredCardLiverpool(redCardLiverpool);
            scoreLiverpool = 0;
            scoreManchester = 0;
            foulLiverpool = 0;
            foulManchester = 0;
            yellowCardLiverpool = 0;
            redCardLiverpool = 0;
            yellowCardManchester = 0;
            redCardManchester = 0;
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
        if (redCardManchester < 5)
            displayredCardManchester(redCardManchester);
        else {
            scoreLiverpool = 3;
            scoreManchester = 0;
            redCardManchester = 5;
            displayLiverpoolScore(scoreLiverpool);
            displayManchesterScore(scoreManchester);
            displayredCardManchester(redCardManchester);
            scoreLiverpool = 0;
            scoreManchester = 0;
            foulLiverpool = 0;
            foulManchester = 0;
            yellowCardLiverpool = 0;
            redCardLiverpool = 0;
            yellowCardManchester = 0;
            redCardManchester = 0;
        }

    }


    // yellow card for Manchester
    public void yellowCardManchester(View v) {
        ++yellowCardManchester;
        displayyellowCardManchester(yellowCardManchester);
    }

    // method used to reset score
    public void resetScore(View v) {
        scoreLiverpool = 0;
        scoreManchester = 0;
        foulLiverpool = 0;
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
        displayLiverpoolScore(scoreLiverpool);
        displayfoulForManchester(foulManchester);
        displayfoulForLiverpool(foulLiverpool);
    }

    /**
     * Displays the score, fouls, yellow and red cards for Liverpool and Manchester
     */
    public void displayLiverpoolScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.liverpol_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayManchesterScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.manchester_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayfoulForLiverpool(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.liverpool_foul);
        scoreView.setText(String.valueOf(fouls));
    }

    public void displayfoulForManchester(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.manchester_foul);
        scoreView.setText(String.valueOf(fouls));
    }

    public void displayyellowCardLiverpool(int cards) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_liverpool);
        scoreView.setText(String.valueOf(cards));
    }

    public void displayredCardLiverpool(int cards) {
        TextView scoreView = (TextView) findViewById(R.id.red_liverpool);
        scoreView.setText(String.valueOf(cards));
    }

    public void displayyellowCardManchester(int cards) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_manchester);
        scoreView.setText(String.valueOf(cards));
    }

    public void displayredCardManchester(int cards) {
        TextView scoreView = (TextView) findViewById(R.id.red_manchester);
        scoreView.setText(String.valueOf(cards));
    }

}
