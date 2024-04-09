package com.example.groceryactivity;

        import android.view.View;
        import android.widget.TextView;

        import androidx.recyclerview.widget.RecyclerView;

public class GroceryViewHolder extends RecyclerView.ViewHolder {
    public TextView itemNote, itemName;

    public GroceryViewHolder(View itemView) {
        super(itemView);
        itemName = itemView.findViewById(R.id.textGroceryName);
        itemNote = itemView.findViewById(R.id.textGroceryNote);
    }
}
