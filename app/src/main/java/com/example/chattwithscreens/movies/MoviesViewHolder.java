package com.example.chattwithscreens.movies;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chattwithscreens.R;

public class MoviesViewHolder extends RecyclerView.ViewHolder {
    ImageView imageUrlImg;
    TextView titleTxt;
    public MoviesViewHolder(@NonNull View itemView) {
        super(itemView);
        imageUrlImg = itemView.findViewById(R.id.image_url_img);
        titleTxt = itemView.findViewById(R.id.title_txt);
    }
}
