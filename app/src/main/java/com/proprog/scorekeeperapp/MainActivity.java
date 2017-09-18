package com.proprog.scorekeeperapp;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int blues_goal = 0;
    int reds_goal = 0;
    int blues_shot = 0;
    int reds_shot = 0;
    int blues_foul = 0;
    int reds_foul = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayGoalsBlues(blues_goal);
        displayGoalsReds(reds_goal);

        displayShotsBlues(blues_shot);
        displayShotsReds(reds_shot);

        displayFoulsBlues(blues_foul);
        displayFoulsReds(reds_foul);

    }

    /**
     * count goals for team Blues
     *
     * @param view
     */
    public void goalForBlues(View view) {
        blues_goal += 1;
        displayGoalsBlues(blues_goal);
    }

    /**
     * count goals for team Reds
     *
     * @param view
     */
    public void goalForReds(View view) {
        reds_goal += 1;
        displayGoalsReds(reds_goal);
    }

    /**
     * count shots for team Blues
     *
     * @param view
     */
    public void shotForBlues(View view) {
        blues_shot += 1;
        displayShotsBlues(blues_shot);
    }

    /**
     * count shots for team Reds
     *
     * @param view
     */
    public void shotForReds(View view) {
        reds_shot += 1;
        displayShotsReds(reds_shot);
    }

    /**
     * count fouls for team Blues
     *
     * @param view
     */
    public void foulForBlues(View view) {
        blues_foul += 1;
        displayFoulsBlues(blues_foul);
    }

    /**
     * count fouls for team Reds
     *
     * @param view
     */
    public void foulForReds(View view) {
        reds_foul += 1;
        displayFoulsReds(reds_foul);
    }

    //manipulate text
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

    public void resetStats(View view) {

        blues_goal = 0;
        displayGoalsBlues(blues_goal);

        reds_goal = 0;
        displayGoalsReds(reds_goal);

        blues_shot = 0;
        displayShotsBlues(blues_shot);

        reds_shot = 0;
        displayShotsReds(reds_shot);

        blues_foul = 0;
        displayFoulsBlues(blues_foul);

        reds_foul = 0;
        displayFoulsReds(reds_foul);
    }

}
