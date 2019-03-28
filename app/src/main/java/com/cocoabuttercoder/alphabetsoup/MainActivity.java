package com.cocoabuttercoder.alphabetsoup;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        RelativeLayout relativeLayout = findViewById(R.id.relativeLayout);

        for(int i = 0; i < 25; i++){
            Random letterRNG = new Random();
            Random rotationRNG = new Random();
            Random xRNG = new Random();
            Random yRNG = new Random();
            int letterAsInt = letterRNG.nextInt(26);
            float rotation = rotationRNG.nextFloat() * 360;
            float xCoordinate = xRNG.nextFloat() * relativeLayout.getWidth();
            float yCoordinate = yRNG.nextFloat() * relativeLayout.getHeight();
            String letter = String.valueOf((char)(65 + letterAsInt));
            TextView character = new TextView(this);

            character.setText(letter);
            character.setRotation(rotation);
            character.setX(xCoordinate);
            character.setTextColor(Color.rgb(255, 193, 7));
            character.setY(yCoordinate);
            character.setTextSize(TypedValue.COMPLEX_UNIT_SP, 34);

            relativeLayout.addView(character);
        }
    }
}
