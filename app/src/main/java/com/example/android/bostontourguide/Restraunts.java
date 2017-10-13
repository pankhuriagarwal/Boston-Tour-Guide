package com.example.android.bostontourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Restraunts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restraunts);
        final ArrayList<properties> attractionList = new ArrayList<properties>();


        attractionList.add(new properties(R.string.SchezuanGourmet , R.string.burlington, R.string.chinese));
        attractionList.add(new properties(R.string.SoulofIndia, R.string.Sudbury, R.string.Indian));
        attractionList.add(new properties(R.string.Punjab, R.string.Arlington, R.string.Indian));
        attractionList.add(new properties(R.string.KickstandCafe, R.string.Arlington, R.string.Cafe));
        attractionList.add(new properties(R.string.ShabunMein, R.string.Cambridge, R.string.HotPot));
        attractionList.add(new properties(R.string.Toscanini, R.string.Cambridge, R.string.Icecream));
        attractionList.add(new properties(R.string.Habesha, R.string.wooster, R.string.Ethopean));
        attractionList.add(new properties(R.string.SugarnSpice, R.string.MassAve, R.string.Thai));
        attractionList.add(new properties(R.string.FlatBreads, R.string.Summerville, R.string.Pizza));
        attractionList.add(new properties(R.string.CheesecakeFactory, R.string.Cambridge, R.string.American));

        walkingTourAdapter Adapter = new walkingTourAdapter(this, attractionList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);
    }
}
