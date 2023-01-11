package com.example.myapplication;

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

    public void medInfo(View view) {
        Intent med = new Intent(this, MedInfoActivity.class);
        startActivity(med);
    }

    public void petNote(View view) {
        Intent pet = new Intent(this, CatalogActivity.class);
        startActivity(pet);
    }
}