package com.example.groceryactivity;

import java.io.Serializable;
import java.util.UUID;

public class Grocery implements Serializable {
    private String id; // Unique identifier
    private String grocery;
    private String note;
    private boolean isImportant; // Flag to mark as super important

    public Grocery(String grocery, String note) {
        this.id = UUID.randomUUID().toString(); // Generate a unique ID
        this.grocery = grocery;
        this.note = note;
        this.isImportant = false; // Default to not important
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public String getGrocery() {
        return grocery;
    }

    public String getNote() {
        return note;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setGrocery(String grocery) {
        this.grocery = grocery;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }

    // You might want to override toString() for easier debugging
    @Override
    public String toString() {
        return "Grocery{" +
                "id='" + id + '\'' +
                ", grocery='" + grocery + '\'' +
                ", note='" + note + '\'' +
                ", isImportant=" + isImportant +
                '}';
    }
}