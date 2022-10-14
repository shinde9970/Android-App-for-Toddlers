package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

public class AlphabetActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        MaterialCardView a =(MaterialCardView) findViewById(R.id.a);
        MaterialCardView b =(MaterialCardView) findViewById(R.id.b);
        MaterialCardView c =(MaterialCardView) findViewById(R.id.c);
        MaterialCardView d =(MaterialCardView) findViewById(R.id.d);
        MaterialCardView e =(MaterialCardView) findViewById(R.id.e);
        MaterialCardView f =(MaterialCardView) findViewById(R.id.f);
        MaterialCardView g =(MaterialCardView) findViewById(R.id.g);
        MaterialCardView h =(MaterialCardView) findViewById(R.id.h);
        MaterialCardView i =(MaterialCardView) findViewById(R.id.i);
        MaterialCardView j =(MaterialCardView) findViewById(R.id.j);
        MaterialCardView k =(MaterialCardView) findViewById(R.id.k);
        MaterialCardView l =(MaterialCardView) findViewById(R.id.l);
        MaterialCardView m =(MaterialCardView) findViewById(R.id.m);
        MaterialCardView n =(MaterialCardView) findViewById(R.id.n);
        MaterialCardView o =(MaterialCardView) findViewById(R.id.o);
        MaterialCardView p =(MaterialCardView) findViewById(R.id.p);
        MaterialCardView q =(MaterialCardView) findViewById(R.id.q);
        MaterialCardView r =(MaterialCardView) findViewById(R.id.r);
        MaterialCardView s =(MaterialCardView) findViewById(R.id.s);
        MaterialCardView t =(MaterialCardView) findViewById(R.id.t);
        MaterialCardView u =(MaterialCardView) findViewById(R.id.u);
        MaterialCardView v =(MaterialCardView) findViewById(R.id.v);
        MaterialCardView w =(MaterialCardView) findViewById(R.id.w);
        MaterialCardView x =(MaterialCardView) findViewById(R.id.x);
        MaterialCardView y =(MaterialCardView) findViewById(R.id.y);
        MaterialCardView z =(MaterialCardView) findViewById(R.id.z);





        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        MediaPlayer mp;
        switch(view.getId()) {
            case R.id.a:
                mp = MediaPlayer.create(this, R.raw.a);
                mp.start();
                break;
            case R.id.b:
                mp = MediaPlayer.create(this, R.raw.b);
                mp.start();
                break;
            case R.id.c:
                mp = MediaPlayer.create(this, R.raw.c);
                mp.start();
                break;
            case R.id.d:
                mp = MediaPlayer.create(this, R.raw.d);
                mp.start();
                break;
            case R.id.e:
                mp = MediaPlayer.create(this, R.raw.e);
                mp.start();
                break;
            case R.id.f:
                mp = MediaPlayer.create(this, R.raw.f);
                mp.start();
                break;
            case R.id.g:
                mp = MediaPlayer.create(this, R.raw.g);
                mp.start();
                break;
            case R.id.h:
                mp = MediaPlayer.create(this, R.raw.h);
                mp.start();
                break;
            case R.id.i:
                mp = MediaPlayer.create(this, R.raw.i);
                mp.start();
                break;
            case R.id.j:
                mp = MediaPlayer.create(this, R.raw.j);
                mp.start();
                break;
            case R.id.k:
                mp = MediaPlayer.create(this, R.raw.k);
                mp.start();
                break;
            case R.id.l:
                mp = MediaPlayer.create(this, R.raw.l);
                mp.start();
                break;
            case R.id.m:
                mp = MediaPlayer.create(this, R.raw.m);
                mp.start();
                break;
            case R.id.n:
                mp = MediaPlayer.create(this, R.raw.n);
                mp.start();
                break;
            case R.id.o:
                mp = MediaPlayer.create(this, R.raw.o);
                mp.start();
                break;
            case R.id.p:
                mp = MediaPlayer.create(this, R.raw.p);
                mp.start();
                break;
            case R.id.q:
                mp = MediaPlayer.create(this, R.raw.q);
                mp.start();
                break;
            case R.id.r:
                mp = MediaPlayer.create(this, R.raw.r);
                mp.start();
                break;
            case R.id.s:
                mp = MediaPlayer.create(this, R.raw.s);
                mp.start();
                break;
            case R.id.t:
                mp = MediaPlayer.create(this, R.raw.t);
                mp.start();
                break;
            case R.id.u:
                mp = MediaPlayer.create(this, R.raw.u);
                mp.start();
                break;
            case R.id.v:
                mp = MediaPlayer.create(this, R.raw.v);
                mp.start();
                break;
            case R.id.w:
                mp = MediaPlayer.create(this, R.raw.w);
                mp.start();
                break;
            case R.id.x:
                mp = MediaPlayer.create(this, R.raw.x);
                mp.start();
                break;
            case R.id.y:
                mp = MediaPlayer.create(this, R.raw.y);
                mp.start();
                break;
            case R.id.z:
                mp = MediaPlayer.create(this, R.raw.z);
                mp.start();
                break;
        }
    }
}