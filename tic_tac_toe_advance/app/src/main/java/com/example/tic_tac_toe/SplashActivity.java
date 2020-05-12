package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
ImageView play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        play=findViewById(R.id.play);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.mario);
        Handler handler=new Handler();
        mp.start();


        final MediaPlayer mpe = MediaPlayer.create(this,R.raw.two);
        Handler handlerr = new Handler();

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpe.start();

                Intent intent =new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
