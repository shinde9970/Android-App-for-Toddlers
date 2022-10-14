package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class AnimalsActivity2 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_animals2);


        MaterialCardView bull =(MaterialCardView) findViewById(R.id.bull);
        MaterialCardView cat =(MaterialCardView) findViewById(R.id.cat);
        MaterialCardView chicken =(MaterialCardView) findViewById(R.id.chicken);
        MaterialCardView cow =(MaterialCardView) findViewById(R.id.cow);
        MaterialCardView dog =(MaterialCardView) findViewById(R.id.dog);
        MaterialCardView donkey =(MaterialCardView) findViewById(R.id.donkey);
        MaterialCardView duck =(MaterialCardView) findViewById(R.id.duck);
        MaterialCardView goat =(MaterialCardView) findViewById(R.id.goat);
        MaterialCardView goose =(MaterialCardView) findViewById(R.id.goose);
        MaterialCardView hen =(MaterialCardView) findViewById(R.id.hen);
        MaterialCardView horse =(MaterialCardView) findViewById(R.id.horse);
        MaterialCardView pig =(MaterialCardView) findViewById(R.id.pig);
        MaterialCardView rabbit =(MaterialCardView) findViewById(R.id.rabbit);
        MaterialCardView sheep =(MaterialCardView) findViewById(R.id.sheep);



        bull.setOnClickListener(this);
        cat.setOnClickListener(this);
        chicken.setOnClickListener(this);
        cow.setOnClickListener(this);
        dog.setOnClickListener(this);
        donkey.setOnClickListener(this);
        duck.setOnClickListener(this);
        goat.setOnClickListener(this);
        goose.setOnClickListener(this);
        hen.setOnClickListener(this);
        horse.setOnClickListener(this);
        pig.setOnClickListener(this);
        rabbit.setOnClickListener(this);
        sheep.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        MediaPlayer mp;
        switch(view.getId()) {
            case R.id.bull:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_animals_bull);
                mp.start();
                break;
            case R.id.cat:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_animals_cat);
                mp.start();
                break;
            case R.id.chicken:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_animals_chick);
                mp.start();
                break;
            case R.id.cow:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_animals_cow);
                mp.start();
                break;
            case R.id.dog:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_animals_dog);
                mp.start();
                break;
            case R.id.donkey:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_animals_donkey);
                mp.start();
                break;
            case R.id.duck:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_animals_duck);
                mp.start();
                break;
            case R.id.goat:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_animals_goat);
                mp.start();
                break;
            case R.id.goose:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_animals_goose);
                mp.start();
                break;
            case R.id.hen:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_animals_hen);
                mp.start();
                break;
            case R.id.horse:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_animals_horse);
                mp.start();
                break;
            case R.id.pig:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_animals_pig);
                mp.start();
                break;
            case R.id.rabbit:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_animals_rabbit);
                mp.start();
                break;
            case R.id.sheep:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_animals_sheep);
                mp.start();
                break;
        }
    }
}