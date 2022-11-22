package com.example.chattwithscreens.seriesscreen;

import com.google.gson.annotations.SerializedName;

public class Series {
    @SerializedName("_id")
    public String seriesId;
    public String title;
    public String imageUrl;
}
