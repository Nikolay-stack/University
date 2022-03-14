package com.example.it_test;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Answers extends AppCompatActivity {

    private LinearLayout.LayoutParams lParams;
    private TextView textView_1;
    private TextView textView_2;
    private TextView textView_3;
    private TextView textView_4;
    private TextView textView_5;
    private TextView textView_q1;
    private TextView textView_q2;
    private TextView textView_q3;
    private TextView textView_q4;
    private TextView textView_q5;
    private TextView textView_q1_answ;
    private TextView textView_q2_answ;
    private TextView textView_q3_answ;
    private TextView textView_q4_answ;
    private TextView textView_q5_answ;
    private TextView textView_grade;
    int grade = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.answers);
        Intent intent = getIntent();
        lParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        textView_grade = new TextView(this);
        textView_1 = new TextView(this);
        textView_2 = new TextView(this);
        textView_3 = new TextView(this);
        textView_4 = new TextView(this);
        textView_5 = new TextView(this);
        textView_q1 = new TextView(this);
        textView_q2 = new TextView(this);
        textView_q3 = new TextView(this);
        textView_q4 = new TextView(this);
        textView_q5 = new TextView(this);
        textView_q1_answ = new TextView(this);
        textView_q2_answ = new TextView(this);
        textView_q3_answ = new TextView(this);
        textView_q4_answ = new TextView(this);
        textView_q5_answ = new TextView(this);

        String answer1 = intent.getStringExtra("answer1");
        String answer2 = String.valueOf(intent.getIntExtra("answer2", 0));
        String answer3 = intent.getStringExtra("answer3");
        String answer4 = intent.getStringExtra("answer4");
        String answer5 = intent.getStringExtra("answer5");

        if (answer1.equals("блок")) {
            grade += 2;
        }
        if (answer2.equals("5")) {
            grade += 2;
        }
        if (answer3.equals("char является примитивным типом, а Character классом.")) {
            grade += 2;
        }
        if (answer4.equals("+")) {
            grade += 2;
        }
        if (answer5.equals("Object")) {
            grade += 2;
        }
        textView_grade.setTextSize(30);
        textView_grade.setTextColor(getColor(R.color.black));
        textView_grade.setText("Ваша оценка: " + grade);
        textView_1.setTextSize(30);
        textView_2.setTextSize(30);
        textView_3.setTextSize(30);
        textView_4.setTextSize(30);
        textView_5.setTextSize(30);
        textView_1.setTextColor(getColor(R.color.black));
        textView_2.setTextColor(getColor(R.color.black));
        textView_3.setTextColor(getColor(R.color.black));
        textView_4.setTextColor(getColor(R.color.black));
        textView_5.setTextColor(getColor(R.color.black));
        textView_q1.setTextSize(24);
        textView_q2.setTextSize(24);
        textView_q3.setTextSize(24);
        textView_q4.setTextSize(24);
        textView_q5.setTextSize(24);
        textView_q1_answ.setTextSize(24);
        textView_q2_answ.setTextSize(24);
        textView_q3_answ.setTextSize(24);
        textView_q4_answ.setTextSize(24);
        textView_q5_answ.setTextSize(24);
        textView_1.setText("Вопрос 1");
        textView_q1.setText("Ваш ответ: " + answer1);
        textView_q1_answ.setText("Правильный ответ: " + getResources().getText(R.string.q1_answer_2));
        textView_2.setText("Вопрос 2");
        textView_q2.setText("Ваш ответ: " + answer2);
        textView_q2_answ.setText("Правильный ответ: " + getResources().getText(R.string.q2_answer_1));
        textView_3.setText("Вопрос 3");
        textView_q3.setText("Ваш ответ: " + answer3);
        textView_q3_answ.setText("Правильный ответ: " + getResources().getText(R.string.q3_answer_2));
        textView_4.setText("Вопрос 4");
        textView_q4.setText("Ваш ответ: " + answer4);
        textView_q4_answ.setText("Правильный ответ: " + getResources().getText(R.string.q4_answer_1));
        textView_5.setText("Вопрос 5");
        textView_q5.setText("Ваш ответ: " + answer5);
        textView_q5_answ.setText("Правильный ответ: " + getResources().getText(R.string.q5_answer_1));


        LinearLayout layout = findViewById(R.id.answers);
        layout.addView(textView_1, lParams);
        layout.addView(textView_q1, lParams);
        layout.addView(textView_q1_answ, lParams);
        layout.addView(textView_2, lParams);
        layout.addView(textView_q2, lParams);
        layout.addView(textView_q2_answ, lParams);
        layout.addView(textView_3, lParams);
        layout.addView(textView_q3, lParams);
        layout.addView(textView_q3_answ, lParams);
        layout.addView(textView_4, lParams);
        layout.addView(textView_q4, lParams);
        layout.addView(textView_q4_answ, lParams);
        layout.addView(textView_5, lParams);
        layout.addView(textView_q5, lParams);
        layout.addView(textView_q5_answ, lParams);
        layout.addView(textView_grade, lParams);
    }
}