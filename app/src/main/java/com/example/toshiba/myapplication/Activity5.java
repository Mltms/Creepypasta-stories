package com.example.toshiba.myapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Activity5 extends AppCompatActivity {

    private MediaPlayer mediaPlayer, mediaPlayer1, mediaPlayer2;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        b1 = (Button) findViewById(R.id.P1B1);
        b2 = (Button) findViewById(R.id.P1B2);
        b3 = (Button) findViewById(R.id.P1B3);
        b4 = (Button) findViewById(R.id.P1B4);
        b5 = (Button) findViewById(R.id.P1B5);
        b6 = (Button) findViewById(R.id.P1B6);


        mediaPlayer = MediaPlayer.create(this, R.raw.kingspook_i_was_recently_hired_by_a_staffing_agency);
        mediaPlayer1 = MediaPlayer.create(this, R.raw.kingspook_the_children_found_a_flower);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.kingspook_it_gets_better);


    }


    public void onClick(View v) {
        mediaPlayer.start();

    }

    public void onClick1(View v) {
        mediaPlayer.pause();
    }

    public void onClick2(View v) {
        mediaPlayer1.start();
    }

    public void onClick3(View v) {
        mediaPlayer1.pause();
    }

    public void onClick4(View v) {
        mediaPlayer2.start();
    }

    public void onClick5(View v) {
        mediaPlayer2.pause();
    }


}