package com.example.student_list_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] StudentArray={ "Peter","Rodrigo","Danilo","Kanya","Nadine", "Lourenço","Emiliano","Felipe","Reiner","Paul" };
        List<String> StudentArrayList= Arrays.asList(StudentArray);

        ListView listView =  findViewById(R.id.listview);

        ArrayAdapter <String> arrayAdapter=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, StudentArrayList);

        listView.setAdapter(arrayAdapter);











    }
}
