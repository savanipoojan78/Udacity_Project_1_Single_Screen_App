package com.example.poojan.udacity_project_1_single_screen_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=(ViewPager)findViewById(R.id.view);
        ViewPageAdapter viewPageAdapter=new ViewPageAdapter(this);
        viewPager.setAdapter(viewPageAdapter);
        TextView Map = (TextView) findViewById(R.id.maps);
        Map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strUri = "http://maps.google.com/maps?q=loc:" + 21.217085 + "," + 72.8330693 + " (" + "Shree Ramkrishna Exports Pvt. Ltd." + ")";
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));

                intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");

                startActivity(intent);
            }
        });


    }


}
