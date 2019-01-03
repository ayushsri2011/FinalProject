package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.nightcrawler.jokes.*;
import com.nightcrawler.androidlib.*;

public class MainActivity extends AppCompatActivity {

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

    public void tellJoke(View view) {
        Joker joker=new Joker();
        Intent intent=new Intent(this, com.nightcrawler.androidlib.MainActivity.class);
        if(BuildConfig.FLAVOR.equals("free")) {
            Toast.makeText(this, "FREE FLAVOUR", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, joker.getFreeJoke(), Toast.LENGTH_LONG).show();
            intent.putExtra("TYPE","FREE");
        }
        else if(BuildConfig.FLAVOR.equals("paid")){

            Toast.makeText(this, "PAID FLAVOUR", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, joker.getPaidJoke(), Toast.LENGTH_LONG).show();
            intent.putExtra("TYPE","PAID");
        }

        startActivity(intent);

//        Toast.makeText(this, "Chuck Norris runs apple on Android(FREE)", Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, "paidDebug", Toast.LENGTH_SHORT).show();
    }


}
