package com.example.capstoneyecyecvalesmascardo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class first_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page2);

        Button button = findViewById(R.id.Availbtn);

        button.setOnClickListener(v -> {

            Intent intent = new Intent(this, availability_page.class);

            startActivity(intent);

        });

        Button button1 = findViewById(R.id.Inboxbtn);

        button1.setOnClickListener(v -> {

            Intent intent = new Intent(this, Inbox.class);

            startActivity(intent);

        });

        Button button2 = findViewById(R.id.Updbtn);

        button2.setOnClickListener(v -> {

            Intent intent = new Intent(this,Devs_update.class);

            startActivity(intent);

        });
    }
}