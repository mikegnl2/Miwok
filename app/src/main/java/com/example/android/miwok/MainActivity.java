package com.example.android.miwok;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbers = (TextView)findViewById(R.id.numbers);
        //Set a clicklistener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the  {alink NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                //Start the new activity
                startActivity(numbersIntent);
            }
        });
        // Find the View that shows the family category
        TextView family = (TextView)findViewById(R.id.family);
        //Set a clicklistener on that View
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        // Create a new intent to open the  {alink FamilyActivity}
                Intent familyIntent = new Intent(MainActivity.this,FamilyActivity.class);
                //Start the new activity
                startActivity(familyIntent);
            }
        });
        // Find the View that shows the colors category
        TextView colors = (TextView)findViewById(R.id.colors);
        //Set a clicklistener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the  {alink ColorsActivity}
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                //Start the new activity
                startActivity(colorsIntent);
            }
        });
        // Find the View that shows the phrases category
        TextView phrases = (TextView) findViewById(R.id.phrases);
        //Set a clicklistener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the  {alink PhrasesActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                //Start the new activity
                startActivity(phrasesIntent);
                }
        });
        }
        }
