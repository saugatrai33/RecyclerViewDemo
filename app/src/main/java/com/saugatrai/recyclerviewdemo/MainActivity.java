package com.saugatrai.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
implements MovieAdapter.MovieClickListener {

    private List<Movie> movieList = new ArrayList<>();

    private static final String TAG = MainActivity.class.getCanonicalName();

    public static final String MOVIE_KEY = "movie";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.movie_list);
        LinearLayoutManager layoutManager =
                new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerView.ItemDecoration itemDecoration =
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);
        addMovies();
        MovieAdapter adapter = new MovieAdapter(movieList, this);
        recyclerView.setAdapter(adapter);
    }

    private void addMovies() {
        Movie movie = new Movie("Mad Max: Fury Road", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new Movie("Inside Out", "Animation", "2015");
        movieList.add(movie);

        movie = new Movie("Star Wars", "Animation", "2015");
        movieList.add(movie);

        movie = new Movie("The Martin", "Science Fiction & Fantasy", "2015");
        movieList.add(movie);

        movie = new Movie("Mission: Impossible", "Action", "2015");
        movieList.add(movie);

        movie = new Movie("Up", "Animation", "2009");
        movieList.add(movie);

        movie = new Movie("Iron Man", "Action & Adventure", "2008");
        movieList.add(movie);

        movie = new Movie("Twilight", "Love & Romance", "2009");
        movieList.add(movie);

        movie = new Movie("Avatar", "Science Fi", "2011");
        movieList.add(movie);

        movie = new Movie("Avengers", "Sci-Fi", "2015");
        movieList.add(movie);

        movie = new Movie("Back To Future", "Action & Adventure", "1965");
        movieList.add(movie);

        movie = new Movie("Back To Future", "Action & Adventure", "1965");
        movieList.add(movie);


        movie = new Movie("Back To Future", "Action & Adventure", "1965");
        movieList.add(movie);


        movie = new Movie("Back To Future", "Action & Adventure", "1965");
        movieList.add(movie);


        movie = new Movie("Back To Future", "Action & Adventure", "1965");
        movieList.add(movie);


        movie = new Movie("Back To Future", "Action & Adventure", "1965");
        movieList.add(movie);
    }

    @Override
    public void onMovieClick(String movieName) {
        Intent movieDetail = new Intent(MainActivity.this, MovieDetailActivity.class);
        movieDetail.putExtra(MOVIE_KEY, movieName);
        startActivity(movieDetail);
    }
}