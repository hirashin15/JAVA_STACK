package com.example.algorithm_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class Database extends AppCompatActivity {
    FloatingActionButton addAlgo;
    ListView algoList;
    ArrayAdapter adapter;
    DB db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database2);
        Intent i = getIntent();

        algoList = findViewById(R.id.list_of_algos);
        addAlgo = findViewById(R.id.create);
        addAlgo.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        launchMain(v);
                    }
                }
        );

        db = new DB(Database.this);
        List<AlgoModel> allAlgos = db.getAll();
        adapter = new ArrayAdapter<AlgoModel>(Database.this, android.R.layout.simple_list_item_1, allAlgos);
        algoList.setAdapter(adapter);
    }

    public void launchMain(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}