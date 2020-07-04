package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView video1=(VideoView) findViewById(R.id.videoView);
        video1.setVideoPath(("android.resource://com.example.videoplayer/"+R.raw.a1));
        video1.start();

    }
}