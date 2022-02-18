package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText dataEditText;
    private Button messageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataEditText = findViewById(R.id.editTextData);
        messageButton = findViewById(R.id.messageButton);

        dataEditText.setText("Yankees");

        messageButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                String message;

                message = dataEditText.getText().toString();

                //Display toast message
                Toast.makeText(getApplicationContext(),message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}