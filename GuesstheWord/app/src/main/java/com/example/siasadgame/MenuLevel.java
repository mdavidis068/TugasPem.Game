package com.example.siasadgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_level);
    }

    public void kembalilevel(View view) {
        startActivity(new Intent(MenuLevel.this, MenuAwal.class));
        finish();
    }

    public void level1(View view) {
        Intent intent = new Intent(MenuLevel.this, GameActivity.class);
        startActivity(intent);
    }

    public void level2(View view) {
        Intent intent = new Intent(MenuLevel.this, GameActivity1.class);
        startActivity(intent);
    }

    public void level3(View view) {
        Intent intent = new Intent(MenuLevel.this, GameActivity2.class);
        startActivity(intent);
    }

}