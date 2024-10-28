package com.example.greetingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textViewGreeting = findViewById(R.id.textViewGreeting);
        EditText editTextName = findViewById(R.id.editTextName);
        Button buttonSubmit = findViewById(R.id.buttonSubmit);

        String greeting = getIntent().getStringExtra("greeting");
        textViewGreeting.setText(greeting);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                Intent resultIntent = new Intent();
                resultIntent.putExtra("name", name);
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
    }
}
