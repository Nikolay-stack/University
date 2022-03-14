package com.example.semafore;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.semafore.R;

public class MainActivity extends AppCompatActivity {

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find Main_View by id
        this.view = findViewById(R.id.Main_View);

        // Initialize button listeners on click
        this.init_click_listeners();
    }

    public void init_click_listeners(){


        findViewById(R.id.Red_Button).setOnClickListener(
                view -> this.view.setBackgroundColor(Color.RED)
        );

        findViewById(R.id.Yellow_Button).setOnClickListener(
                view -> this.view.setBackgroundColor(Color.YELLOW)
        );

        findViewById(R.id.Green_Button).setOnClickListener(
                view -> this.view.setBackgroundColor(Color.GREEN)
        );

        findViewById(R.id.Clear_Background_Color_Button).setOnClickListener(
                view -> this.view.setBackgroundColor(Color.WHITE)
        );
    }
}