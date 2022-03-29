package com.example.usingpreferences;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickLoad(View view) {
        Intent i = new Intent(MainActivity.this, AppPreferenceActivity.class);
        startActivity(i);
    }

    public void onClickDisplay(View view) {

    }

    public void onClickModify(View view) {

    }
}