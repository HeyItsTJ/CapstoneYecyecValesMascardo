package com.example.capstoneyecyecvalesmascardo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.Startbtn);

        button.setOnClickListener(v -> {

            Intent intent = new Intent(this, first_page.class);

            startActivity(intent);

        });

        Button button1 = findViewById(R.id.Devbtn);

        button1.setOnClickListener(v -> {

            Intent intent = new Intent(this, developers_info.class);

            startActivity(intent);

        });


    }

}