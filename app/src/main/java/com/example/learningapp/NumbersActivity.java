package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class NumbersActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        MaterialCardView one = (MaterialCardView) findViewById(R.id.one);
        MaterialCardView two = (MaterialCardView) findViewById(R.id.two);
        MaterialCardView three = (MaterialCardView) findViewById(R.id.three);
        MaterialCardView four = (MaterialCardView) findViewById(R.id.four);
        MaterialCardView five = (MaterialCardView) findViewById(R.id.five);
        MaterialCardView six = (MaterialCardView) findViewById(R.id.six);
        MaterialCardView seven = (MaterialCardView) findViewById(R.id.seven);
        MaterialCardView eight = (MaterialCardView) findViewById(R.id.eight);
        MaterialCardView nine = (MaterialCardView) findViewById(R.id.nine);
        MaterialCardView ten = (MaterialCardView) findViewById(R.id.ten);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        ten.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        MediaPlayer mp;
        switch (view.getId()) {
            case R.id.one:
                mp = MediaPlayer.create(this, R.raw.one);
                mp.start();
                break;
            case R.id.two:
                mp = MediaPlayer.create(this, R.raw.two);
                mp.start();
                break;
            case R.id.three:
                mp = MediaPlayer.create(this, R.raw.three);
                mp.start();
                break;
            case R.id.four:
                mp = MediaPlayer.create(this, R.raw.four);
                mp.start();
                break;
            case R.id.five:
                mp = MediaPlayer.create(this, R.raw.five);
                mp.start();
                break;
            case R.id.six:
                mp = MediaPlayer.create(this, R.raw.six);
                mp.start();
                break;
            case R.id.seven:
                mp = MediaPlayer.create(this, R.raw.seven);
                mp.start();
                break;
            case R.id.eight:
                mp = MediaPlayer.create(this, R.raw.eight);
                mp.start();
                break;
            case R.id.nine:
                mp = MediaPlayer.create(this, R.raw.nine);
                mp.start();
                break;
            case R.id.ten:
                mp = MediaPlayer.create(this, R.raw.ten);
                mp.start();
                break;
        }
    }
}
