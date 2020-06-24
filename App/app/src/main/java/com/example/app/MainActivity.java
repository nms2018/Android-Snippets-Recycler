package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //which recyclerview we want to target ? then, who is managin that
        //recyclerview? is it set already? what data the manager needs to pass
        //to the recyclerview and who is going to handle the data and the view?
        //how much data to be shown, infinite or finite or how many?

        recyclerView = findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        //so now the required things are ready and data needs to be
        // passed after the data is prepared.

        //dataitems are list of ModelClass

        List<ModelClass> dataItems;
        dataItems = new ArrayList<>();
        dataItems.add(new ModelClass(R.id.image_view, "001-The Quran","The English version of the holy Quran with Arabic Tajweed"));
        dataItems.add(new ModelClass(R.id.image_view, "002-The Quran","The English version of the holy Quran with Arabic Tajweed"));
        dataItems.add(new ModelClass(R.id.image_view, "003-The Quran","The English version of the holy Quran with Arabic Tajweed"));
        dataItems.add(new ModelClass(R.id.image_view, "004-The Quran","The English version of the holy Quran with Arabic Tajweed"));
        dataItems.add(new ModelClass(R.id.image_view, "005-The Quran","The English version of the holy Quran with Arabic Tajweed"));
        dataItems.add(new ModelClass(R.id.image_view, "006-The Quran","The English version of the holy Quran with Arabic Tajweed"));

        //now that data is ready but who will adopt that data? == adapter

        Adapter adapter = new Adapter(dataItems);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();









    }
}