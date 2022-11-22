package com.example.chattwithscreens.messages;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chattwithscreens.R;

public class MessagesViewHolder extends RecyclerView.ViewHolder {
    TextView name;
    TextView phoneNumber;
    TextView messageTxt;
    public MessagesViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        phoneNumber = itemView.findViewById(R.id.phone_number);
        messageTxt = itemView.findViewById(R.id.message_txt);
    }
}
