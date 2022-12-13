package com.geektech.month3hw2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FirstFragment extends Fragment {
TextView textView;
Button button;
Button button2;
Integer number;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fwbi();
        buttonsClicks();


    }
    void fwbi (){
        // Find View By Id
        number = 0;
        textView = requireActivity().findViewById(R.id.tw_1);
        button = requireActivity().findViewById(R.id.btn_1);
        button2 = requireActivity().findViewById(R.id.btn_2);
    }
void buttonsClicks(){
        button.setOnClickListener(view -> {
            number++;
            textView.setText(number.toString());
        });
    button2.setOnClickListener(view -> {
        number--;
        textView.setText(number.toString());
    });
}
}