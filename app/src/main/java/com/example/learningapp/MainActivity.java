package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       MaterialCardView alphabets = findViewById(R.id.alphabets);
       MaterialCardView numbers = findViewById(R.id.numbers);
       MaterialCardView colours = findViewById(R.id.colours);
       MaterialCardView animals = findViewById(R.id.animals);
       MaterialCardView shapes = findViewById(R.id.shapes);

       alphabets.setOnClickListener(this);
       numbers.setOnClickListener(this);
       colours.setOnClickListener(this);
       animals.setOnClickListener(this);
       shapes.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.alphabets:
                intent = new Intent(this,AlphabetActivity.class);
                startActivity(intent);
                break;
            case R.id.numbers:
                intent = new Intent(this,NumbersActivity.class);
                startActivity(intent);
                break;
            case R.id.colours:
                intent = new Intent(this,ColoursActivity.class);
                startActivity(intent);
                break;
            case R.id.animals:
                intent = new Intent(this,AnimalsActivity2.class);
                startActivity(intent);
                break;
            case R.id.shapes:
                intent = new Intent(this,ShapesActivity.class);
                startActivity(intent);
                break;
        }
    }
}