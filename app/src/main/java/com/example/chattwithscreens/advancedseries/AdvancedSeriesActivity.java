package com.example.chattwithscreens.advancedseries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.chattwithscreens.R;

import java.util.ArrayList;

public class AdvancedSeriesActivity extends AppCompatActivity {
    public ArrayList<AdvancedSeries> advancedSeriesList;
    public RecyclerView advancedSeriesRv;
    public AdvancedSeriesAdapter advancedSeriesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_series);
        getSupportActionBar().setTitle("Series");

        setupDataForAdvancedSeries();
        setupRecyclerViewForAdvancedSeries();
    }

    private void setupRecyclerViewForAdvancedSeries() {
        advancedSeriesRv = findViewById(R.id.advanced_series_rv);
        advancedSeriesRv.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL, false));
        advancedSeriesAdapter = new AdvancedSeriesAdapter();
        advancedSeriesAdapter.setupData(advancedSeriesList);
        advancedSeriesRv.setAdapter(advancedSeriesAdapter);
    }

    private void setupDataForAdvancedSeries() {
        advancedSeriesList = new ArrayList<>();
        AdvancedSeries zero = new AdvancedSeries();
        zero.title = "Harry potter and sorcerer's stone";
        zero.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/f/f3/Harry_Potter_and_the_Philosopher%27s_Stone_%28film%29%28Movieposter%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004220";
        advancedSeriesList.add(zero);

        AdvancedSeries one = new AdvancedSeries();
        one.title = "Harry potter and the chamber of secrets";
        one.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/1/1c/Harry_Potter_and_the_Chamber_of_Secrets_%28film%29%28Movie_Poster%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004647";
        advancedSeriesList.add(one);

        AdvancedSeries two = new AdvancedSeries();
        two.title = "Harry potter and the prisoner of azkaban";
        two.imageUrl = "https://images.moviesanywhere.com/1da041f4db01054fe099a9be01ddb6a2/f981fa35-0a7a-449a-ba99-f54a724ce278.jpg";
        advancedSeriesList.add(two);

        AdvancedSeries three = new AdvancedSeries();
        three.title = "Harry potter and the goblet of fire";
        three.imageUrl = "https://img2.sfilm.hu/original/7VRkmVB23rloRbZHsCRPscXlgQp.jpg";
        advancedSeriesList.add(three);

        AdvancedSeries four = new AdvancedSeries();
        four.title = "Harry potter and the order of the phoenix";
        four.imageUrl = "https://images.moviesanywhere.com/e1752b37b6a6277dc16ed75b55b4883f/688a801d-4a1b-424e-b949-80253e07d0e2.jpg";
        advancedSeriesList.add(four);

        AdvancedSeries five = new AdvancedSeries();
        five.title = "Harry potter and the half-blood price";
        five.imageUrl = "https://images.moviesanywhere.com/144db183a81872d493990cb46599dc92/78f6e38f-1223-4dd9-b5e2-98181d340dde.jpg";
        advancedSeriesList.add(five);
    }
}