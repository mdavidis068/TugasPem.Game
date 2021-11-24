package com.example.siasadgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AboutMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
    }

    public void kembaliabout(View view) {
        startActivity(new Intent(AboutMenu.this, MenuAwal.class));
        finish();
    }
}