package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button blueBottom , redBottom , greenBottom , yellowBottom , pinkBottom , purpleBottom , increaseBottom , decreaseBottom ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // blue
        // click once
        Button blueBottom=findViewById(R.id.textview_blue);
        blueBottom.setOnClickListener(v ->{
            blueBottom.setTextColor(Color.BLUE);
        });
        // press long
        blueBottom.setOnLongClickListener(v -> {
            blueBottom.setTextColor(Color.BLACK);
            return false;
        });

        // red
        Button redBottom=findViewById(R.id.textview_red);
        redBottom.setOnClickListener(v ->{
            redBottom.setTextColor(Color.RED);
        });
        redBottom.setOnLongClickListener(v -> {
            redBottom.setTextColor(Color.BLACK);
            return false;
        });

        //green
        Button greenBottom=findViewById(R.id.textview_green);
        greenBottom.setOnClickListener(v ->{
            greenBottom.setTextColor(Color.GREEN);
        });
        greenBottom.setOnLongClickListener(v -> {
            greenBottom.setTextColor(Color.BLACK);
            return false;
        });

        //yellow
        Button yellowBottom=findViewById(R.id.textview_yellow);
        yellowBottom.setOnClickListener(v ->{
            yellowBottom.setTextColor(Color.YELLOW);
        });
        yellowBottom.setOnLongClickListener(v -> {
            yellowBottom.setTextColor(Color.BLACK);
            return false;
        });

        //pink
        Button pinkBottom=findViewById(R.id.textview_pink);
        pinkBottom.setOnClickListener(v ->{
            pinkBottom.setTextColor(Color.MAGENTA);
        });
        pinkBottom.setOnLongClickListener(v -> {
            pinkBottom.setTextColor(Color.BLACK);
            return false;
        });

        //purple
        Button purpleBottom=findViewById(R.id.textview_purple);
        purpleBottom.setOnClickListener(v ->{
            purpleBottom.setTextColor(Color.parseColor("#FF6200EE"));
        });
        purpleBottom.setOnLongClickListener(v -> {
            purpleBottom.setTextColor(Color.BLACK);
            return false;
        });

        //increase
        Button increaseBottom=findViewById(R.id.increase);
        increaseBottom.setOnClickListener(v -> {
            increaseBottom.setTextSize(0 , increaseBottom.getTextSize() +3.0f);
        });
        increaseBottom.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return false;
            }
        });

        //decrease
        Button decreaseBottom=findViewById(R.id.decrease);
        decreaseBottom.setOnClickListener(v -> {
            decreaseBottom.setTextSize(0 , decreaseBottom.getTextSize() -3.0f);
        });
        decreaseBottom.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return false;
            }
        });


    }
}