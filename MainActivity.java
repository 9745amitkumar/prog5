package com.example.prog1;


import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int starttime = 0;
    int stoptime = 0;
    int forwardtime = 5000;
    int backwardtime = 5000;
    MediaPlayer mediaPlayer, mediaPlayernew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.song);
        mediaPlayernew = MediaPlayer.create(this, R.raw.song);

        Button play = findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Playing song", Toast.LENGTH_LONG).show();
                mediaPlayer.start();
            }
        });
    }
}

