package com.example.chattwithscreens.advancedseries;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chattwithscreens.R;

public class AdvancedSeriesViewHolder extends RecyclerView.ViewHolder{
    ImageView imageUrlImg;
    TextView titleTxt;
    public AdvancedSeriesViewHolder(@NonNull View itemView) {
        super(itemView);
        imageUrlImg = itemView.findViewById(R.id.image_url);
        titleTxt = itemView.findViewById(R.id.series_title_txt);
    }
}
