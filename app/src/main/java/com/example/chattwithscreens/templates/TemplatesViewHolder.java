package com.example.chattwithscreens.templates;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chattwithscreens.R;

public class TemplatesViewHolder extends RecyclerView.ViewHolder {
    TextView templateId;
    public TemplatesViewHolder(@NonNull View itemView) {
        super(itemView);
        templateId = itemView.findViewById(R.id.template_id);
    }
}
