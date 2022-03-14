
package com.example.it_test;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Fragment4 extends Fragment {

    private TextView text_question;
    private LinearLayout linearLayout;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        linearLayout = new LinearLayout(context);
        text_question = new TextView(context);
        checkBox1 = new CheckBox(context);
        checkBox2 = new CheckBox(context);
        checkBox3 = new CheckBox(context);

        linearLayout.setOrientation(LinearLayout.VERTICAL);
        text_question.setText(getResources().getText(R.string.question_4));
        text_question.setTextSize(30);
        checkBox1.setText(getResources().getText(R.string.q4_answer_1));
        checkBox2.setText(getResources().getText(R.string.q4_answer_2));
        checkBox3.setText(getResources().getText(R.string.q4_answer_3));

        linearLayout.addView(text_question);
        linearLayout.addView(checkBox1);
        linearLayout.addView(checkBox2);
        linearLayout.addView(checkBox3);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        container.removeAllViews();
        container.addView(linearLayout);
        return inflater.inflate(R.layout.fragment_4, container, false);
    }

    public LinearLayout getLinearLayout() {
        return linearLayout;
    }
    public void setLinearLayout(LinearLayout linearLayout) {
        this.linearLayout = linearLayout;
    }
    public CheckBox getCheckBox1() {
        return checkBox1;
    }
    public CheckBox getCheckBox2() {
        return checkBox2;
    }
    public CheckBox getCheckBox3() {
        return checkBox3;
    }
}
