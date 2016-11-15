package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultsActivity extends AppCompatActivity {
    private TextView mResultsTextView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        mResultsTextView = (TextView) findViewById(R.id.resultsTextView);
        Intent intent = getIntent();
        ArrayList<String> words = intent.getStringArrayListExtra("words");
        mResultsTextView.setText("All " + words.get(0) + " are " +  words.get(1) + ". They bring " + words.get(2) + ". We need to keep those clowns away from our " + words.get(3) + ". The only way to do that is to build a yuge " + words.get(4) + ". Also we need to get rid of that super loser " + words.get(5) + ". Have you seen their " + words.get(6) + ". Hey, if my " + words.get(7) + " wasn’t related to me I’d " + words.get(8) + " them.");
    }
}
