
package com.example.it_test;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class Fragment5 extends Fragment {

    private TextView text_question;
    private LinearLayout linearLayout;
    private EditText editText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        linearLayout = new LinearLayout(context);
        text_question = new TextView(context);
        editText = new EditText(context);

        linearLayout.setOrientation(LinearLayout.VERTICAL);
        text_question.setText(getResources().getText(R.string.question_5));
        text_question.setTextSize(30);
        editText.setHint("Introdu raspuns");

        linearLayout.addView(text_question);
        linearLayout.addView(editText);
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
    public EditText getEditText() {
        return editText;
    }
}
