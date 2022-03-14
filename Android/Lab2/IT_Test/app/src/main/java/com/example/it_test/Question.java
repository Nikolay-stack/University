package com.example.it_test;

import android.content.Intent;
import android.os.Bundle;
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

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Question extends AppCompatActivity {

    private Button btn_next;
    private Button btn_save;
    private TextView text_question;
    private LinearLayout linearLayout;
    private LinearLayout linearLayout_withBtn;
    private int question_counter = 2;
    private LinearLayout.LayoutParams lParams;
    private RadioGroup radioGroup;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private Spinner spinner;
    private NumberPicker numberPicker;
    private EditText editText;
    private List<String> list;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);
        list = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, list);
        lParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        btn_save = new Button(this);
        radioGroup = new RadioGroup(this);
        radioButton1 = new RadioButton(this);
        radioButton2 = new RadioButton(this);
        radioButton3 = new RadioButton(this);
        checkBox1 = new CheckBox(this);
        checkBox2 = new CheckBox(this);
        checkBox3 = new CheckBox(this);
        spinner = new Spinner(this);
        numberPicker = new NumberPicker(this);
        editText = new EditText(this);
        text_question = findViewById(R.id.text_question);
        btn_next = findViewById(R.id.btn_next);
        linearLayout = findViewById(R.id.answers);
        linearLayout_withBtn = findViewById(R.id.with_button);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(15);
        spinner.setAdapter(adapter);
        adapter.add(getResources().getText(R.string.q3_answer_1).toString());
        adapter.add(getResources().getText(R.string.q3_answer_2).toString());
        adapter.add(getResources().getText(R.string.q3_answer_3).toString());
        adapter.notifyDataSetChanged();
        spinner.setAdapter(adapter);
        checkBox1.setText(getResources().getText(R.string.q4_answer_1));
        checkBox2.setText(getResources().getText(R.string.q4_answer_2));
        checkBox3.setText(getResources().getText(R.string.q4_answer_3));
        editText.setHint("Introdu raspuns");
        btn_save.setText("SAVE");

        //first question
        text_question.setText(getResources().getText(R.string.question_1));
        radioButton1.setText(getResources().getText(R.string.q1_answer_1));
        radioButton2.setText(getResources().getText(R.string.q1_answer_2));
        radioButton3.setText(getResources().getText(R.string.q1_answer_3));
        radioGroup.addView(radioButton1);
        radioGroup.addView(radioButton2);
        radioGroup.addView(radioButton3);
        linearLayout.addView(radioGroup, lParams);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (question_counter) {
                    case 2:
                        lParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                        linearLayout.removeAllViews();
                        text_question.setText(getResources().getText(R.string.question_2));
                        linearLayout.addView(numberPicker, lParams);
                        question_counter++;
                        break;
                    case 3:
                        linearLayout.removeAllViews();
                        text_question.setText(getResources().getText(R.string.question_3));
                        linearLayout.addView(spinner, lParams);
                        question_counter++;
                        break;
                    case 4:
                        linearLayout.removeAllViews();
                        text_question.setText(getResources().getText(R.string.question_4));
                        linearLayout.addView(checkBox1, lParams);
                        linearLayout.addView(checkBox2, lParams);
                        linearLayout.addView(checkBox3, lParams);
                        question_counter++;
                        break;
                    case 5:
                        lParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                        linearLayout.removeAllViews();
                        text_question.setText(getResources().getText(R.string.question_5));
                        linearLayout.addView(editText, lParams);
                        question_counter++;
                        break;
                    default:
                        text_question.setText("Testul  a fost terminat");
                        linearLayout.removeAllViews();
                        linearLayout_withBtn.removeAllViews();
                        linearLayout_withBtn.addView(btn_save, lParams);
                }
            }
        });

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                String answer1 = null;
                if (selectedRadioButtonId == 1) {
                    answer1 = radioButton1.getText().toString();
                } else if (selectedRadioButtonId == 2) {
                    answer1 = radioButton2.getText().toString();
                } else if (selectedRadioButtonId == 3) {
                    answer1 = radioButton3.getText().toString();
                } else {
                    answer1 = "Fara raspuns";
                }
                int answer2 = numberPicker.getValue();
                String answer3 = String.valueOf(spinner.getSelectedItem());
                String answer4 = null;
                if (checkBox1.isChecked()) {
                    answer4 = checkBox1.getText().toString();
                } else if (checkBox2.isChecked()) {
                    answer4 = checkBox2.getText().toString();
                } else if (checkBox3.isChecked()) {
                    answer4 = checkBox3.getText().toString();
                } else {
                    answer4 = "Fara raspuns";
                }
                String answer5 = String.valueOf(editText.getText());

                Intent intent = new Intent(Question.this, Answers.class);
                intent.putExtra("answer1", answer1);
                intent.putExtra("answer2", answer2);
                intent.putExtra("answer3", answer3);
                intent.putExtra("answer4", answer4);
                intent.putExtra("answer5", answer5);
                startActivity(intent);
            }
        });
    }
}