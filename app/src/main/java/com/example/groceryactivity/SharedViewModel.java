package com.example.groceryactivity;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;

public class SharedViewModel extends ViewModel {

    private final MutableLiveData<List<Grocery>> importantItems = new MutableLiveData<>(new ArrayList<>());


    public void addImportantItem(Grocery item) {
        List<Grocery> currentItems = importantItems.getValue();
        if (currentItems == null) {
            currentItems = new ArrayList<>();
        }
        currentItems.add(item); // No need to check if isImportant here, as this is checked before adding
        importantItems.setValue(currentItems);
    }


    public LiveData<List<Grocery>> getImportantItems() {
        return importantItems;
    }
}
