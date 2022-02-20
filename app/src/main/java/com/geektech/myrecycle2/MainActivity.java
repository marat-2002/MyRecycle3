package com.geektech.myrecycle2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private NameAdapter nameAdapter;
    private ArrayList<String> names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);

        loadData();
        recyclerView = findViewById(R.id.recycler);
        nameAdapter = new NameAdapter(names);
        recyclerView.setAdapter(nameAdapter);

    }

    private void loadData() {
        names = new ArrayList<>();
        names.add("Mark");
        names.add("Marat");
        names.add("Islam");
        names.add("Beksultan");
        names.add("Mirco Kro cop");
        names.add(" Notorious B.I.G");
        names.add("Tupac");
        names.add("Ice Cube");
        names.add("Snoop Dog");
    }
}