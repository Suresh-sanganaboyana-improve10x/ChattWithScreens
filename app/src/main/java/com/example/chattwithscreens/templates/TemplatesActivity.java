package com.example.chattwithscreens.templates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.chattwithscreens.R;

import java.util.ArrayList;

public class TemplatesActivity extends AppCompatActivity {
    public RecyclerView templatesRv;
    public ArrayList<Template> templatesList;
    public TemplatesAdapter templatesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_templates);
        getSupportActionBar().setTitle("Templates");

        setupData();
        setupTemplatesRecyclerView();
    }

    public void setupTemplatesRecyclerView() {
        templatesRv = findViewById(R.id.templates_rv);
        templatesRv.setLayoutManager(new LinearLayoutManager(this));
        templatesAdapter = new TemplatesAdapter();
        templatesAdapter.setData(templatesList);
        templatesRv.setAdapter(templatesAdapter);
    }
    public void setupData() {
        templatesList = new ArrayList<>();
        Template zero = new Template();
        zero.templateId = "Hi,\nWelcome to Improve 10x";
        templatesList.add(zero);

        Template one = new Template();
        one.templateId = "Hi,I'm busy.I'll call you later";
        templatesList.add(one);

        Template two = new Template();
        two.templateId = "Hi,\ncall me when you see the message";
        templatesList.add(two);

        Template three = new Template();
        three.templateId = "-Hi,Please find my contact details\nName:Viswanath Kumar Sandu\ncompany:Improve 10X\nMobile:+919000540052";
        templatesList.add(three);

        Template four = new Template();
        four.templateId = "Hi,Please find my account details\nAccount Number :625101515776\nBank:ICICI Bank\nIFSC:ICIC000251";
        templatesList.add(four);


    }
}