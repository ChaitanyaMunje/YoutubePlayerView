package com.gtappdevelopers.youtubeplayerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //variable for our button
    Button playBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initialize our Button
        playBtn=findViewById(R.id.idBtnPlayVideo);
        //we have set onclick listner for our button
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // we have declared an intent to open new activity.
                Intent i=new Intent(MainActivity.this,VideoPlayerActivity.class);
                startActivity(i);

            }
        });
    }
}