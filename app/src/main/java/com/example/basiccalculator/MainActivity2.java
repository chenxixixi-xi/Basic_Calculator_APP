package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView result;
    int result_num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        result=(TextView)findViewById(R.id.result);
        Intent intent=getIntent();
        result_num=intent.getIntExtra("result",result_num);

        result.setText(String.valueOf(" "+result_num));
    }
}