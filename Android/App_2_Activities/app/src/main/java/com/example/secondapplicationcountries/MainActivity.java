package com.example.secondapplicationcountries;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.init_listeners();
    }

    private void init_listeners(){   // Устанавливаем действия для кнопки Choose
        findViewById(R.id.ImageChooseBtn).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CountrySelection.class);
            startActivityForResult(intent, RESULT_FIRST_USER);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RESULT_FIRST_USER) {
            this.init_image(data);
        }
    }

    private void init_image(Intent savedState){
        if (savedState == null) { return;}

        ImageView imageView = findViewById(R.id.resultImageView);
        imageView.setImageResource(
                this.drawable_Choose(
                        savedState.getIntExtra("ImageChosen", R.id.resultImageView)
                )
        );
    }


    private int drawable_Choose(int btn){
        switch(btn){
            case R.id.spain:
                return R.drawable.ic_es;
            case R.id.china:
                return R.drawable.ic_cn;
            case R.id.colombia:
                return R.drawable.ic_co;
            case R.id.germany:
                return R.drawable.ic_de;
            case R.id.italy:
                return R.drawable.ic_it;
            case R.id.england:
                return R.drawable.ic_sh;
            case R.id.southkorea:
                return R.drawable.ic_kr;
            case R.id.russia:
                return R.drawable.ic_ru;
            case R.id.norvegia:
                return R.drawable.ic_se;
        }
        return R.drawable.ic_launcher_foreground;
    }
}
