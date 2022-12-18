package com.abit.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Persons> personList =new ArrayList<Persons>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setData();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        PersonAdapter adapter = new PersonAdapter(this, personList);
        recyclerView.setAdapter(adapter);
    }

    private void setData() {
        personList.add(new Persons("Hitler","Adolf"));
        personList.add(new Persons("Lincoln","Avram"));
        personList.add(new Persons("Lenin","Ilyich"));
        personList.add(new Persons("Obama","Adolf"));
        personList.add(new Persons("Putin","Adolf"));
        personList.add(new Persons("Sooronbay","Adolf"));
        personList.add(new Persons("Rustam","Adolf"));
        personList.add(new Persons("5 ballov","Adolf"));
    }

}