package com.example.chattwithscreens.grocery;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chattwithscreens.R;

public class GroceryViewHolder extends RecyclerView.ViewHolder {

    ImageView imageViewImg;
    TextView groceryTitleTxt;

    public GroceryViewHolder(@NonNull View itemView) {
        super(itemView);
        imageViewImg = itemView.findViewById(R.id.image_view_img);
        groceryTitleTxt = itemView.findViewById(R.id.grocery_title_txt);
    }
}
