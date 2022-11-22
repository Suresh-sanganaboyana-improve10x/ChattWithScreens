package com.example.chattwithscreens.messages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.chattwithscreens.R;

import java.util.ArrayList;

public class MessagesActivity extends AppCompatActivity {
    public ArrayList<Message> messagesList;
    public RecyclerView messagesRv;
    public MessagesAdapter messagesAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        getSupportActionBar().setTitle("Messages");
        setupData();
        setupRecyclerViewForMessages();
    }

    public void setupRecyclerViewForMessages() {
        messagesRv = findViewById(R.id.messages_rv);
        messagesRv.setLayoutManager(new LinearLayoutManager(this));
        messagesAdapter = new MessagesAdapter();
        messagesAdapter.setupData(messagesList);
        messagesRv.setAdapter(messagesAdapter);

    }
    public void setupData(){
        messagesList = new ArrayList<>();
        Message zero = new Message();
        zero.name = "Aravind";
        zero.phoneNumber = "+91 9000540052";
        zero.messageTxt = "Hi, Welcome to Improve 10X.";
        messagesList.add(zero);

        Message one = new Message();
        one.name = "Ramesh";
        one.phoneNumber ="+91 9999999999";
        one.messageTxt = "Hi,Welcome to Improve 10X.";
        messagesList.add(one);

        Message two = new Message();
        two.name = "";
        two.phoneNumber = "+91 9999999991";
        two.messageTxt = "Hi, call me when you see the message";
        messagesList.add(two);

        Message three = new Message();
        three.name = "Kailash";
        three.phoneNumber = "+91 99999999992";
        three.messageTxt = "-";
        messagesList.add(three);

        Message four = new Message();
        four.name = "Swiggy Delivery";
        four.phoneNumber = "+91 9999999993";
        four.messageTxt = "full address";
        messagesList.add(four);

        Message five = new Message();
        five.name = "Swiggy Delivery";
        five.phoneNumber = "+91 9999999993";
        five.messageTxt ="Are you available for this sunday?\n\n\nWe can have a call and discuss the movie";
        messagesList.add(five);
    }
}