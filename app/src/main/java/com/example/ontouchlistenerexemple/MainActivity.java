package com.example.ontouchlistenerexemple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView i;
    int[] images= {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4};
    int pos = 0;
    float dx, dy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i = findViewById(R.id.img);

        i.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        dx = motionEvent.getX() - i.getX();
                        dy = motionEvent.getY() - i.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        i.setX(motionEvent.getX()-dx);
                        i.setY(motionEvent.getY()-dy);
                }
                return true;
            }
        });
    }
}