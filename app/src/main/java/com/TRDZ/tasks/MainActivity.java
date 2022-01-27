package com.TRDZ.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button allow = findViewById(R.id.B_allow);
        CheckBox calendar = findViewById(R.id.S_dating);

        allow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (calendar.isChecked()) startActivity( new Intent(MainActivity.this, Data_Activity.class));
                else startActivity( new Intent(MainActivity.this, Info_Activity.class));
                }
            });
        }
    }