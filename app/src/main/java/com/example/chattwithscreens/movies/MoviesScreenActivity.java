package com.example.chattwithscreens.movies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.chattwithscreens.R;
import com.example.chattwithscreens.movies.Movies;
import com.example.chattwithscreens.movies.MoviesAdapter;

import java.util.ArrayList;

public class MoviesScreenActivity extends AppCompatActivity {
    public ArrayList<Movies> moviesList;
    public RecyclerView moviesRv;
    public MoviesAdapter moviesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_screen);
        getSupportActionBar().setTitle("Movies");

        setupData();
        setupRecyclerView();
    }

    public void setupRecyclerView() {
       moviesRv = findViewById(R.id.movies_rv);
       moviesRv.setLayoutManager(new GridLayoutManager(this,2));
       moviesAdapter = new MoviesAdapter();
       moviesAdapter.setData(moviesList);
       moviesRv.setAdapter(moviesAdapter);
    }

    public void setupData() {
        moviesList = new ArrayList<>();
        Movies zero = new Movies();
        zero.title = "Harry potter and sorcerer's stone";
        zero.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/f/f3/Harry_Potter_and_the_Philosopher%27s_Stone_%28film%29%28Movieposter%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004220";
        moviesList.add(zero);

        Movies one = new Movies();
        one.title = "Harry potter and chamber of secrets";
        one.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/1/1c/Harry_Potter_and_the_Chamber_of_Secrets_%28film%29%28Movie_Poster%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004647";
        moviesList.add(one);

        Movies two = new Movies();
        two.title = "Harry potter and the prisoner of azkaban";
        two.imageUrl = "https://images.moviesanywhere.com/1da041f4db01054fe099a9be01ddb6a2/f981fa35-0a7a-449a-ba99-f54a724ce278.jpg";
        moviesList.add(two);

        Movies three = new Movies();
        three.title = "Harry potter and the goblet of fire";
        three.imageUrl = "https://img2.sfilm.hu/original/7VRkmVB23rloRbZHsCRPscXlgQp.jpg";
        moviesList.add(three);

        Movies four = new Movies();
        four.title = "Harry potter and the order of the phoenix";
        four.imageUrl = "https://images.moviesanywhere.com/e1752b37b6a6277dc16ed75b55b4883f/688a801d-4a1b-424e-b949-80253e07d0e2.jpg";
        moviesList.add(four);


        Movies five = new Movies();
        five.title = "Harry potter and the half-blood prince";
        five.imageUrl = "https://images.moviesanywhere.com/144db183a81872d493990cb46599dc92/78f6e38f-1223-4dd9-b5e2-98181d340dde.jpg";
        moviesList.add(five);
    }
}