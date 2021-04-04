package com.example.myculture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Switch;

public class Allinonelist extends AppCompatActivity
{
    AutoCompleteTextView searchlist;
    ImageButton searchbtn;
    String buttonname;
Boolean buttonenabled=true;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        final String[] aarthilist=new String[]{"Ganesh Aarthi","Durga Aarthi","Shankar Aarthi","Hanuman Aarthi"};
        final String[] chalisalist=new String[]{"Ganesh Chalisa","Durga Chalisa","Shankar Chalisa","Hanuman Chalisa"};
        final String[] festivals=new String[]{"Sankranti","Holi","Dusshera","Deepavali"};
        final String[] Vrathlist=new String[]{"Pradosh Vrath","Ekadashi Vrath","Poonam Vrath","Amavasya Vrath"};

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allinonelist);
        searchlist=(AutoCompleteTextView)findViewById(R.id.atv);
        searchbtn=(ImageButton)findViewById(R.id.search);
        searchlist.setThreshold(1);
        buttonname=getIntent().getExtras().getString("buttonname");


        switch (buttonname)
    {
        case "aarthi" :
            {
                ListView list1=(ListView) findViewById(R.id.list_item);
                ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,aarthilist);
                list1.setAdapter(adapter);
                ArrayAdapter<String> adapteratv=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,aarthilist);
                searchlist.setAdapter(adapteratv);
                searchbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String autod=searchlist.getText().toString().toLowerCase().trim();
                        Intent dropintent=new Intent(Allinonelist.this,Allinone.class);
                        dropintent.putExtra("name",autod);
                        dropintent.putExtra("relativevalue",1);
                        dropintent.putExtra("listname","aarthi");
                        startActivity(dropintent);
                    }
                });
                list1.setOnItemClickListener(new AdapterView.OnItemClickListener()
                {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                    {
                        if(buttonenabled)
                        {
                            buttonenabled =false;
                            if (position == 0) {
                                Intent myintent = new Intent(view.getContext(), Allinone.class);
                                myintent.putExtra("c", 0);
                                myintent.putExtra("name","aarthi");
                                myintent.putExtra("relativevalue",2);
                                startActivityForResult(myintent, 0);
                            }
                            if (position == 1) {
                                Intent myintent = new Intent(view.getContext(), Allinone.class);
                                myintent.putExtra("c", 1);
                                myintent.putExtra("name","aarthi");
                                myintent.putExtra("relativevalue",2);
                                startActivityForResult(myintent, 1);
                            }
                            if (position == 2) {
                                Intent myintent = new Intent(view.getContext(), Allinone.class);
                                myintent.putExtra("c", 2);
                                myintent.putExtra("relativevalue",2);
                                myintent.putExtra("name","aarthi");
                                startActivityForResult(myintent, 2);
                            }
                            if (position == 3) {
                                Intent myintent = new Intent(view.getContext(), Allinone.class);
                                myintent.putExtra("c", 3);
                                myintent.putExtra("relativevalue",2);
                                myintent.putExtra("name","aarthi");
                                startActivityForResult(myintent, 3);
                            }
                        }
                    }
                });
            }
            break;
        case "chalisa" :
        {
            ListView list1=(ListView) findViewById(R.id.list_item);
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,chalisalist);
            list1.setAdapter(adapter);
            ArrayAdapter<String> adapteratv=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,chalisalist);
            searchlist.setAdapter(adapteratv);
            searchbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String autod=searchlist.getText().toString().toLowerCase().trim();
                    Intent dropintent=new Intent(Allinonelist.this,Allinone.class);
                    dropintent.putExtra("name",autod);
                    dropintent.putExtra("relativevalue",1);
                    dropintent.putExtra("listname","chalisa");
                    startActivity(dropintent);
                }
            });
            list1.setOnItemClickListener(new AdapterView.OnItemClickListener()
            {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (buttonenabled)
                    {
                        buttonenabled = false;

                        if (position == 0) {
                            Intent intent = new Intent(view.getContext(), Allinone.class);
                            intent.putExtra("c", 0);
                            intent.putExtra("name","chalisa");
                            intent.putExtra("relativevalue",2);
                            startActivityForResult(intent, 0);
                        }
                        if (position == 1) {
                            Intent intent = new Intent(view.getContext(), Allinone.class);
                            intent.putExtra("c", 1);
                            intent.putExtra("name","chalisa");
                            intent.putExtra("relativevalue",2);
                            startActivityForResult(intent, 1);
                        }
                        if (position == 2) {
                            Intent intent = new Intent(view.getContext(), Allinone.class);
                            intent.putExtra("c", 2);
                            intent.putExtra("name","chalisa");
                            intent.putExtra("relativevalue",2);
                            startActivityForResult(intent, 2);
                        }
                        if (position == 3) {
                            Intent intent = new Intent(view.getContext(), Allinone.class);
                            intent.putExtra("c", 3);
                            intent.putExtra("name","chalisa");
                            intent.putExtra("relativevalue",2);
                            startActivityForResult(intent, 3);
                        }
                    }
                }
            });

        }
        break;
        case "vrath" :
        {
            ListView list1=(ListView) findViewById(R.id.list_item);
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Vrathlist);
            list1.setAdapter(adapter);
            ArrayAdapter<String> adapteratv=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,Vrathlist);
            searchlist.setAdapter(adapteratv);
            searchbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String autod=searchlist.getText().toString().toLowerCase().trim();
                    Intent dropintent=new Intent(Allinonelist.this,Allinone.class);
                    dropintent.putExtra("name",autod);
                    dropintent.putExtra("relativevalue",1);
                    dropintent.putExtra("listname","vrath");
                    startActivity(dropintent);
                }
            });
            list1.setOnItemClickListener(new AdapterView.OnItemClickListener()
            {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if(buttonenabled) {
                        buttonenabled = false;

                        if (position == 0) {
                            Intent myintent = new Intent(view.getContext(), Allinone.class);
                            myintent.putExtra("c", 0);
                            myintent.putExtra("name","vrath");
                            myintent.putExtra("relativevalue",2);
                            startActivityForResult(myintent, 0);
                        }
                        if (position == 1) {
                            Intent myintent = new Intent(view.getContext(), Allinone.class);
                            myintent.putExtra("name","vrath");
                            myintent.putExtra("c", 1);
                            myintent.putExtra("relativevalue",2);
                            startActivityForResult(myintent, 1);
                        }
                        if (position == 2) {
                            Intent myintent = new Intent(view.getContext(), Allinone.class);
                            myintent.putExtra("c", 2);
                            myintent.putExtra("name","vrath");
                            myintent.putExtra("relativevalue",2);
                            startActivityForResult(myintent, 2);
                        }
                        if (position == 3) {
                            Intent myintent = new Intent(view.getContext(), Allinone.class);
                            myintent.putExtra("c", 3);
                            myintent.putExtra("name","vrath");
                            myintent.putExtra("relativevalue",2);
                            startActivityForResult(myintent, 3);
                        }
                    }
                }
            });
        }
        break;
        case "festivals" :
        {
            ListView list1=(ListView) findViewById(R.id.list_item);
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,festivals);
            list1.setAdapter(adapter);
            ArrayAdapter<String> adapteratv=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,festivals);
            searchlist.setAdapter(adapteratv);
            searchbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String autod=searchlist.getText().toString().toLowerCase().trim();
                    Intent dropintent=new Intent(Allinonelist.this,Festivaldetails.class);
                    dropintent.putExtra("name",autod);
                    dropintent.putExtra("relativevalue",1);
                    dropintent.putExtra("listname","aarthi");
                    startActivity(dropintent);
                }
            });
            list1.setOnItemClickListener(new AdapterView.OnItemClickListener()
            {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if(buttonenabled) {
                        buttonenabled = false;

                        if (position == 0) {
                            Intent myintent = new Intent(view.getContext(), Festivaldetails.class);
                            myintent.putExtra("c", 0);
                            myintent.putExtra("relativevalue",2);
                            startActivityForResult(myintent, 0);
                        }
                        if (position == 1) {
                            Intent myintent = new Intent(view.getContext(), Festivaldetails.class);
                            myintent.putExtra("c", 1);
                            myintent.putExtra("relativevalue",2);
                            startActivityForResult(myintent, 1);
                        }
                        if (position == 2) {
                            Intent myintent = new Intent(view.getContext(), Festivaldetails.class);
                            myintent.putExtra("c", 2);
                            myintent.putExtra("relativevalue",2);
                            startActivityForResult(myintent, 2);
                        }
                        if (position == 3) {
                            Intent myintent = new Intent(view.getContext(), Festivaldetails.class);
                            myintent.putExtra("c", 3);
                            myintent.putExtra("relativevalue",2);
                            startActivityForResult(myintent, 3);
                        }
                    }
                }
            });
        }
        break;




    }
    }
    @Override
    protected void onResume()
    {
         buttonenabled = true;
        super.onResume();
    }
}
