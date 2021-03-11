package com.example.wack_a_mole;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Game extends AppCompatActivity implements View.OnClickListener {

    // Set up an array of integers to hold the Button IDs of the 'moles'
    ArrayList<Integer> myButtonIDs = new ArrayList<>(0);
    //The Handler will be used to run a timer in our game
    protected Handler taskhandler = new Handler();
    //The isComplete varaiable  will tell us when time is up!
    protected Boolean isComplete = false;
    Button currentMole;
    //Use the current time as the start itme for the game
    long startTime = System.currentTimeMillis();
    //Keep track of how many times the user has hti the mole\
    int score = 0;
    //settings
    //The following variables used to configure the game.
    //establish default game configuration settings here!String playername = "default";
    int difficultylevel =2; // 1 = hard, 2 = ,medium, 3 = easy
    int numMoles = 8;       // any value between 3 and 8
    int duration = 20;      // any value up to 30 seconds
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
    }

    @Override
    public void onClick(View v) {
        //pass for now
    }

    //this method will choose a new button as the current mole
    // ** this method is provided complete as part of the activity starter.**
    public void setNewMole() {

    }

    // This method will retrieve all mole button Ids and place them into
    // our array of integer Button IDs
    public void initButtons() {

    }

    //THis method will create the timr that will allow us to switch current moles
    protected void setTimer(long time) {
        //get the time that we want our timer t olast from the input parameter
        final long elapse = time;
        //Create a new "runnable" task - this will create a itmer feature
        Runnable t = new Runnable() {
            @Override
            public void run() {
                onTImerTask(); //Change the currrent mole on the screen
                // if the game is not complete
                if (!isComplete) {
                    // create the new timer task to go off twhen the next mole should be shown
                    taskhandler.postdelayed(this, elapse);
                }
            }
        };
        taskHandler.postdelayed(t, elapse);
        //This method will change the current mole whenever the timer goes off
        protected void onTimerTask() {
            //Calculate our ending time based on the duration setting
            long endtime = startTime = (duration * 1000);

        }


    }
}