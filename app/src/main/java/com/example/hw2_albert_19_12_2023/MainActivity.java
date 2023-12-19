package com.example.hw2_albert_19_12_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    TextView tv2;
    Button btn;
    int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        tv = findViewById(R.id.tv);
        tv2 =findViewById(R.id.tv2);
    }

    public void lol(View view) {
        num++;
        if(num>= 1)
        {
          tv.setVisibility(View.VISIBLE);
          tv2.setVisibility(View.VISIBLE);
        }
        tv.setText("This is a click number:"+ num);
    }
}