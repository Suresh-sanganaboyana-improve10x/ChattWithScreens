package com.example.chattwithscreens.templates;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chattwithscreens.R;

import java.util.ArrayList;

public class TemplatesAdapter extends RecyclerView.Adapter<TemplatesViewHolder> {
    public ArrayList<Template> templateList;
    public void setData(ArrayList<Template> templates) {
        templateList = templates;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TemplatesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_item, parent, false);
        TemplatesViewHolder messageViewHolder = new TemplatesViewHolder(view);
        return messageViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TemplatesViewHolder holder, int position) {
        Template template = templateList.get(position);
        holder.templateId.setText(template.templateId);
    }

    @Override
    public int getItemCount() {
        return templateList.size();
    }
}
