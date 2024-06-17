package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.name);
        passwordEditText = findViewById(R.id.password);
    }

    public void sendMessage(View view) {
        String name = nameEditText.getText().toString();
        String password = passwordEditText.getText().toString();S

        if ("admin".equals(name) && "123".equals(password)) {
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Неверное имя пользователя или пароль", Toast.LENGTH_SHORT).show();
        }
    }
}