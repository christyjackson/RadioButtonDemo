package com.example.radiobutton_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ConstraintLayout layout = findViewById(R.id.layout);
        RadioGroup radioGroup_colors = (RadioGroup)findViewById(R.id.radiogroup_colors);
        radioGroup_colors.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioButton_blue)
                    layout.setBackgroundColor(Color.BLUE);
                else if(checkedId == R.id.radioButton_green)
                    layout.setBackgroundColor(Color.GREEN);
                else if(checkedId == R.id.radioButton_red)
                    layout.setBackgroundColor(Color.RED);
            }
        });





    }
}
