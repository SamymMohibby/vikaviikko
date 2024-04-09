package com.example.groceryactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GroceryListAdapter extends RecyclerView.Adapter<GroceryViewHolder> {

    private Context context;
    private ArrayList<Grocery> groceries = new ArrayList<>();

    public GroceryListAdapter () {

    }

    public GroceryListAdapter(Context context, ArrayList<Grocery> groceries) {
        this.context = context;
        this.groceries = groceries;
    }



    @NonNull
    @Override
    public GroceryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GroceryViewHolder(LayoutInflater.from(context).inflate(R.layout.item_grocery, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull GroceryViewHolder holder, int position) {
        holder.itemName.setText(groceries.get(position).getItemName());
        holder.itemNote.setText(groceries.get(position).getItemNote());


    }

    @Override
    public int getItemCount() {
        return groceries.size();
    }
}