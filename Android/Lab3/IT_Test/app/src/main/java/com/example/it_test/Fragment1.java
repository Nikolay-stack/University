package com.example.it_test;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {

    private LinearLayout linearLayout;
    private TextView text_question;
    private RadioGroup radioGroup;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        linearLayout = new LinearLayout(context);
        text_question = new TextView(context);
        radioGroup = new RadioGroup(context);
        radioButton1 = new RadioButton(context);
        radioButton2 = new RadioButton(context);
        radioButton3 = new RadioButton(context);

        linearLayout.setOrientation(LinearLayout.VERTICAL);
        text_question.setTextSize(30);
        text_question.setText(getResources().getText(R.string.question_1));
        radioButton1.setText(getResources().getText(R.string.q1_answer_1));
        radioButton2.setText(getResources().getText(R.string.q1_answer_2));
        radioButton3.setText(getResources().getText(R.string.q1_answer_3));
        radioGroup.addView(radioButton1);
        radioGroup.addView(radioButton2);
        radioGroup.addView(radioButton3);

        linearLayout.addView(text_question);
        linearLayout.addView(radioGroup);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        container.removeAllViews();
        container.addView(linearLayout);
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    public LinearLayout getLinearLayout() {
        return linearLayout;
    }

    public void setLinearLayout(LinearLayout linearLayout) {
        this.linearLayout = linearLayout;
    }

    public RadioGroup getRadioGroup() {
        return radioGroup;
    }

    public RadioButton getRadioButton1() {
        return radioButton1;
    }

    public RadioButton getRadioButton2() {
        return radioButton2;
    }

    public RadioButton getRadioButton3() {
        return radioButton3;
    }
}