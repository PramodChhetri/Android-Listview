package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] restaurntlist = {"Baishnab", "Purano Tandoori", "Bhetghat", "KFC", "Diyalo Food Land", "Restaurant1" , "Restaurant1",
                "Restaurant1",  "Restaurant1" , "Restaurant1" , "Restaurant1" , "Restaurant1" , "Restaurant1" , "Restaurant1" , "Restaurant1" , "Restaurant1"
                ,"Restaurant1" , "Restaurant1" ,  "Restaurant1" , "Restaurant1" , "Restaurant1" , "Restaurant1" };

        ListView lv_restaurant = findViewById(R.id.lv_List);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, restaurntlist);

        lv_restaurant.setAdapter(adapter);

    }
}