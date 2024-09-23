package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editName, editEmail, editPassword, editPhone;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editName= findViewById(R.id.edit_name);
        editEmail = findViewById(R.id.edit_email);
        editPassword = findViewById(R.id.edit_password);
        editPhone = findViewById(R.id.edit_phone);

        buttonLogin = findViewById(R.id.button_login);

        buttonLogin.setOnClickListener(view -> {
            String name = editName.getText().toString();
            String email = editEmail.getText().toString();
            String password = editPassword.getText().toString();
            String phone = editPhone.getText().toString();

            Toast.makeText(MainActivity.this, "Loading....", Toast.LENGTH_SHORT).show();

            new Handler().postDelayed(() -> {
                Intent intent = new Intent(MainActivity.this, DisplayActivity2.class);
                intent.putExtra("Name", name);
                intent.putExtra("Email", email);
                intent.putExtra("Password", password);
                intent.putExtra("Phone", phone);
                startActivity(intent);
            }, 1000); // Simulate loading delay
        });
    }
}