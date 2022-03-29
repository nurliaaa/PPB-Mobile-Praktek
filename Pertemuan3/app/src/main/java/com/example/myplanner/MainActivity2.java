package com.example.myplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void Back(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);
    }

    public void Mulai(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(intent);
    }

    public void Notes(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity4.class);
        startActivity(intent);
    }

    public void calender(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity5.class);
        startActivity(intent);
    }

    public void schedule(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity6.class);
        startActivity(intent);
    }
}