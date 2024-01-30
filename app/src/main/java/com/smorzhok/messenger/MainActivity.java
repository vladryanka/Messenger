package com.smorzhok.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        Button button = findViewById(R.id.Send);
        TextView textView = findViewById(R.id.textViewMessage);
        EditText editText = findViewById(R.id.editTextMessage);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = editText.getText().toString();
                 launchNextScreen(message);
            }
        });
    }
    private void launchNextScreen(String message){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", message);
        startActivity(intent);
    }
}