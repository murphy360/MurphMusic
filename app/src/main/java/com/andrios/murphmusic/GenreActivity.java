package com.andrios.murphmusic;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GenreActivity extends AppCompatActivity {
    AndriosData andriosData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        
        setConnections();
        
    }

    private void setConnections() {
        Bundle extras = getIntent().getExtras();
        String genreName = "";

        if (extras != null) {
            genreName = extras.getString("id");
            getSupportActionBar().setTitle(genreName);
        }

    }
}
