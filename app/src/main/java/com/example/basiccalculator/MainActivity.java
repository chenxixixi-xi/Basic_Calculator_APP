package com.example.basiccalculator;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1,number2;
    Button addition, subtraction, division, multiplication;

    int result_num,num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1=(EditText) findViewById(R.id.number1);
        number2=(EditText) findViewById(R.id.number2);
        addition=(Button)findViewById(R.id.addition);
        subtraction=(Button)findViewById(R.id.subtraction);
        division=(Button)findViewById(R.id.division);
        multiplication=(Button)findViewById(R.id.multiplication);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1=Integer.parseInt(number1.getText().toString());
                num2=Integer.parseInt(number2.getText().toString());
                result_num=num1+num2;
                goToActivity2(result_num);
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(number1.getText().toString());
                num2=Integer.parseInt(number2.getText().toString());
                result_num=num1-num2;
                goToActivity2(result_num);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1=Integer.parseInt(number1.getText().toString());
                num2=Integer.parseInt(number2.getText().toString());
                result_num=num1/num2;
                goToActivity2(result_num);


            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(number1.getText().toString());
                num2=Integer.parseInt(number2.getText().toString());
                result_num=num1*num2;
                goToActivity2(result_num);
            }
        });
    }

    public void goToActivity2(int result_num){
        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra("result",result_num);
        startActivity(intent);
    }


}