package com.example.chattwithscreens.messages;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chattwithscreens.R;

import java.util.ArrayList;

public class MessagesAdapter extends RecyclerView.Adapter<MessagesViewHolder> {
    public ArrayList<Message> messagesList;
    public void setupData(ArrayList<Message> messages) {
       messagesList  = messages;
       notifyDataSetChanged();
    }
    @NonNull
    @Override
    public MessagesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.messages_item, parent, false);
        MessagesViewHolder messagesViewHolder = new MessagesViewHolder(view);
        return messagesViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MessagesViewHolder holder, int position) {
        Message message = messagesList.get(position);
        holder.name.setText(message.name);
        holder.phoneNumber.setText(message.phoneNumber);
        holder.messageTxt.setText(message.messageTxt);
    }

    @Override
    public int getItemCount() {
        return messagesList.size();
    }
}
