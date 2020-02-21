package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button br,bg,bb,by,bo;
    boolean r=false,g=false,bl=false,y=false,o=false;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bb=(Button)findViewById((R.id.blue));
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.blue) {
                    if (bl == false) {
                        bb.setBackgroundColor(Color.BLUE);
                        bl = true;
                    } else {
                        bb.setBackgroundColor(Color.LTGRAY);
                        bl = false;
                    }
                }
            }
        });
        br=(Button)findViewById(R.id.red);
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.red){
                    if(r==false){
                        br.setBackgroundColor(Color.RED);
                        r=true;
                    }
                    else{
                        br.setBackgroundColor(Color.LTGRAY);
                        r=false;
                    }
                }
            }
        });
        bg=(Button)findViewById(R.id.green);
        bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.green){
                    if(g==false){
                        bg.setBackgroundColor(Color.GREEN);
                        g=true;
                    }
                    else{
                        bg.setBackgroundColor(Color.LTGRAY);
                        g=false;
                    }
                }
            }
        });
        by=(Button)findViewById(R.id.yellow);
        by.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.yellow){
                    if(y==false){
                        by.setBackgroundColor(Color.YELLOW);
                        y=true;
                    }
                    else{
                        by.setBackgroundColor(Color.LTGRAY);
                        y=false;
                    }
                }
            }
        });
        bo=(Button)findViewById(R.id.orange);
        bo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.orange){
                    if(o==false){
                        bo.setBackgroundResource(R.color.colorAccent);
                        o=true;
                    }
                    else{
                        bo.setBackgroundColor(Color.LTGRAY);
                        o=false;

                    }
                }
            }
        });


    }




}
