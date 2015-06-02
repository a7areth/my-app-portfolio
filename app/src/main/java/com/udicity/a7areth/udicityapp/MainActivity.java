package com.udicity.a7areth.udicityapp;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void buttonsListener(View view){
        Context context= getApplicationContext();
        int duration=Toast.LENGTH_SHORT;
        CharSequence text;
        Toast e;

        int sw=view.getId();
        switch (sw){
            case R.id.btnSpotifyStreamer:
               text="Go to Spotify Streamer App";
               e= Toast.makeText(context, text, duration);
                e.show();
                break;


            case R.id.btnBaconReader:
                text="Go to Bacon Reader App";
                e= Toast.makeText(context, text, duration);
                e.show();
                break;
            case R.id.btnBuildItBigger:
                text="Go to Build It Bigger App";
                e= Toast.makeText(context, text, duration);
                e.show();
                break;

            case R.id.btnCastpone:
                text="Go to Castpone Project";
                e= Toast.makeText(context, text, duration);
                e.show();
                break;

            case R.id.btnLibraryApp:
                text="Go to Library App ";
                e= Toast.makeText(context, text, duration);
                e.show();
                break;
            case R.id.btnScoreApp:
                text="Go to Score App ";
                e= Toast.makeText(context, text, duration);
                e.show();
                break;


        }



    }
    public void SpotifyStreamerOnClick(View v){
        Context context= getApplicationContext();
        CharSequence text="Go to Spotify Streamer App";
        int duration=Toast.LENGTH_SHORT;

       Toast e= Toast.makeText(context, text, duration);
                e.show();

    }
}
