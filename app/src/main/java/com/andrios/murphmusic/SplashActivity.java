package com.andrios.murphmusic;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.Toast;

/**
 * Created by Corey on 7/22/2016.
 */
public class SplashActivity extends AppCompatActivity {
    ProgressBar progressBar;
    int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        setOnClickListeners();
        new BackgroundAsyncTask().execute();
    }

    //Connect GUI and ACTIVITY
    private void setOnClickListeners() {
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setMax(100);
        progressBar.setIndeterminate(false);

    }
    // Work in another thread
    public class BackgroundAsyncTask extends
            AsyncTask<Void, Integer, Void> {

        int myProgress;

        @Override
        protected void onPostExecute(Void result) {
            //Close the activity
            finish();
        }

        @Override
        protected void onPreExecute() {
            // TODO Fill this out someday
        }

        @Override
        protected Void doInBackground(Void... params) {
            // Slows down progress bar process to give user time to read about the activity.
            // TODO Will be used to download data in the background in the future.
            while (myProgress < 100) {
                myProgress++;
                publishProgress(myProgress);
                SystemClock.sleep(50);
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            // TODO Auto-generated method stub
            progressBar.setProgress(values[0]);
        }
    }
}