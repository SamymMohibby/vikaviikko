package com.example.groceryactivity;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;

public class SharedViewModel extends ViewModel {
    // MutableLiveData holding a list of Grocery objects
    private final MutableLiveData<List<Grocery>> importantItems = new MutableLiveData<>(new ArrayList<>());

    // Method to add an important item
    public void addImportantItem(Grocery item) {
        List<Grocery> currentItems = importantItems.getValue();
        if (currentItems == null) {
            currentItems = new ArrayList<>();
        }
        currentItems.add(item); // No need to check if isImportant here, as this is checked before adding
        importantItems.setValue(currentItems); // Post the value to be observed
    }

    // LiveData getter
    public LiveData<List<Grocery>> getImportantItems() {
        return importantItems;
    }
}
