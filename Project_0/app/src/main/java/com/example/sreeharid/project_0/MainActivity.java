package com.example.sreeharid.project_0;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    public void toastMessage(View view){
        switch (view.getId()){
            case R.id.SpotifyStreamer:
                Toast.makeText(getApplicationContext(), "This Button Will Launch Spotify Streamer", Toast.LENGTH_SHORT).show();
                break;
            case R.id.BuildItBigger:
                Toast.makeText(getApplicationContext(),"This Button Will Launch Build It Bigger",Toast.LENGTH_SHORT).show();
                break;
            case R.id.SuperDuo:
                Toast.makeText(getApplicationContext(),"This Button Will Launch Super Duo",Toast.LENGTH_SHORT).show();
                break;
            case R.id.XYZReader:
                Toast.makeText(getApplicationContext(),"This Button Will Launch XYZ Reader",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Capstone:
                Toast.makeText(getApplicationContext(),"This Button Will Launch Capstone ",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
