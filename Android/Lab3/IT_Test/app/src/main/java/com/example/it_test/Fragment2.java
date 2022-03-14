package com.example.it_test;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {

    private LinearLayout linearLayout;
    private TextView text_question;
    private NumberPicker numberPicker;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        linearLayout = new LinearLayout(context);
        text_question = new TextView(context);
        numberPicker = new NumberPicker(context);

        linearLayout.setOrientation(LinearLayout.VERTICAL);
        text_question.setText(getResources().getText(R.string.question_2));
        text_question.setTextSize(30);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(15);

        linearLayout.addView(text_question);
        linearLayout.addView(numberPicker);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        container.removeAllViews();
        container.addView(linearLayout);
        return inflater.inflate(R.layout.fragment_2, container, false);
    }

    public LinearLayout getLinearLayout() {
        return linearLayout;
    }
    public void setLinearLayout(LinearLayout linearLayout) {
        this.linearLayout = linearLayout;
    }
    public NumberPicker getNumberPicker() {
        return numberPicker;
    }
}