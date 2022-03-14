package com.example.it_test;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class Question extends AppCompatActivity {

    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private Fragment3 fragment3;
    private Fragment4 fragment4;
    private Fragment5 fragment5;
    private Fragment6 fragment6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragment4 = new Fragment4();
        fragment5 = new Fragment5();
        fragment6 = new Fragment6();
    }

    public void onClickBtn1(View view) {
        fragment1 = new Fragment1();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.conteiner, fragment1);
        fragmentTransaction.commit();
    }

    public void onClickBtn2(View view) {
        fragment2 = new Fragment2();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.conteiner, fragment2);
        fragmentTransaction.commit();
    }

    public void onClickBtn3(View view) {
        fragment3 = new Fragment3();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.conteiner, fragment3);
        fragmentTransaction.commit();
    }

    public void onClickBtn4(View view) {
        fragment4 = new Fragment4();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.conteiner, fragment4);
        fragmentTransaction.commit();
    }

    public void onClickBtn5(View view) {
        fragment5 = new Fragment5();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.conteiner, fragment5);
        fragmentTransaction.commit();
    }

    public void onClickBtnSave(View view) {
        int selectedRadioButtonId = fragment1.getRadioGroup().getCheckedRadioButtonId();
        String answer1 = null;
        if (selectedRadioButtonId == 1) {
            answer1 = fragment1.getRadioButton1().getText().toString();
        } else if (selectedRadioButtonId == 2) {
            answer1 = fragment1.getRadioButton2().getText().toString();
        } else if (selectedRadioButtonId == 3) {
            answer1 = fragment1.getRadioButton3().getText().toString();
        } else {
            answer1 = "Fara raspuns";
        }
        String answer2 = String.valueOf(fragment2.getNumberPicker().getValue());
        String answer3 = fragment3.getSpinner().getSelectedItem().toString();
        String answer4 = null;
        if (fragment4.getCheckBox1().isChecked()) {
            answer4 = fragment4.getCheckBox1().getText().toString();
        } else if (fragment4.getCheckBox2().isChecked()) {
            answer4 = fragment4.getCheckBox2().getText().toString();
        } else if (fragment4.getCheckBox3().isChecked()) {
            answer4 = fragment4.getCheckBox3().getText().toString();
        } else {
            answer4 = "Fara raspuns";
        }
        String answer5 = String.valueOf(fragment5.getEditText().getText());

        fragment6 = new Fragment6(answer1, answer2, answer3, answer4, answer5);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.conteiner, fragment6);
        fragmentTransaction.commit();
    }
}