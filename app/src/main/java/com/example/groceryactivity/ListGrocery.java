package com.example.groceryactivity;

import java.util.ArrayList;
import java.util.List;

public class ListGrocery {

    private static ListGrocery instance = null;
    private final List<Grocery> groceryList;

    // Private constructor to prevent instantiation
    private ListGrocery() {
        groceryList = new ArrayList<>();
    }

    // Public method to get the single instance of the class
    public static ListGrocery getInstance() {
        if (instance == null) {
            instance = new ListGrocery();
        }
        return instance;
    }

    // Adds a new Grocery item to the list
    public void addGrocery(Grocery grocery) {
        groceryList.add(grocery);
    }

    // Removes a Grocery item from the list
    public void removeGrocery(Grocery grocery) {
        groceryList.remove(grocery);
    }

    // Gets the list of Grocery items
    public List<Grocery> getGroceries() {
        return groceryList;
    }


    // Existing code...

    // Method to find a Grocery item by its ID
    public Grocery findGroceryById(String id) {
        for (Grocery grocery : groceryList) {
            if (grocery.getId().equals(id)) {
                return grocery;
            }
        }
        return null; // Return null if the Grocery item isn't found
    }


}



