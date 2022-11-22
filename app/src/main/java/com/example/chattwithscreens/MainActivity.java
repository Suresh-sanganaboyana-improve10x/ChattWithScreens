package com.example.chattwithscreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.chattwithscreens.advancedseries.AdvancedSeriesActivity;
import com.example.chattwithscreens.grocery.GroceryActivity;
import com.example.chattwithscreens.messages.MessagesActivity;
import com.example.chattwithscreens.movies.MoviesScreenActivity;
import com.example.chattwithscreens.seriesscreen.SeriesScreenActivity;
import com.example.chattwithscreens.templates.TemplatesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button templates = findViewById(R.id.templates_btn);
        templates.setOnClickListener(view -> {
            Intent intent = new Intent(this, TemplatesActivity.class);
            startActivity(intent);
        });

        Button messagesBtn = findViewById(R.id.messages_btn);
        messagesBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, MessagesActivity.class);
            startActivity(intent);
        });

        Button seriesScreenBtn = findViewById(R.id.series_screen_btn);
        seriesScreenBtn.setOnClickListener(view -> {
            Intent intent =  new Intent(this, SeriesScreenActivity.class);
            startActivity(intent);
        });

        Button advancedSeriesBtn = findViewById(R.id.advance_series_btn);
        advancedSeriesBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, AdvancedSeriesActivity.class);
            startActivity(intent);
        });

        Button moviesBtn = findViewById(R.id.movies_btn);
        moviesBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, MoviesScreenActivity.class);
            startActivity(intent);
        });

        Button groceryBtn = findViewById(R.id.grocery_btn);
        groceryBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, GroceryActivity.class);
            startActivity(intent);
        });
    }
}