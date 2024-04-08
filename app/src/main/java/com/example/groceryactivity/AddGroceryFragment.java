package com.example.groceryactivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.groceryactivity.Grocery;
import com.example.groceryactivity.R;
import com.example.groceryactivity.SharedViewModel;


public class AddGroceryFragment extends Fragment {
    private EditText editGroceryName;
    private EditText editGroceryNote;
    private CheckBox checkImportant;
    private Button buttonAddGrocery;

    public AddGroceryFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout and find views...
        View view = inflater.inflate(R.layout.fragment_add_grocery, container, false);
        editGroceryName = view.findViewById(R.id.editGroceryName);
        editGroceryNote = view.findViewById(R.id.editGroceryNote);
        checkImportant = view.findViewById(R.id.checkImportant);
        buttonAddGrocery = view.findViewById(R.id.buttonAddGrocery);

        buttonAddGrocery.setOnClickListener(v -> {
            String name = editGroceryName.getText().toString().trim();
            String note = editGroceryNote.getText().toString().trim();
            boolean isImportant = checkImportant.isChecked();

            Grocery newItem = new Grocery(name, note);
            if (isImportant) {
                newItem.setImportant(true);
                SharedViewModel viewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
                viewModel.addImportantItem(newItem);
            }

            // Clear the input fields or navigate away
            editGroceryName.setText("");
            editGroceryNote.setText("");
            checkImportant.setChecked(false);
        });

        return view;
    }

}