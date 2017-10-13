package com.example.android.bostontourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Museums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);
        final ArrayList<properties> attractionList = new ArrayList<properties>();


        attractionList.add(new properties(R.string.MITRobotics, R.string.ReviewsGreat, R.string.Science));
        attractionList.add(new properties(R.string.HarvardArts, R.string.ReviewsGood, R.string.ArtCulture));
        attractionList.add(new properties(R.string.BostonArts, R.string.ReviewsGreat, R.string.ArtCulture));
        attractionList.add(new properties(R.string.NaturalScience, R.string.ReviewsGreat, R.string.Nature));
        attractionList.add(new properties(R.string.HistoryMuseum, R.string.ReviewsGood, R.string.History));
        attractionList.add(new properties(R.string.MuseumofScience, R.string.ReviewsGood, R.string.Science));
        attractionList.add(new properties(R.string.AfricanHistoryMuseum, R.string.ReviewsAverage, R.string.HistoryCulture));
        attractionList.add(new properties(R.string.USSConstitutionMuseum, R.string.ReviewsGood, R.string.Politics));
        attractionList.add(new properties(R.string.SportsMuseum, R.string.ReviewsGood, R.string.Sports));
        attractionList.add(new properties(R.string.PaulRevereHouse, R.string.ReviewsGreat, R.string.History));

        walkingTourAdapter Adapter = new walkingTourAdapter(this, attractionList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);
    }
}
