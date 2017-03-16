package com.example.toshiba.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.imageButton1);
        b2 = (Button) findViewById(R.id.imageButton2);
        b3 = (Button) findViewById(R.id.imageButton3);
        b4 = (Button) findViewById(R.id.imageButton4);
        b5 = (Button) findViewById(R.id.imageButton5);

        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent1);
                                  }
                              });
                b2.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View view) {
                        Intent intent2 = new Intent(MainActivity.this, Activity3.class);
                        startActivity(intent2);
                        }
                    });

                    b3.setOnClickListener(new View.OnClickListener()
                    {

                        public void onClick (View view){
                            Intent intent3 = new Intent(MainActivity.this, Activity4.class);
                            startActivity(intent3);
                    }
                    });

                    b4.setOnClickListener(new View.OnClickListener()
                    {

                        public void onClick (View view){
                            Intent intent4 = new Intent(MainActivity.this, Activity5.class);
                            startActivity(intent4);
                    }
                    });

                    b5.setOnClickListener(new View.OnClickListener()
                    {

                        public void onClick (View view){
                            Intent intent5 = new Intent(MainActivity.this, Activity6.class);
                            startActivity(intent5);
                        }

                    });
                    }


                }


