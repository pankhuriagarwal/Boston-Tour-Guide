package com.example.android.bostontourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NearbyAtteractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby_atteractions);

        final ArrayList<properties> attractionList = new ArrayList<properties>();


        attractionList.add(new properties(R.drawable.boy_390053_640, R.string.BostonDowntown, R.string.ReviewsGreat, R.string.CityMarket));
        attractionList.add(new properties(R.drawable.doon, R.string.ArlingtonCenter, R.string.ReviewsGood, R.string.CityMarket));
        attractionList.add(new properties(R.drawable.elephant, R.string.MarthasVinyard, R.string.ReviewsGreat, R.string.IslandBeaches));
        attractionList.add(new properties(R.drawable.elephant_family, R.string.ProvinceTown, R.string.ReviewsGreat, R.string.BeachesParty));
        attractionList.add(new properties(R.drawable.pencil2, R.string.NewHampshire, R.string.ReviewsGood, R.string.Shopping));
        attractionList.add(new properties(R.drawable.pexels_photo, R.string.HarvardSquare, R.string.ReviewsGood, R.string.Party));
        attractionList.add(new properties(R.drawable.prayer_412520_640, R.string.RevereBeach, R.string.ReviewsAverage, R.string.Beach));
        attractionList.add(new properties(R.drawable.president_house_422375_640, R.string.NewburyStreet, R.string.ReviewsGood, R.string.ShoppingParty));
        attractionList.add(new properties(R.drawable.sports, R.string.BeaconHill, R.string.ReviewsGood, R.string.History));
        attractionList.add(new properties(R.drawable.st_george, R.string.NorthEnd, R.string.ReviewsGreat, R.string.HistoryFood));


        walkingTourAdapter Adapter = new walkingTourAdapter(this, attractionList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);


    }
}

