package com.example.groceryactivity;

import java.util.ArrayList;
import java.util.List;

import android.widget.EditText;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListGrocery {

    private ArrayList<Grocery> groceries = new ArrayList<>();
    private static ListGrocery listGrocery = null;

    private ListGrocery() {

    }

    public static ListGrocery getInstance() {
        if (listGrocery == null) {
            listGrocery = new ListGrocery();

        }
        return listGrocery;
    }

    public void addGrocery(Grocery grocery) {
        groceries.add(grocery);
    }

    public ArrayList<Grocery> getGroceries() {
        return groceries;
    }
}



