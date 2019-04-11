package com.anik.videoplayer;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView myVideo;
    MediaController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // myVideo =findViewById(R.id.videoView);
        controller=new MediaController(this);
        myVideo.setMediaController(controller);



        //for online
        //myVideo.setVideoPath("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4");

        //for offline
        myVideo.setVideoURI(Uri.parse("android.resource://com.anik.videoplayer/raw/myVideo"));
        myVideo.start();




    }
}
