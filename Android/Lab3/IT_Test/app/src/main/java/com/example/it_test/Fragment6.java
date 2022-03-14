
package com.example.it_test;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class Fragment6 extends Fragment {

    private LinearLayout linearLayout;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String answer5;
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

    public Fragment6() {
    }

    public Fragment6(String answer1, String answer2, String answer3, String answer4, String answer5) {
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        linearLayout = new LinearLayout(context);
        textView_grade = new TextView(context);
        textView_1 = new TextView(context);
        textView_2 = new TextView(context);
        textView_3 = new TextView(context);
        textView_4 = new TextView(context);
        textView_5 = new TextView(context);
        textView_q1 = new TextView(context);
        textView_q2 = new TextView(context);
        textView_q3 = new TextView(context);
        textView_q4 = new TextView(context);
        textView_q5 = new TextView(context);
        textView_q1_answ = new TextView(context);
        textView_q2_answ = new TextView(context);
        textView_q3_answ = new TextView(context);
        textView_q4_answ = new TextView(context);
        textView_q5_answ = new TextView(context);

        linearLayout.setOrientation(LinearLayout.VERTICAL);
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
        textView_grade.setTextColor(getResources().getColor(R.color.black));
        textView_grade.setText("Ваша оценка: " + grade);
        textView_1.setTextSize(30);
        textView_2.setTextSize(30);
        textView_3.setTextSize(30);
        textView_4.setTextSize(30);
        textView_5.setTextSize(30);
        textView_1.setTextColor(getResources().getColor(R.color.black));
        textView_2.setTextColor(getResources().getColor(R.color.black));
        textView_3.setTextColor(getResources().getColor(R.color.black));
        textView_4.setTextColor(getResources().getColor(R.color.black));
        textView_5.setTextColor(getResources().getColor(R.color.black));
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

        linearLayout.addView(textView_1);
        linearLayout.addView(textView_q1);
        linearLayout.addView(textView_q1_answ);
        linearLayout.addView(textView_2);
        linearLayout.addView(textView_q2);
        linearLayout.addView(textView_q2_answ);
        linearLayout.addView(textView_3);
        linearLayout.addView(textView_q3);
        linearLayout.addView(textView_q3_answ);
        linearLayout.addView(textView_4);
        linearLayout.addView(textView_q4);
        linearLayout.addView(textView_q4_answ);
        linearLayout.addView(textView_5);
        linearLayout.addView(textView_q5);
        linearLayout.addView(textView_q5_answ);
        linearLayout.addView(textView_grade);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        container.removeAllViews();
        container.addView(linearLayout);
        return inflater.inflate(R.layout.fragment_5, container, false);
    }

    public LinearLayout getLinearLayout() {
        return linearLayout;
    }
    public void setLinearLayout(LinearLayout linearLayout) {
        this.linearLayout = linearLayout;
    }
}
