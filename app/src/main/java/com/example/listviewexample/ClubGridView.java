package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

public class ClubGridView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_grid_view);

        String clubNameList[] = {"L.O.D","Lime & Lemon","PupleHaze","ClubSixteen","Cat Walk","Karma","Trisara","KingsLounge","Sugar KTM",
                "Snooks","Platinum"};
        String clubAddresList[] = {"Thamel","Bharatpur","Thamel","Pokhara","Pokhara","Tripureshwor","Thamel",
                "Pokhara","Thamel","Bharatpur","Durbar Marga"};String clubTypeList[] = {"Dance Club","Rock Bar","RockBar",
                "Dance Club","Dance Club","DanceClub","Lounge","Lounge","Dance Club","Rock Bar","Dance Club"};
        GridView gvClubList = findViewById(R.id.gvClubs);

        ClubAdapter adapter = new ClubAdapter(clubNameList,clubAddresList, clubTypeList, this);
        gvClubList.setAdapter(adapter);


    }
}