package com.example.chattwithscreens.seriesscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.chattwithscreens.R;
import com.example.chattwithscreens.seriesscreen.Series;
import com.example.chattwithscreens.seriesscreen.SeriesAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SeriesScreenActivity extends AppCompatActivity {
    public ArrayList<Series> seriesList;
    public RecyclerView seriesRv;
    public SeriesAdapter seriesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series_screen);
        getSupportActionBar().setTitle("Series");

        setData();
        setupRecyclerView();

        fetchData();
    }

    private void fetchData() {
        SeriesApi seriesApi = new SeriesApi();
        SeriesService seriesService = seriesApi.createSeriesService();
        Call<List<Series>> call = seriesService.fetchTasks();
        call.enqueue(new Callback<List<Series>>() {
            @Override
            public void onResponse(Call<List<Series>> call, Response<List<Series>> response) {
                List<Series> seriesList = response.body();
                seriesAdapter.setupData(seriesList);
            }

            @Override
            public void onFailure(Call<List<Series>> call, Throwable t) {
                Toast.makeText(SeriesScreenActivity.this, "Fetch data failed", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setupRecyclerView() {
        seriesRv = findViewById(R.id.series_rv);
        seriesRv.setLayoutManager(new LinearLayoutManager(this));
        seriesAdapter = new SeriesAdapter();
        seriesAdapter.setupData(seriesList);
        seriesRv.setAdapter(seriesAdapter);


    }
    public void setData() {
        seriesList = new ArrayList<>();
        Series zero = new Series();
        zero.title = "Kung Fu Panda Movie Series";
        zero.imageUrl = "https://occ-0-1556-1007.1.nflxso.net/dnm/api/v6/E8vDc_W8CLv7-yMQu8KMEC7Rrr8/AAAABduFRBhx6t-Dhqq_nz4teWtFQs7rpEnkYggmaKnJ1jjtbaGGqVSTZi1OfHu6DkmLzO7d5bXlhKYE1Eu6jrJoaO64l0uKJY2YEHJb.jpg?r=109";
        seriesList.add(zero);

        Series one = new Series();
        one.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/3/36/Harry-potter-films.png/revision/latest/scale-to-width-down/1000?cb=20110722151247";
        one.title = "Harry Potter Movie Series";
        seriesList.add(one);
    }
}