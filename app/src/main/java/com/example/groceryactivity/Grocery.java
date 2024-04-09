package com.example.groceryactivity;

import java.io.Serializable;
import java.util.UUID;

public class Grocery implements Serializable {
    private String id; // Unique identifier
    private String itemName;
    private String itemNote;
    private boolean isImportant; // Flag to mark as super important

    public Grocery(String grocery, String note) {
        this.id = UUID.randomUUID().toString(); // Generate a unique ID
        this.itemName = grocery;
        this.itemNote = note;
        this.isImportant = false; // Default to not important
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemNote() {
        return itemNote;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemNote(String itemNote) {
        this.itemNote = itemNote;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }

    // You might want to override toString() for easier debugging
    @Override
    public String toString() {
        return "Grocery{" +
                "id='" + id + '\'' +
                ", grocery='" + itemName + '\'' +
                ", note='" + itemNote + '\'' +
                ", isImportant=" + isImportant +
                '}';
    }
}