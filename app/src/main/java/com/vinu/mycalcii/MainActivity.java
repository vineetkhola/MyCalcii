package com.vinu.mycalcii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
 TextInputEditText firstno,secondno;
 Button ADD,SUB,MUL,REM,CLEAR;
 TextView RESULT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstno = findViewById(R.id.first_number);
        secondno = findViewById(R.id.second_number);
        ADD = findViewById(R.id.add);
        SUB = findViewById(R.id.sub);
        MUL = findViewById(R.id.mul);
        REM = findViewById(R.id.rem);
        CLEAR = findViewById(R.id.clear);
        RESULT = findViewById(R.id.result);

            ADD.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final double first = Double.parseDouble(firstno.getText().toString().trim());
                    final double second = Double.parseDouble(secondno.getText().toString().trim());
                    double result = first + second;
                    RESULT.setText("Addition Result is:\n" + result);
                }
            });
            SUB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final double first = Double.parseDouble(firstno.getText().toString().trim());
                    final double second = Double.parseDouble(secondno.getText().toString().trim());
                    if (first > second) {
                        double result = first - second;
                        RESULT.setText("Subtraction Result is:\n" + result);
                    } else {
                        double result = second - first;
                        RESULT.setText("Subtraction Result is:\n" + result);
                    }
                }
            });
            MUL.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final double first = Double.parseDouble(firstno.getText().toString().trim());
                    final double second = Double.parseDouble(secondno.getText().toString().trim());
                    double result = first * second;
                    RESULT.setText("Multiplication Result is:\n" + result);
                }
            });
            REM.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final double first = Double.parseDouble(firstno.getText().toString().trim());
                    final double second = Double.parseDouble(secondno.getText().toString().trim());
                    double result = first % second;
                    RESULT.setText("Remainder Result is:\n" + result);
                }
            });
            CLEAR.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    firstno.setText("");
                    secondno.setText("");
                    RESULT.setText("Result is:\n" + " ");
                }
            });

    }
}