package com.example.myculture;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Sankranti extends AppCompatActivity {
    private float mScale = 1f;
    private ScaleGestureDetector mScaleDetector;
    GestureDetector gestureDetector;
    private static final String COMMON_TAG = "OrintationChange";
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sankranti);
        gestureDetector = new GestureDetector(this, new com.example.myculture.GestureListener());
        //Button1
        Button button01=(Button) findViewById(R.id.button1);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview = (TextView) findViewById(R.id.text);
                InputStream inputStream = getResources().openRawResource(R.raw.text);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int i;
                try
                {
                    i = inputStream.read();
                    while (i != -1)
                    {
                        byteArrayOutputStream.write(i);
                        i = inputStream.read();
                    }
                    inputStream.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                textview.setText(byteArrayOutputStream.toString());
            }
        });

        //Button2
        Button button02=(Button) findViewById(R.id.button2);
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview = (TextView) findViewById(R.id.text);
                //textview.setText("Button2");
                InputStream inputStream = getResources().openRawResource(R.raw.text1);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int i;
                try
                {
                    i = inputStream.read();
                    while (i != -1)
                    {
                        byteArrayOutputStream.write(i);
                        i = inputStream.read();
                    }
                    inputStream.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                textview.setText(byteArrayOutputStream.toString());

            }
        });

        //Button3
        Button button03=(Button) findViewById(R.id.button3);
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview = (TextView) findViewById(R.id.text);
                //textview.setText("Button2");
                InputStream inputStream = getResources().openRawResource(R.raw.text2);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int i;
                try
                {
                    i = inputStream.read();
                    while (i != -1)
                    {
                        byteArrayOutputStream.write(i);
                        i = inputStream.read();
                    }
                    inputStream.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                textview.setText(byteArrayOutputStream.toString());

            }
        });
        Button button04=(Button) findViewById(R.id.button4);
        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview = (TextView) findViewById(R.id.text);
                //startActivity(intent);
                textview.setText("Button4");
            }
        });
        Button button05=(Button) findViewById(R.id.button5);
        button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview = (TextView) findViewById(R.id.text);
                //startActivity(intent);
                textview.setText("Button5");
            }
        });
        Button button06=(Button) findViewById(R.id.button6);
        button06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview = (TextView) findViewById(R.id.text);
                //startActivity(intent);
                textview.setText("Button6");
            }
        });

        zoom();
    }

    public void zoom()
    {
        mScaleDetector = new ScaleGestureDetector(this, new ScaleGestureDetector.SimpleOnScaleGestureListener()
        {
            @Override
            public boolean onScale(ScaleGestureDetector detector)
            {
                float scale = 1 - detector.getScaleFactor();

                float prevScale = mScale;
                mScale += scale;

                if (mScale < 0.1f) // Minimum scale condition:
                    mScale = 0.1f;

                if (mScale > 1f) // Maximum scale condition:
                    mScale = 1f;
                ScaleAnimation scaleAnimation = new ScaleAnimation(1f / prevScale, 1f / mScale, 1f / prevScale, 1f / mScale, detector.getFocusX(), detector.getFocusY());
                scaleAnimation.setDuration(0);
                scaleAnimation.setFillAfter(true);
                ScrollView layout =(ScrollView) findViewById(R.id.scrollViewZoom);
                layout.startAnimation(scaleAnimation);
                return true;
            }
        });

    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        super.dispatchTouchEvent(event);
        mScaleDetector.onTouchEvent(event);
        gestureDetector.onTouchEvent(event);
        return gestureDetector.onTouchEvent(event);
    }
}
