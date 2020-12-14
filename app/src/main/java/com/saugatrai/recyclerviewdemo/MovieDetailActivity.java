package com.saugatrai.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MovieDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView movieName = findViewById(R.id.movie_name);
        String movie = getIntent().getStringExtra(MainActivity.MOVIE_KEY);
        movieName.setText(movie);
    }
}