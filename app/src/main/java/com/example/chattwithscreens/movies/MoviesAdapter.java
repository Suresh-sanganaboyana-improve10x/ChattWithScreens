package com.example.chattwithscreens.movies;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chattwithscreens.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesViewHolder> {
    public ArrayList<Movies> moviesArrayList;
    public void setData(ArrayList<Movies> movies) {
        moviesArrayList = movies;
    }
    @NonNull
    @Override
    public MoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movies_item, parent, false);
        MoviesViewHolder moviesViewHolder = new MoviesViewHolder(view);
        return moviesViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesViewHolder holder, int position) {
        Movies movies = moviesArrayList.get(position);
        Picasso.get().load(movies.imageUrl).into(holder.imageUrlImg);
        holder.titleTxt.setText(movies.title);
    }

    @Override
    public int getItemCount() {
        return moviesArrayList.size();
    }
}
