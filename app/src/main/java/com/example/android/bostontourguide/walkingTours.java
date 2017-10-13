package com.example.android.bostontourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class walkingTours extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walking_tours);
        final ArrayList<properties> attractionList = new ArrayList<properties>();

        attractionList.add(new properties(R.string.HarvardandCambridge, R.string.Time11am, R.string.Duration2Hours));
        attractionList.add(new properties(R.string.BeaconHillCrimeTour, R.string.Time9am, R.string.Duration2Hours));
        attractionList.add(new properties(R.string.NorthEndTour, R.string.Time5pm, R.string.Duration2Hours));
        attractionList.add(new properties(R.string.FreedomTrailTour, R.string.Time6pm, R.string.Duration2Hours));
        attractionList.add(new properties(R.string.BostonDowntownTour, R.string.Time9am, R.string.Duration2Hours));
        attractionList.add(new properties(R.string.FreedomTrailRunning, R.string.Time12pm, R.string.Duration15Hours));
        attractionList.add(new properties(R.string.LittleItalyFood, R.string.Time6pm, R.string.Duration2Hours));
        attractionList.add(new properties(R.string.KennedyandIrishHistoryofBoston, R.string.Time5pm, R.string.Duration2Hours));

        walkingTourAdapter Adapter = new walkingTourAdapter(this, attractionList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);
    }
}
