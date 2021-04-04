package com.example.myculture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Allinone extends AppCompatActivity
{
    String name,dropdownvalue,listname;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allinone);
        TextView  txt=(TextView)findViewById(R.id.text);
        txt.setText("hello");
        Integer no=getIntent().getExtras().getInt("c");
        dropdownvalue=getIntent().getExtras().getString("name");
        name=getIntent().getExtras().getString("name");
        listname=getIntent().getExtras().getString("listname");
        Integer relativeno=getIntent().getExtras().getInt("relativevalue");
        switch (relativeno)
        {
            case 1: {
                switch (listname) {
                    case "aarthi": {
                        switch (dropdownvalue) {
                            case "ganesh aarthi": {
                                txt.setText("ganesh");
                            }
                            break;
                            case "durga aarthi": {
                                txt.setText("durga");
                            }
                            break;
                            case "shankar aarthi": {
                                txt.setText("shankar");
                            }
                            break;
                            case "hanuman aarthi": {
                                txt.setText("hanuman");
                            }
                            break;
                        }
                    }
                    break;
                    case "chalisa": {
                        switch (dropdownvalue) {
                            case "ganesh chalisa": {
                                txt.setText("ganesh");
                            }
                            break;
                            case "durga chalisa": {
                                txt.setText("durga");
                            }
                            break;
                            case "shankar chalisa": {
                                txt.setText("shankar");
                            }
                            break;
                            case "hanuman chalisa": {
                                txt.setText("hanuman");
                            }
                            break;
                        }
                    }
                    break;
                    case "vrath": {
                        switch (dropdownvalue) {
                            case "pradosh vrath": {
                                txt.setText("pradosh");
                            }
                            break;
                            case "ekadashi vrath": {
                                txt.setText("ekadashi");
                            }
                            break;
                            case "amavasya vrath": {
                                txt.setText("amavasya");
                            }
                            break;
                            case "poonam vrath": {
                                txt.setText("poonam");
                            }
                            break;
                        }
                    }
                    break;
                   /* case "festivals": {
                        switch (dropdownvalue) {
                            case "sankranthi": {
                                txt.setText("ganesh");
                            }
                            break;
                            case "holi": {
                                txt.setText("durga");
                            }
                            break;
                            case "dusshera": {
                                txt.setText("shankar");
                            }
                            break;
                            case "deepapvali": {
                                txt.setText("hanuman");
                            }
                            break;
                        }
                    }
                    break;*/

                }
            }break;
                case 2: {
                    switch (name) {
                        case "vrath": {
                            switch (no) {
                                case 0:
                                    txt.setText("Pradosh");
                                    break;
                                case 1:
                                    txt.setText("Ekadashi");
                                    break;
                                case 2:
                                    txt.setText("Poonam");
                                    break;
                                case 3:
                                    txt.setText("Amavasya");
                                    break;
                            }
                        }
                        break;
                        case "aarthi": {
                            switch (no) {
                                case 0:
                                    txt.setText("Ganesh");
                                    break;
                                case 1:
                                    txt.setText("Durga");
                                    break;
                                case 2:
                                    txt.setText("Shankar");
                                    break;
                                case 3:
                                    txt.setText("Hanuman");
                                    break;
                            }
                        }
                        break;
                        case "chalisa": {
                            switch (no) {
                                case 0:
                                    txt.setText("Ganesh Ji");
                                    break;
                                case 1:
                                    txt.setText("Durga Ji");
                                    break;
                                case 2:
                                    txt.setText("Shankar Ji");
                                    break;
                                case 3:
                                    txt.setText("Hanuman Ji");
                                    break;
                            }
                        }
                        break;
                    }
                }break;
        }
    }
}

