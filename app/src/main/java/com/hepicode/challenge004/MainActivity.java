package com.hepicode.challenge004;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        seekBar = findViewById(R.id.seekBar);


        seekBar.setMax(100);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if (i >= 40 && i <= 45){

                    textView.setText("Progress is " + i);
                } else {

                    textView.setText("");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    /*
    1. On app launch, Activity A page will appear on the screen with SeekBar and a TextView Widget
    2. When the SeekBar progress indictor is between 40 and 45 display a text on the TextView
    3. Hide the displayed text when the progress indictor of the SeekBar is outside this range.
     */
}
