package com.example.hw_2_3;

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

    private TextView resTv;

    private Button minusBtn, plusBtn;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findId();
        onClick();
    }

    private void findId() {
        resTv = requireActivity().findViewById(R.id.res_tv);
        minusBtn = requireActivity().findViewById(R.id.minus_btn);
        plusBtn = requireActivity().findViewById(R.id.plus_btn);
    }

    private void onClick(){
        plusBtn.setOnClickListener(v -> {
            operationPlus();
        });
        minusBtn.setOnClickListener(v -> {
            operationMinus();
        });
    }

    private void operationPlus() {
        int currentValue = Integer.parseInt(resTv.getText().toString());
        if (currentValue < 10){
            currentValue++;
            resTv.setText(String.valueOf(currentValue));
        }
    }

    private void operationMinus(){
        int currentValue = Integer.parseInt(resTv.getText().toString());
        if (currentValue > 0){
            currentValue--;
            resTv.setText(String.valueOf(currentValue));
        }
    }
}