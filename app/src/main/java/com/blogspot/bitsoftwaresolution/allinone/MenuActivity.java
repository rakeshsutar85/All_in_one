package com.blogspot.bitsoftwaresolution.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {

    ImageButton imageButton1;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;
    ImageButton imageButton6;
    ImageButton imageButton7;
    ImageButton imageButton8;
    ImageButton imageButton9;
    ImageButton imageButton10;
    ImageButton imageButton11;
    ImageButton imageButton12;
    ImageButton imageButton13;
    ImageButton imageButton14;
    ImageButton imageButton15;
    ImageButton imageButton16;
    ImageButton imageButton17;
    ImageButton imageButton18;
    ImageButton imageButton19;
    ImageButton imageButton20;
    ImageButton imageButton21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        imageButton1=findViewById(R.id.imgButton1);
        imageButton2=findViewById(R.id.imgButton2);
        imageButton3=findViewById(R.id.imgButton3);
        imageButton4=findViewById(R.id.imgButton4);
        imageButton5=findViewById(R.id.imgButton5);
        imageButton6=findViewById(R.id.imgButton6);
        imageButton7=findViewById(R.id.imgButton7);
        imageButton8=findViewById(R.id.imgButton8);
        imageButton9=findViewById(R.id.imgButton9);
        imageButton10=findViewById(R.id.imgButton10);
        imageButton11=findViewById(R.id.imgButton11);
        imageButton12=findViewById(R.id.imgButton12);
        imageButton13=findViewById(R.id.imgButton13);
        imageButton14=findViewById(R.id.imgButton14);
        imageButton15=findViewById(R.id.imgButton15);
        imageButton16=findViewById(R.id.imgButton16);
        imageButton17=findViewById(R.id.imgButton17);
        imageButton18=findViewById(R.id.imgButton18);
        imageButton19=findViewById(R.id.imgButton19);
        imageButton20=findViewById(R.id.imgButton20);
        imageButton21=findViewById(R.id.imgButton21);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String easyPuzzle="https://www.geeksforgeeks.org/";
                Intent i = new Intent(MenuActivity.this, WebActivity.class);
                i.putExtra("epuzzle", easyPuzzle);
                startActivity(i);
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String easyPuzzle="https://www.w3schools.com/";
                Intent i = new Intent(MenuActivity.this, WebActivity.class);
                i.putExtra("epuzzle", easyPuzzle);
                startActivity(i);

            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String easyPuzzle="https://www.javatpoint.com/";
                Intent i = new Intent(MenuActivity.this, WebActivity.class);
                i.putExtra("epuzzle", easyPuzzle);
                startActivity(i);
            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String easyPuzzle="https://stackoverflow.com/";
                Intent i = new Intent(MenuActivity.this, WebActivity.class);
                i.putExtra("epuzzle", easyPuzzle);
                startActivity(i);
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String easyPuzzle="https://github.com/";
                Intent i = new Intent(MenuActivity.this, WebActivity.class);
                i.putExtra("epuzzle", easyPuzzle);
                startActivity(i);
            }
        });
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String easyPuzzle="https://stackexchange.com/";
                Intent i = new Intent(MenuActivity.this, WebActivity.class);
                i.putExtra("epuzzle", easyPuzzle);
                startActivity(i);
            }
        });
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String easyPuzzle="https://www.tutorialspoint.com/index.htm";
                Intent i = new Intent(MenuActivity.this, WebActivity.class);
                i.putExtra("epuzzle", easyPuzzle);
                startActivity(i);
            }
        });
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String easyPuzzle="https://www.facebook.com/";
                Intent i = new Intent(MenuActivity.this, WebActivity.class);
                i.putExtra("epuzzle", easyPuzzle);
                startActivity(i);
            }
        });
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String easyPuzzle="https://www.instagram.com/";
                Intent i = new Intent(MenuActivity.this, WebActivity.class);
                i.putExtra("epuzzle", easyPuzzle);
                startActivity(i);
            }
        });
        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String easyPuzzle="https://twitter.com/?lang=en";
                Intent i = new Intent(MenuActivity.this, WebActivity.class);
                i.putExtra("epuzzle", easyPuzzle);
                startActivity(i);
            }
        });
        imageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String easyPuzzle="https://www.thehindu.com/";
                Intent i = new Intent(MenuActivity.this, WebActivity.class);
                i.putExtra("epuzzle", easyPuzzle);
                startActivity(i);
            }
        });
        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String easyPuzzle="https://indianexpress.com/";
                Intent i = new Intent(MenuActivity.this, WebActivity.class);
                i.putExtra("epuzzle", easyPuzzle);
                startActivity(i);
            }
        });
        imageButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String easyPuzzle="https://economictimes.indiatimes.com/";
                Intent i = new Intent(MenuActivity.this, WebActivity.class);
                i.putExtra("epuzzle", easyPuzzle);
                startActivity(i);
            }
        });
        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String easyPuzzle="https://timesofindia.indiatimes.com/";
                Intent i = new Intent(MenuActivity.this, WebActivity.class);
                i.putExtra("epuzzle", easyPuzzle);
                startActivity(i);
            }
        });
        imageButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String easyPuzzle="https://www.financialexpress.com/";
                Intent i = new Intent(MenuActivity.this, WebActivity.class);
                i.putExtra("epuzzle", easyPuzzle);
                startActivity(i);
            }
        });
        imageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String easyPuzzle="https://www.hindustantimes.com/";
                Intent i = new Intent(MenuActivity.this, WebActivity.class);
                i.putExtra("epuzzle", easyPuzzle);
                startActivity(i);
            }
        });
        imageButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String easyPuzzle="https://www.telegraphindia.com/";
                Intent i = new Intent(MenuActivity.this, WebActivity.class);
                i.putExtra("epuzzle", easyPuzzle);
                startActivity(i);
            }
        });
        imageButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String easyPuzzle="https://www.thestatesman.com/";
                Intent i = new Intent(MenuActivity.this, WebActivity.class);
                i.putExtra("epuzzle", easyPuzzle);
                startActivity(i);
            }
        });
        imageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String easyPuzzle="https://samajaepaper.in/";
                Intent i = new Intent(MenuActivity.this, WebActivity.class);
                i.putExtra("epuzzle", easyPuzzle);
                startActivity(i);
            }
        });
        imageButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String easyPuzzle="https://www.sambadepaper.com/";
                Intent i = new Intent(MenuActivity.this, WebActivity.class);
                i.putExtra("epuzzle", easyPuzzle);
                startActivity(i);
            }
        });
        imageButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String easyPuzzle="http://dharitriepaper.in/";
                Intent i = new Intent(MenuActivity.this, WebActivity.class);
                i.putExtra("epuzzle", easyPuzzle);
                startActivity(i);
            }
        });
    }
}