package com.axelia.udacity.androiddisplayjokelib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDetailsActivity extends AppCompatActivity {

    public static final String EXTRA_JOKE = "extra_joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_details);
        String joke = getIntent().getStringExtra(EXTRA_JOKE);

        TextView jokeDetails = findViewById(R.id.textview_joke_details);
        jokeDetails.setText(joke);
    }
}
