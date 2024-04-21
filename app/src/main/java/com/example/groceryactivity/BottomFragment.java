package com.example.groceryactivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;



public class BottomFragment extends Fragment {
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
                    importantItemsBuilder.append(item.getItemName()).append(", ");
                }
            }

            if (importantItemsBuilder.length() > 0) {
                importantItemsBuilder.setLength(importantItemsBuilder.length() - 2);
            }

            textImportant.setText(importantItemsBuilder.toString());
        });

        return view;
    }
}