package com.example.myplanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyNotes[] myNotes = new MyNotes[]{
                new MyNotes("Proyek", "Mon,28-Jan'21", "Mengeksplor mengenai CMS dan strapi"),
                new MyNotes("PPl1", "Tue,27-Jan'21", "Mempelajari PHP"),
                new MyNotes("StatPro", "Wed,29-Jan'21", "PR Probabilitas kelompok"),
                new MyNotes("Database", "Fri,28-Jan'21", "Kerkom offline di Gacoan"),
                new MyNotes("ADKES", "Sun,4-Feb'21", "Revisi Dokumentasi Perayaan wisuda"),
                new MyNotes("Main", "Thru,9-Jan'21", "Janji pergi ke Gramedia"),
                new MyNotes("PRPL", "Mon,28-Jan'21", "Membuat DFD"),
        };

        MyNotesAdapter myNotesAdapter = new MyNotesAdapter(myNotes, MainActivity4.this);
        recyclerView.setAdapter(myNotesAdapter);
    }

    public void Back4(View view) {
        Intent intent = new Intent(MainActivity4.this,MainActivity2.class);
        startActivity(intent);
    }
}