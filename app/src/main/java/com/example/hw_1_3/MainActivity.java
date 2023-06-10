package com.example.hw_1_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etEmail;
    private EditText etTheme;
    private EditText etMassage;

    private Button btnSend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etEmail = findViewById(R.id.et_email);
        etTheme = findViewById(R.id.ed_themes);
        etMassage = findViewById(R.id.et_message);
        btnSend = findViewById(R.id.btn_send);
        btnSend.setOnClickListener(view -> {
            Intent intent = new Intent(android.content.Intent.ACTION_SEND);
            intent.setType("plain/text");
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{etEmail.getText().toString()});
            intent.putExtra(Intent.EXTRA_SUBJECT, etTheme.getText().toString());
            intent.putExtra(Intent.EXTRA_TEXT, etMassage.getText().toString());
            startActivity(intent);
        });
    }
    }
