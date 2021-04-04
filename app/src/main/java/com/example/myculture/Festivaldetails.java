package com.example.myculture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

public class Festivaldetails extends AppCompatActivity {
    private float mScale = 1f;
    private ScaleGestureDetector mScaleDetector;
    GestureDetector gestureDetector;
    private static final String COMMON_TAG = "OrintationChange";
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    String dropdownvalue,name,listname;
    Button button1,button2,button3,button4,button5,button6,button7;
    TextView festname,textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festivaldetails);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        festname=(TextView)findViewById(R.id.textView);
        textview=(TextView)findViewById(R.id.text);
        Integer no=getIntent().getExtras().getInt("c");
        dropdownvalue=getIntent().getExtras().getString("name");
        name=getIntent().getExtras().getString("name");
        //listname=getIntent().getExtras().getString("listname");
        Integer relativeno=getIntent().getExtras().getInt("relativevalue");
        switch (relativeno)
        {
            case 1 :
            {
                switch (dropdownvalue)
                {
                    case "sankranti" :
                    {
                        sankranti();
                    }break;
                    case "holi" :
                    {
                        holi();
                    }break;
                    case "dusshera" :
                    {
                        dusshera();
                    }break;
                    case "deepavali" :
                    {
                        deepavali();
                    }break;
                }
            }break;
            case 2 :
            {
                switch (no)
                {
                    case 0 :
                    {
                        sankranti();
                    }break;
                    case 1 :
                    {
                        holi();
                    }break;
                    case 2 :
                    {
                        dusshera();
                    }break;
                    case 3 :
                    {
                        deepavali();
                    }break;
                }
            }break;
        }

    }
public  void sankranti()
{
    festname.setText("SANKRANTI");
    button1.setVisibility(View.VISIBLE);
    button2.setVisibility(View.VISIBLE);
    button3.setVisibility(View.VISIBLE);
    button4.setVisibility(View.VISIBLE);
    button5.setVisibility(View.VISIBLE);
    button6.setVisibility(View.VISIBLE);
    gestureDetector = new GestureDetector(this, new com.example.myculture.GestureListener());
    //Button1
  //  Button button01=(Button) findViewById(R.id.button1);
    button1.setOnClickListener(new View.OnClickListener() {
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
  //  Button button02=(Button) findViewById(R.id.button2);
    button2.setOnClickListener(new View.OnClickListener() {
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
    //Button button3=(Button) findViewById(R.id.button3);
    button3.setOnClickListener(new View.OnClickListener() {
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
    //Button button04=(Button) findViewById(R.id.button4);
    button4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView textview = (TextView) findViewById(R.id.text);
            //startActivity(intent);
            textview.setText("Button4");
        }
    });
    //Button button5=(Button) findViewById(R.id.button5);
    button5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView textview = (TextView) findViewById(R.id.text);
            //startActivity(intent);
            textview.setText("Button5");
        }
    });
    //Button button6=(Button) findViewById(R.id.button6);
    button6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView textview = (TextView) findViewById(R.id.text);
            //startActivity(intent);
            textview.setText("Button6");
        }
    });

    zoom();
}
    public  void holi()
    {
        festname.setText("HOLI");
        button1.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        button3.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);
        button5.setVisibility(View.VISIBLE);
        button6.setVisibility(View.VISIBLE);
        gestureDetector = new GestureDetector(this, new com.example.myculture.GestureListener());
        //Button1
        //  Button button01=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
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
        //  Button button02=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
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
        //Button button3=(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
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
        //Button button04=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview = (TextView) findViewById(R.id.text);
                //startActivity(intent);
                textview.setText("Button4");
            }
        });
        //Button button5=(Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview = (TextView) findViewById(R.id.text);
                //startActivity(intent);
                textview.setText("Button5");
            }
        });
        //Button button6=(Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview = (TextView) findViewById(R.id.text);
                //startActivity(intent);
                textview.setText("Button6");
            }
        });

        zoom();
    }

    public  void deepavali()
    {
        festname.setText("DEEPAVALI");
        button1.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        button3.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);
        button5.setVisibility(View.VISIBLE);
        button6.setVisibility(View.VISIBLE);
        gestureDetector = new GestureDetector(this, new com.example.myculture.GestureListener());
        //Button1
        //  Button button01=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
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
        //  Button button02=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
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
        //Button button3=(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
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
        //Button button04=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview = (TextView) findViewById(R.id.text);
                //startActivity(intent);
                textview.setText("Button4");
            }
        });
        //Button button5=(Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview = (TextView) findViewById(R.id.text);
                //startActivity(intent);
                textview.setText("Button5");
            }
        });
        //Button button6=(Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview = (TextView) findViewById(R.id.text);
                //startActivity(intent);
                textview.setText("Button6");
            }
        });

        zoom();
    }

    public  void dusshera()
    {
        festname.setText("DUSSHERA");
        button1.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        button3.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);
        button5.setVisibility(View.VISIBLE);
        button6.setVisibility(View.VISIBLE);
        gestureDetector = new GestureDetector(this, new com.example.myculture.GestureListener());
        //Button1
        //  Button button01=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
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
        //  Button button02=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
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
        //Button button3=(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
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
        //Button button04=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview = (TextView) findViewById(R.id.text);
                //startActivity(intent);
                textview.setText("Button4");
            }
        });
        //Button button5=(Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview = (TextView) findViewById(R.id.text);
                //startActivity(intent);
                textview.setText("Button5");
            }
        });
        //Button button6=(Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
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

