package com.example.siasadgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuAwal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_awal);
    }

    public void play(View view) {
        Intent intent = new Intent(MenuAwal.this, GameActivity.class);
        startActivity(intent);
    }

    public void about(View view) {
        Intent intent = new Intent(MenuAwal.this, AboutMenu.class);
        startActivity(intent);
    }

    public void keluar(View view) {
        moveTaskToBack(true);
    }

}