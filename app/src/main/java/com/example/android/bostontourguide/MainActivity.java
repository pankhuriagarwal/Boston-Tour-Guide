package com.example.android.bostontourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView walkingTours = (TextView) findViewById(R.id.walkingTours);
        walkingTours.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent openWalkingTours = new Intent(MainActivity.this, walkingTours.class);
                startActivity(openWalkingTours);
            }

        });


        TextView restraunts = (TextView) findViewById(R.id.restaurants);
        restraunts.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent openRestaurants = new Intent(MainActivity.this, Restraunts.class);
                startActivity(openRestaurants);
            }

        });

        TextView nearbyAttractions = (TextView) findViewById(R.id.nearbyAttractions);
        nearbyAttractions.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent openNearbyAttractions = new Intent(MainActivity.this, NearbyAtteractions.class);
                startActivity(openNearbyAttractions);
            }

        });

        TextView museums = (TextView) findViewById(R.id.museums);
        museums.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent openMuseums = new Intent(MainActivity.this, Museums.class);
                startActivity(openMuseums);
            }

        });
    }
}
