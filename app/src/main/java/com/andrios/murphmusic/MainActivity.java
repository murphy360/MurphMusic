package com.andrios.murphmusic;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    AndriosData data;

    String[][] genres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        splash();
        setConnections();



    }

    private void setConnections() {
        data = new AndriosData();
        genres = data.getGenres();

        gridView = (GridView) findViewById(R.id.gridView);

        gridView.setAdapter(new GenreAdapter(this, genres));
        
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(view.getContext(), " I did it", Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void splash() {

        Intent splashIntent = new Intent(MainActivity.this, SplashActivity.class);

        // Start the new activity
        startActivity(splashIntent);

    }


}
