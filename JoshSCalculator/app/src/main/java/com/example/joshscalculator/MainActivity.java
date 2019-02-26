package com.example.joshscalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        Button divBtn = (Button) findViewById(R.id.divBtn);
        Button mulBtn = (Button) findViewById(R.id.mulBtn);
        Button subBtn = (Button) findViewById(R.id.subBtn);
        addBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                EditText FirstNumEditText = (EditText) findViewById(R.id.FirstNumEditText);
                EditText SecondNumEditText = (EditText) findViewById(R.id.SecondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Double.parseDouble(FirstNumEditText.getText().toString());
                double num2 = Double.parseDouble(SecondNumEditText.getText().toString());
                double result = num1 + num2;
                resultTextView.setText(result + "");
            }
        });
        divBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                EditText FirstNumEditText = (EditText) findViewById(R.id.FirstNumEditText);
                EditText SecondNumEditText = (EditText) findViewById(R.id.SecondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Double.parseDouble(FirstNumEditText.getText().toString());
                double num2 = Double.parseDouble(SecondNumEditText.getText().toString());
                double result = num1 / num2;
                resultTextView.setText(result + "");
            }
        });
        mulBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                EditText FirstNumEditText = (EditText) findViewById(R.id.FirstNumEditText);
                EditText SecondNumEditText = (EditText) findViewById(R.id.SecondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Double.parseDouble(FirstNumEditText.getText().toString());
                double num2 = Double.parseDouble(SecondNumEditText.getText().toString());
                double result = num1 * num2;
                resultTextView.setText(result + "");
            }
        });
        subBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                EditText FirstNumEditText = (EditText) findViewById(R.id.FirstNumEditText);
                EditText SecondNumEditText = (EditText) findViewById(R.id.SecondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Double.parseDouble(FirstNumEditText.getText().toString());
                double num2 = Double.parseDouble(SecondNumEditText.getText().toString());
                double result = num1 - num2;
                resultTextView.setText(result + "");
            }
        });
    }
}
