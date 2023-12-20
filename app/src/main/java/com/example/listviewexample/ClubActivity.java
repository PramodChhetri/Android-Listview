package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ClubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);

        String clubNameList[] = {"L.O.D","Lime & Lemon","PupleHaze","ClubSixteen","Cat Walk","Karma","Trisara","KingsLounge","Sugar KTM",
                "Snooks","Platinum"};
                String clubAddresList[] = {"Thamel","Bharatpur","Thamel","Pokhara","Pokhara","Tripureshwor","Thamel",
                        "Pokhara","Thamel","Bharatpur","Durbar Marga"};String clubTypeList[] = {"Dance Club","Rock Bar","RockBar",
                "Dance Club","Dance Club","DanceClub","Lounge","Lounge","Dance Club","Rock Bar","Dance Club"};
                    ListView lvClubList = findViewById(R.id.lvClubs);

                    ClubAdapter adapter = new ClubAdapter(clubNameList,clubAddresList, clubTypeList, this);
                    lvClubList.setAdapter(adapter);




    }
}