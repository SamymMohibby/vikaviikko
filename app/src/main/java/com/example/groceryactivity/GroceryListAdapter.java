package com.example.groceryactivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class GroceryListAdapter extends RecyclerView.Adapter<GroceryViewHolder> {
    private List<Grocery> groceryList = new ArrayList<>();

    public GroceryListAdapter(FragmentActivity activity, ArrayList<Grocery> groceries) {
        groceryList = ListGrocery.getInstance().getGroceries();
    }

    @Override
    public GroceryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grocery, parent, false);
        return new GroceryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GroceryViewHolder holder, int position) {
        Grocery grocery = groceryList.get(position);
        holder.textGroceryName.setText(grocery.getGrocery());
        holder.textGroceryNote.setText(grocery.getNote());
    }

    @Override
    public int getItemCount() {
        return groceryList.size();
    }


}