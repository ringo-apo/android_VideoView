package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView v = (VideoView)findViewById(R.id.v);
        v.setVideoURI(Uri.parse("android.resource://" + this.getPackageName() + "/" + R.raw.video1));
        v.start();
        v.setMediaController(new MediaController(this));
    }
}