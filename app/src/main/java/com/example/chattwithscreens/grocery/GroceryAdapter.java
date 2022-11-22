package com.example.chattwithscreens.grocery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chattwithscreens.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class GroceryAdapter extends RecyclerView.Adapter<GroceryViewHolder> {

    public ArrayList<Grocery> groceryArrayList;

    public void setData(ArrayList<Grocery> groceries) {
        groceryArrayList = groceries;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public GroceryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grocery_item, parent, false);
        GroceryViewHolder groceryViewHolder = new GroceryViewHolder(view);
        return groceryViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GroceryViewHolder holder, int position) {
        Grocery grocery = groceryArrayList.get(position);
        Picasso.get().load(grocery.imageUrl).into(holder.imageViewImg);
        holder.groceryTitleTxt.setText(grocery.title);
    }

    @Override
    public int getItemCount() {
        return groceryArrayList.size();
    }
}
