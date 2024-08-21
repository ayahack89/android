package com.example.as1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bca,bba,btech,mca,mba,clr;
    TextView result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bca=findViewById(R.id.btn_bca);
        bba=findViewById(R.id.btn_bba);
        mba=findViewById(R.id.btn_mba);
        btech=findViewById(R.id.btn_btech);
        mca=findViewById(R.id.btn_mca);
        clr=findViewById(R.id.btn_clr);
        result=findViewById(R.id.txt_result);
        bca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "BCA BUTTON CLICKED", Toast.LENGTH_SHORT).show();
                result.setText("bca button clicked");
                result.setText(" ");

            }
        });
        bba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "BBA BUTTON CLICKED", Toast.LENGTH_SHORT).show();
                result.setText("bba button clicked");
                result.setText(" ");

            }
        });
        mba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "MBA BUTTON CLICKED", Toast.LENGTH_SHORT).show();
                result.setText("mba button clicked");
                result.setText(" ");

            }
        });
        btech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "BTECH BUTTON CLICKED", Toast.LENGTH_SHORT).show();
                result.setText("btech button clicked");
                result.setText(" ");
            }
        });
        mca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "MCA BUTTON CLICKED", Toast.LENGTH_SHORT).show();
                result.setText("mca button clicked");
                result.setText(" ");
            }
        });


    }
}