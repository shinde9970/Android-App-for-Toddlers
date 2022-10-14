package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class ColoursActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colours);

        MaterialCardView red =(MaterialCardView) findViewById(R.id.red);
        MaterialCardView blue =(MaterialCardView) findViewById(R.id.blue);
        MaterialCardView green =(MaterialCardView) findViewById(R.id.green);
        MaterialCardView purple =(MaterialCardView) findViewById(R.id.purple);
        MaterialCardView yellow =(MaterialCardView) findViewById(R.id.yellow);
        MaterialCardView orange =(MaterialCardView) findViewById(R.id.orange);

        red.setOnClickListener(this);
        blue.setOnClickListener(this);
        green.setOnClickListener(this);
        purple.setOnClickListener(this);
        yellow.setOnClickListener(this);
        orange.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        MediaPlayer mp;
        switch(view.getId()) {
            case R.id.red:
                mp = MediaPlayer.create(this, R.raw.red);
                mp.start();
                break;
            case R.id.blue:
                mp = MediaPlayer.create(this, R.raw.blue);
                mp.start();
                break;
            case R.id.purple:
                mp = MediaPlayer.create(this, R.raw.purple);
                mp.start();
                break;
            case R.id.orange:
                mp = MediaPlayer.create(this, R.raw.orange);
                mp.start();
                break;
            case R.id.yellow:
                mp = MediaPlayer.create(this, R.raw.yellow);
                mp.start();
                break;
            case R.id.green:
                mp = MediaPlayer.create(this, R.raw.green);
                mp.start();
        }
    }
}