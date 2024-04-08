package com.example.groceryactivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.groceryactivity.Grocery;
import com.example.groceryactivity.R;
import com.example.groceryactivity.SharedViewModel;


public class BottomFragment extends Fragment {
    private TextView textImportant;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);
        TextView textImportant = view.findViewById(R.id.textImportant);

        SharedViewModel viewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
        viewModel.getImportantItems().observe(getViewLifecycleOwner(), items -> {
            StringBuilder importantItemsBuilder = new StringBuilder();
            for (Grocery item : items) {
                if (item.isImportant()) {
                    importantItemsBuilder.append(item.getGrocery()).append(", ");
                }
            }

            // Remove the last comma and space if there are items
            if (importantItemsBuilder.length() > 0) {
                importantItemsBuilder.setLength(importantItemsBuilder.length() - 2);
            }

            textImportant.setText(importantItemsBuilder.toString());
        });

        return view;
    }}