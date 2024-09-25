package com.example.a2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonCheckBox;
    private Button buttonRadioButton;
    private Button buttonRatingBar;
    private Button buttonSeekBar;
    private Button buttonSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCheckBox = findViewById(R.id.button_checkbox);
        buttonRadioButton = findViewById(R.id.button_radiobutton);
        buttonRatingBar = findViewById(R.id.button_ratingbar);
        buttonSeekBar = findViewById(R.id.button_seekbar);
        buttonSwitch = findViewById(R.id.button_switch);

        // Set up click listeners for each button
        buttonCheckBox.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CheckBoxActivity.class);
            startActivity(intent);
        });

        buttonRadioButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, RadioButtonActivity.class);
            startActivity(intent);
        });

        buttonRatingBar.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, RatingBarActivity.class);
            startActivity(intent);
        });

        buttonSeekBar.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SeekBarActivity.class);
            startActivity(intent);
        });

        buttonSwitch.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SwitchActivity.class);
            startActivity(intent);
        });
    }
}
