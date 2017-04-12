package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int yourScore = 0;

    int optimalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for You by 1 point.
     */
    public void addOneForYourScore(View v) {
        yourScore = yourScore + 1;
        displayForYou(yourScore);
    }

    /**
     * Increase the score for You by 2 points.
     */

    public void addTwoForYourScore(View v) {
        yourScore = yourScore + 2;
        displayForYou(yourScore);
    }

    /**
     * Increase the score for You by 3 points.
     */
    public void addThreeForYourScore(View v) {
        yourScore = yourScore + 3;
        displayForYou(yourScore);
    }

    /**
     * Increase the score for You by 10 points.
     */
    public void addTenForYourScore(View v) {
        yourScore = yourScore + 10;
        displayForYou(yourScore);
    }

    /**
     * Calculate and display the value of the Optimal Score for Water (2 points).
     */
    public void addTwoForOptimalScore(View v) {
        if (optimalScore == 2)
            return;
        optimalScore = optimalScore + 2;
        displayForOptimalScore(optimalScore);
    }

    /**
     * Calculate and display the value of the Optimal Score for Sleep (8 points).
     */

    public void addEightForOptimalScore(View v) {
        if (optimalScore == 8)
            return;
        optimalScore = optimalScore + 8;
        displayForOptimalScore(optimalScore);

    }

    /**
     * Calculate and display the value of the Optimal Score for Fruits and Vegetables (6 points).
     */
    public void addSixForOptimalScore(View v) {
        if (optimalScore == 6)
            return;
        optimalScore = optimalScore + 6;
        displayForOptimalScore(optimalScore);
    }

    /**
     * Calculate and display the value of the Optimal Score for Exercise (30 points).
     */
    public void addThirtyForOptimalScore(View v) {
        if (optimalScore == 30)
            return;
        optimalScore = optimalScore + 30;
        displayForOptimalScore(optimalScore);
    }

    /**
     * Reset the scores for You and for Optimal Data.
     */
    public void resetScore(View v) {
        yourScore = 0;
        displayForYou(yourScore);
        optimalScore = 0;
        displayForOptimalScore(optimalScore);
    }

    /**
     * Displays the given score for You.
     */
    public void displayForYou(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Your_Score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Optimal Data.
     */
    public void displayForOptimalScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Optimal_Score);
        scoreView.setText(String.valueOf(score));
    }
}
