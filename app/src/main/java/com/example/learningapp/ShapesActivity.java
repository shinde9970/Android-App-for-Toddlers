package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class ShapesActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);

        MaterialCardView circle =(MaterialCardView) findViewById(R.id.circle);
        MaterialCardView diamond =(MaterialCardView) findViewById(R.id.diamond);
        MaterialCardView heart =(MaterialCardView) findViewById(R.id.heart);
        MaterialCardView hexagon =(MaterialCardView) findViewById(R.id.hexagon);
        MaterialCardView oval =(MaterialCardView) findViewById(R.id.oval);
        MaterialCardView pentagon =(MaterialCardView) findViewById(R.id.pentagon);
        MaterialCardView rectangle =(MaterialCardView) findViewById(R.id.rectangle);
        MaterialCardView triangle =(MaterialCardView) findViewById(R.id.triangle);
        MaterialCardView square =(MaterialCardView) findViewById(R.id.square);
        MaterialCardView star =(MaterialCardView) findViewById(R.id.star);

        circle.setOnClickListener(this);
        diamond.setOnClickListener(this);
        heart.setOnClickListener(this);
        hexagon.setOnClickListener(this);
        oval.setOnClickListener(this);
        pentagon.setOnClickListener(this);
        rectangle.setOnClickListener(this);
        triangle.setOnClickListener(this);
        square.setOnClickListener(this);
        star.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        MediaPlayer mp;
        switch(view.getId()) {
            case R.id.circle:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_shapes_circle);
                mp.start();
                break;
            case R.id.diamond:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_shapes_diamond);
                mp.start();
                break;
            case R.id.heart:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_shapes_heart);
                mp.start();
                break;
            case R.id.hexagon:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_shapes_hexagon);
                mp.start();
                break;
            case R.id.oval:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_shapes_oval);
                mp.start();
                break;
            case R.id.pentagon:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_shapes_pentagon);
                mp.start();
                break;
            case R.id.rectangle:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_shapes_rectangle);
                mp.start();
                break;
            case R.id.triangle:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_shapes_triangle);
                mp.start();
                break;
            case R.id.square:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_shapes_square);
                mp.start();
                break;
            case R.id.star:
                mp = MediaPlayer.create(this, R.raw.app_src_main_res_raw_shapes_star);
                mp.start();
                break;
            default:
                break;
        }
    }
}