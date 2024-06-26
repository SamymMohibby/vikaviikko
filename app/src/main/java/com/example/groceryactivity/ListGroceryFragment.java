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
    private ListGrocery storageGrocery;
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
        adapter = new GroceryListAdapter(getActivity(), storageGrocery.getInstance().getGroceries());
        rvGroceries.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvGroceries.setAdapter(adapter);

        return view;
    }


    @Override
    public void onResume() {
        super.onResume();
        adapter.notifyDataSetChanged();

    }
}
