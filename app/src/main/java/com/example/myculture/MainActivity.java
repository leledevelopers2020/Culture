package com.example.myculture;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    TextView marquee1;
    TextView marquee2;
    TextView marquee3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        marquee1=(TextView)findViewById(R.id.text1);
        marquee1.setSelected(true);
        marquee2=(TextView)findViewById(R.id.text2);
        marquee2.setSelected(true);
        marquee3=(TextView)findViewById(R.id.text3);
        marquee3.setSelected(true);

        Button aarthibutton = (Button) findViewById(R.id.btn4);
        aarthibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aarthi = new Intent(getApplicationContext(), Allinonelist.class);
                aarthi.putExtra("buttonname","aarthi");
                startActivity(aarthi);
            }
        });
        Button chalisabutton = (Button) findViewById(R.id.btn5);
        chalisabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chalisa = new Intent(getApplicationContext(), Allinonelist.class);
                chalisa.putExtra("buttonname","chalisa");
                startActivity(chalisa);
            }
        });
        Button festivalsbutton = (Button) findViewById(R.id.btn6);
        festivalsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent festivals = new Intent(getApplicationContext(), Allinonelist.class);
                festivals.putExtra("buttonname","festivals");
                startActivity(festivals);
            }
        });
        Button vrathbutton = (Button) findViewById(R.id.btn7);
        vrathbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vrath = new Intent(getApplicationContext(), Allinonelist.class);
                vrath.putExtra("buttonname","vrath");
                startActivity(vrath);
            }
        });


    }
}
