package com.example.siasadgame;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class EndActivity extends Activity {

    TextView end_head, end_text;
    Button exit_to_menu_button;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.end);
        //setting background image

        //init sound effects
        Helper.InitSounds(this, new String[]{"click"});
        //congratulatory text
        end_head = (TextView) findViewById(R.id.end_head);
        end_head.setText("Selamat Point Anda 90 ! ");
        end_head.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/normalfont.ttf"));
        end_text = (TextView) findViewById(R.id.end_text);
        end_text.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/normalfont.ttf"));
        end_text.setText("Semua Jawaban Anda Benar!");
        //exit to main menu
        exit_to_menu_button = (Button) findViewById(R.id.exit_to_menu_button);
        exit_to_menu_button.setText("KEMBALI");
        exit_to_menu_button.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/normalfont.ttf"));
        exit_to_menu_button.setBackgroundResource(R.drawable.btnexit);
        exit_to_menu_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Helper.playSound(getApplicationContext(), "click");
                //clear save
                SharedPreferences save = getSharedPreferences("SAVE_GAME", 0);
                save.edit().clear().commit();
                Intent menu_intent = new Intent(EndActivity.this, MenuLevel.class);
                startActivity(menu_intent);
                finish();
            }
        });
    }
}