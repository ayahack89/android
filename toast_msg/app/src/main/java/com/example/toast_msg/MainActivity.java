package com.example.toast_msg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bca,bba,mca,mba;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bca=findViewById(R.id.btn_bca);
        bba=findViewById(R.id.btn_bba);
        mca=findViewById(R.id.btn_mca);
        mba=findViewById(R.id.btn_mba);


        bca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "bca button clicked", Toast.LENGTH_LONG).show();
            }
        });

        bba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "bba button clicked", Toast.LENGTH_LONG).show();
            }
        });

        mca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "mca button clicked", Toast.LENGTH_LONG).show();
            }
        });

        mba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "mba button clicked", Toast.LENGTH_LONG).show();
            }
        });

    }
}