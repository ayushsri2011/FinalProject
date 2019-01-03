package com.nightcrawler.androidlib;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_view);

        Intent intent=getIntent();
        String s=intent.getStringExtra("TYPE");

        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
        TextView textView=findViewById(R.id.text1);
        textView.setText(s);

    }
}
