package com.example.steve.bmipractice;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText weight;
    private EditText height;
    private Button help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight = findViewById(R.id.ed_weight);
        height = findViewById(R.id.ed_height);
        help = findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setMessage("HAHAHA")
                        .setPositiveButton("OK",null)
                        .show();
            }
        });

    }
    public void Bmi(View view){
        Float w = Float.valueOf(weight.getText().toString());
        Float h = Float.valueOf(height.getText().toString());
        Float bmi = w / (h*h);
        new AlertDialog.Builder(this)
                .setTitle("BMI")
                .setMessage("Your BMI is "+bmi)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        weight.setText(" ");
                        height.setText(" ");
                    }
                })
                .show();
    }
}
