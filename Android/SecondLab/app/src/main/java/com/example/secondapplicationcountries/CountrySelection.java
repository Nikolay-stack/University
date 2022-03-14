package com.example.secondapplicationcountries;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class CountrySelection extends AppCompatActivity {
    Button[] buttons;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries_selection);
        this.initButtons();
        this.initListeners();
    }

    private void initButtons(){
        buttons = new Button[]{
                findViewById(R.id.spain),
                findViewById(R.id.china),
                findViewById(R.id.colombia),
                findViewById(R.id.germany),
                findViewById(R.id.italy),
                findViewById(R.id.england),
                findViewById(R.id.southkorea),
                findViewById(R.id.russia),
                findViewById(R.id.norvegia)
        };
    }

    private void initListeners(){
        for(Button btn : this.buttons){
            btn.setOnClickListener(item -> {
                this.intent = new Intent(CountrySelection.this, MainActivity.class);
                intent.putExtra("ImageChosen", btn.getId());
                setResult(RESULT_FIRST_USER, intent);
                finish();
            });
        }
    }
}