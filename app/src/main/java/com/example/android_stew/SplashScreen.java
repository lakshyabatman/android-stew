package com.example.android_stew;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.WindowManager;
import android.os.Handler;
import android.content.Intent;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_SCREEN_TIME_OUT=2000;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(SplashScreen.this,
                        MainActivity.class);

                startActivity(i);

                finish();
            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
}
