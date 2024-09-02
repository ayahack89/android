package com.example.imagelayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    TextView ctTom, ctJerry, ctShinchan;
    private int cT = 0;
    private int cJ = 0;
    private int cS = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.image);
        ctJerry = findViewById(R.id.JerryClicked);ctTom = findViewById(R.id.Tomclicked);
        ctShinchan = findViewById(R.id.ShinchanClicked);

        findViewById(R.id.s).setOnClickListener(v -> {
            img.setImageResource(R.drawable.img_shinchan);
            ctShinchan.setText(String.valueOf(++cS));
        });

        findViewById(R.id.T).setOnClickListener(v -> {
            img.setImageResource(R.drawable.img_tom);
            ctTom.setText(String.valueOf(++cT));
        });

        findViewById(R.id.J).setOnClickListener(v -> {
            img.setImageResource(R.drawable.img_jerry);
            ctJerry.setText(String.valueOf(++cJ));
        });
    }
}