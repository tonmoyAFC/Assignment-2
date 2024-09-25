package com.example.a2;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CheckBoxActivity extends AppCompatActivity {

    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        checkBox = findViewById(R.id.checkBox);

        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            Toast.makeText(CheckBoxActivity.this, "Checkbox is " + (isChecked ? "Checked" : "Unchecked"), Toast.LENGTH_SHORT).show();
        });
    }
}
