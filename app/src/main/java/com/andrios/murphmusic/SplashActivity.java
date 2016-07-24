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

    private void setOnClickListeners() {
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setMax(100);
        progressBar.setIndeterminate(false);

    }

    public class BackgroundAsyncTask extends
            AsyncTask<Void, Integer, Void> {

        int myProgress;

        @Override
        protected void onPostExecute(Void result) {
            finish();
        }

        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub

        }

        @Override
        protected Void doInBackground(Void... params) {
            // TODO Auto-generated method stub
            while (myProgress < 100) {
                myProgress++;
                publishProgress(myProgress);
                SystemClock.sleep(10);
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