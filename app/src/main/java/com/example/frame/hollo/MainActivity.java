package com.example.frame.hollo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import android.view.View;

import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button_1);
        btn1.setOnClickListener(this);

        Button btn2 = (Button) findViewById(R.id.button_2);
        btn2.setOnClickListener(this);

        Button btn3 = (Button) findViewById(R.id.button_3);
        btn3.setOnClickListener(this);

        Button btn4 = (Button) findViewById(R.id.button_4);
        btn4.setOnClickListener(this);

        Button btn5 = (Button) findViewById(R.id.button_5);
        btn5.setOnClickListener(this);

        Button btn6 = (Button) findViewById(R.id.button_6);
        btn6.setOnClickListener(this);

        Button btn7 = (Button) findViewById(R.id.button_7);
        btn7.setOnClickListener(this);

        Button btn8 = (Button) findViewById(R.id.button_8);
        btn8.setOnClickListener(this);

        Button btn9 = (Button) findViewById(R.id.button_9);
        btn9.setOnClickListener(this);

        Button btn0 = (Button) findViewById(R.id.button_0);
        btn0.setOnClickListener(this);

        Button btnC = (Button) findViewById(R.id.clear_button);
        btnC.setOnClickListener(this);
    }
    String Num = "";
    int count = 0 ;
    public void onClick(View v) {
        //Toast t = Toast.makeText(this."Hello", Toast.LENGTH_LONG);
        //t.show();
        TextView TV = (TextView) findViewById(R.id.digit_text_view);
        int id = v.getId();
        int test;

        if(id == R.id.button_1 && count<6){
            count++;
            Num = Num+"1";
            TV.setText(Num);
        } else  if(id == R.id.button_2 && count<6){
            count++;
            Num = Num+"2";
            TV.setText(Num);
        } else  if(id == R.id.button_3&& count<6){
            count++;
            Num = Num+"3";
            TV.setText(Num);
        } else  if(id == R.id.button_4&& count<6){
            count++;
            Num = Num+"4";
            TV.setText(Num);
        } else  if(id == R.id.button_5&& count<6){
            count++;
            Num = Num+"5";
            TV.setText(Num);
        } else  if(id == R.id.button_6&& count<6){
            count++;
            Num = Num+"6";
            TV.setText(Num);
        } else  if(id == R.id.button_7&& count<6){
            count++;
            Num = Num+"7";
            TV.setText(Num);
        } else  if(id == R.id.button_8&& count<6){
            count++;
            Num = Num+"8";
            TV.setText(Num);

            //ddoo
            //fddfs
        } else  if(id == R.id.button_9&& count<6){
            count++;
            Num = Num+"9";
            TV.setText(Num);
        } else  if(id == R.id.button_0&& count<6){
            count++;
            Num = Num + "0";
            TV.setText(Num);
        } else  if(id == R.id.clear_button){
            count = 0;
            Num = "";
            TV.setText("");
        }


    }
}