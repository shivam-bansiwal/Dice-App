package com.shivambansiwal.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton;
        rollbutton=(Button)findViewById(R.id.rollbutton);
        ImageView leftDice,rightDice;
        leftDice=(ImageView)findViewById(R.id.image_leftDice);
        rightDice=(ImageView)findViewById(R.id.image_rightDice);

       final int[] dicearr={R.drawable.dice1,
                            R.drawable.dice2,
                            R.drawable.dice3,
                            R.drawable.dice4,
                            R.drawable.dice5,
                            R.drawable.dice6};
        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   Log.d("Dicee","pressed");
                Random randomno=new Random();
                int number=randomno.nextInt(6);
             //   Log.d("Dicee","number is"+number);
                leftDice.setImageResource(dicearr[number]);
                number=randomno.nextInt(6);
                rightDice.setImageResource(dicearr[number]);
            }
        });
    }
}