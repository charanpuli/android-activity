package com.example.charanpuli.practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SeekBar sb;
    TextView t1,t2;
    RatingBar rb;
    Button b;int x;float y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);

        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        sb=(SeekBar)findViewById(R.id.seekBar);
        rb=(RatingBar)findViewById(R.id.ratingBar);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                t1.setTextSize(progress);
                t2.setText(Integer.toString(progress));
                x=progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
              y=rating;
            }
        });
       b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { sb=(SeekBar)findViewById(R.id.seekBar);
                Intent i=new Intent(MainActivity.this,activity2.class);
                i.putExtra("rb",y);
                i.putExtra("sb",x);
                startActivity(i);

            }
        });



    }
}
