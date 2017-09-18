package com.proprog.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int bluesGoal = 0;
    int redsGoal = 0;
    int bluesShot = 0;
    int redsShot = 0;
    int bluesFoul = 0;
    int redsFoul = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayGoalsBlues(bluesGoal);
        displayGoalsReds(redsGoal);

        displayShotsBlues(bluesShot);
        displayShotsReds(redsShot);

        displayFoulsBlues(bluesFoul);
        displayFoulsReds(redsFoul);

    }

    /**
     * count goals for team Blues
     */
    public void goalForBlues(View view) {
        bluesGoal += 1;
        displayGoalsBlues(bluesGoal);
    }

    /**
     * count goals for team Reds
     */
    public void goalForReds(View view) {
        redsGoal += 1;
        displayGoalsReds(redsGoal);
    }

    /**
     * count shots for team Blues
     */
    public void shotForBlues(View view) {
        bluesShot += 1;
        displayShotsBlues(bluesShot);
    }

    /**
     * count shots for team Reds
     */
    public void shotForReds(View view) {
        redsShot += 1;
        displayShotsReds(redsShot);
    }

    /**
     * count fouls for team Blues
     */
    public void foulForBlues(View view) {
        bluesFoul += 1;
        displayFoulsBlues(bluesFoul);
    }

    /**
     * count fouls for team Reds
     */
    public void foulForReds(View view) {
        redsFoul += 1;
        displayFoulsReds(redsFoul);
    }

    //manipulate text for two teams
    public void displayGoalsBlues(int goals) {
        TextView goalTextView = (TextView) findViewById(R.id.blues_goalTextView);
        goalTextView.setText(String.valueOf(goals));
    }

    public void displayGoalsReds(int goals) {
        TextView goalTextView = (TextView) findViewById(R.id.reds_goalTextView);
        goalTextView.setText(String.valueOf(goals));
    }

    public void displayShotsBlues(int shots) {
        TextView shotTextView = (TextView) findViewById(R.id.blues_shotTextView);
        shotTextView.setText(String.valueOf(shots));
    }

    public void displayShotsReds(int shots) {
        TextView shotTextView = (TextView) findViewById(R.id.reds_shotTextView);
        shotTextView.setText(String.valueOf(shots));
    }

    public void displayFoulsBlues(int fouls) {
        TextView foulTextView = (TextView) findViewById(R.id.blues_foulTextView);
        foulTextView.setText(String.valueOf(fouls));

    }

    public void displayFoulsReds(int fouls) {
        TextView foulTextView = (TextView) findViewById(R.id.reds_foulTextView);
        foulTextView.setText(String.valueOf(fouls));
    }

    // reset values for two teams
    public void resetStats(View view) {

        bluesGoal = 0;
        displayGoalsBlues(bluesGoal);

        redsGoal = 0;
        displayGoalsReds(redsGoal);

        bluesShot = 0;
        displayShotsBlues(bluesShot);

        redsShot = 0;
        displayShotsReds(redsShot);

        bluesFoul = 0;
        displayFoulsBlues(bluesFoul);

        redsFoul = 0;
        displayFoulsReds(redsFoul);
    }

}
