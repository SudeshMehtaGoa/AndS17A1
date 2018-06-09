package com.mehta.android.ands17a1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button play,stop;
        play = (Button)findViewById(R.id.button);
        play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent myIntent = new Intent(MainActivity.this, MyService.class);
                startService(myIntent);
            }
        });

        stop=(Button)findViewById(R.id.button2);
        stop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent myIntent = new Intent(MainActivity.this, MyService.class);
                stopService(myIntent);
            }
        });

    }



}
