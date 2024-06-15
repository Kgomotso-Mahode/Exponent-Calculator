package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editTextBase, editTextExponent;
    Button buttonCalculate;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextBase = findViewById(R.id.editTextBase);
        editTextExponent = findViewById(R.id.editTextExponent);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double base = Double.parseDouble(editTextBase.getText().toString());
                double exponent = Double.parseDouble(editTextExponent.getText().toString());
                double result = Math.pow(base, exponent);
                textViewResult.setText("       " + result);
            }
        });
    }
}
