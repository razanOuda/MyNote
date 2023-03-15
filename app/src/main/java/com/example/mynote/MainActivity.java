package com.example.mynote;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton addNoteBtn;
    RecyclerView recyclerView;
    ImageButton menuBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addNoteBtn =findViewById(R.id.add_note_btn);
        recyclerView = findViewById(R.id.recycler_View);
        menuBtn = findViewById(R.id.menu_btn);

        addNoteBtn.setOnClickListener((v)-> startActivity(new Intent(MainActivity.this,NoteDetailsActivity.class)));
        menuBtn.setOnClickListener((v)->showMenu());
        setupRecyclerView();
    }

    void showMenu(){

    }

    void setupRecyclerView(){

    }
}