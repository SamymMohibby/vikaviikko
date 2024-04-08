package com.example.groceryactivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.groceryactivity.GroceryListAdapter;
import com.example.groceryactivity.R;


public class ListGroceryFragment extends Fragment {
    private RecyclerView rvGroceries;
    private GroceryListAdapter adapter;
    public ListGroceryFragment() {
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
        View view = inflater.inflate(R.layout.fragment_list_grocery, container, false);
        rvGroceries = view.findViewById(R.id.rvGroceries);
        adapter = new GroceryListAdapter(); // Use the adapter field
        rvGroceries.setLayoutManager(new LinearLayoutManager(getContext()));
        rvGroceries.setAdapter(adapter); // Set it once
        return view;
    }
    }
