package com.arenterprise.recylclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView programminglist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        programminglist = (RecyclerView) findViewById(R.id.programminglist);
        programminglist.setLayoutManager(new LinearLayoutManager(this));
        String[] languages = {"c","c++","java","csharp","kotlin","c","c++","java","csharp","kotlin"};
        programminglist.setAdapter(new ProgrammingAdapter(languages));
    }
}
