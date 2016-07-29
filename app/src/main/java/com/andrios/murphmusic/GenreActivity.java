package com.andrios.murphmusic;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

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
        String genreImage = "";

        if (extras != null) {
            genreName = extras.getString("id");
            getSupportActionBar().setTitle(genreName);
            switch (genreName){
                case "Irish": genreImage = "button_irish";
                    break;
                case "Classical": genreImage = "button_classical";
                    break;
                case "Country": genreImage = "button_country";
                    break;
                case "Jazz": genreImage = "button_jazz";
                    break;
                case "Pop": genreImage = "button_pop";
                    break;
                case "Reggae": genreImage = "button_reggae";
                    break;
            }
            ImageView imageView = (ImageView) findViewById(R.id.genreImageView);
            int resID = getResources().getIdentifier(genreImage, "drawable", getPackageName());
            imageView.setImageResource(resID);
        }
    }
}
