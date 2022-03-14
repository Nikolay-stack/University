
package com.example.it_test;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class Fragment3 extends Fragment {

    private TextView text_question;
    private LinearLayout linearLayout;
    private Spinner spinner;
    private ArrayAdapter<String> adapter;
    private List<String> list;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        linearLayout = new LinearLayout(context);
        text_question = new TextView(context);
        list = new ArrayList<>();
        adapter = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, list);
        spinner = new Spinner(context);

        linearLayout.setOrientation(LinearLayout.VERTICAL);
        text_question.setText(getResources().getText(R.string.question_3));
        text_question.setTextSize(30);
        spinner.setAdapter(adapter);
        adapter.add(getResources().getText(R.string.q3_answer_1).toString());
        adapter.add(getResources().getText(R.string.q3_answer_2).toString());
        adapter.add(getResources().getText(R.string.q3_answer_3).toString());
        adapter.notifyDataSetChanged();
        spinner.setAdapter(adapter);

        linearLayout.addView(text_question);
        linearLayout.addView(spinner);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        container.removeAllViews();
        container.addView(linearLayout);
        return inflater.inflate(R.layout.fragment_3, container, false);
    }

    public LinearLayout getLinearLayout() {
        return linearLayout;
    }

    public void setLinearLayout(LinearLayout linearLayout) {
        this.linearLayout = linearLayout;
    }

    public Spinner getSpinner() {
        return spinner;
    }

}
