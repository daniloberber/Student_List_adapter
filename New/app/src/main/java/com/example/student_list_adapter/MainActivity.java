package com.example.student_list_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView listView = (listView) this.findViewById(R.id.listview);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("Peter");
        arrayList.add("Rodrigo");
        arrayList.add("Danilo");
        arrayList.add("Kanya");
        arrayList.add("Nadine");
        arrayList.add("Lourenço");
        arrayList.add("Emiliano");
        arrayList.add("Felipe");
        arrayList.add("Reiner");
        arrayList.add("Paul");

        ArrayAdapter arrayAdapter=new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);











    }
}
