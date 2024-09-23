package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity2 extends AppCompatActivity {

    TextView nameView, emailView, passwordView, phoneView;
    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display2);

        nameView = findViewById(R.id.textview_name);
        emailView = findViewById(R.id.textview_email);
        passwordView = findViewById(R.id.textview_password);
        phoneView = findViewById(R.id.textview_phone);
        backBtn = findViewById(R.id.back_btn_xml);

        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        String email = intent.getStringExtra("Email");
        String password = intent.getStringExtra("Password");
        String phone = intent.getStringExtra("Phone");

        nameView.setText("Name: " + name);
        emailView.setText("Email: " + email);
        passwordView.setText("Password: " + password);
        phoneView.setText("Phone: " + phone);

        backBtn.setOnClickListener(view -> {
            Intent backIntent = new Intent(DisplayActivity2.this, com.example.intent.MainActivity.class);
            startActivity(backIntent);
            finish();
        });
    }
}
