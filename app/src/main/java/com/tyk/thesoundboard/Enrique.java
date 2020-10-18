package com.tyk.thesoundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CompoundButton;
import android.widget.Switch;

public class Enrique extends AppCompatActivity {
    MediaPlayer tablaMusic;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enrique);
        Intent caller = getIntent();
        tablaMusic =  MediaPlayer.create(this, R.raw.miami);
    }
    public void playMusic (View v){
        tablaMusic.start();
    }

    public void pauseMusic (View v){
        if(tablaMusic.isPlaying())
            tablaMusic.pause();
    }

    public void stopMusic (View v){
        if(tablaMusic.isPlaying())
            tablaMusic.stop();
    }

    public void slyrics (View v){
        webView.loadUrl("https://genius.com/Enrique-iglesias-move-to-miami-lyrics");
    }
}
