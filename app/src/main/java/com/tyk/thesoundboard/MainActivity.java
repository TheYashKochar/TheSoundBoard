package com.tyk.thesoundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {
    NumberPicker artists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        artists = (NumberPicker) findViewById(R.id.numberpicker);
        String[] artistStrings = {
                "Enrique",
                "The Weeknd",
                "Post Malone"
        };
        artists.setDisplayedValues(artistStrings);
        artists.setMinValue(0);
        artists.setMaxValue(artistStrings.length - 1);
    }

    public void navigate (View v){
        int choice = artists.getValue();
        Intent goToSecond = new Intent();
        if (choice == 0) {
            goToSecond.setClass(this, Enrique.class);
        } else if (choice == 1) {
            goToSecond.setClass(this, TheWeeknd.class);
        } else if (choice == 2) {
            goToSecond.setClass(this, PostMalone.class);
        }
        startActivity(goToSecond);
    }
}