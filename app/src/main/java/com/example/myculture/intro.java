package com.example.myculture;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class intro extends AppCompatActivity {
    private int SLEEP_TIMER = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // getSupportActionBar().hide();
        setContentView(R.layout.activity_intro);
        LogoLauncher logoLauncher = new LogoLauncher();
        logoLauncher.start();
    }

    private class LogoLauncher extends Thread{
        public void run()
        {
            try
            {
                sleep(1000 * SLEEP_TIMER);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }

            Intent intent = new Intent(intro.this, MainActivity.class);
            startActivity(intent);
            intro.this.finish();
        }
    }

}
