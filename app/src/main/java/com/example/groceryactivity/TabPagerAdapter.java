package com.example.groceryactivity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class TabPagerAdapter extends FragmentStateAdapter {
    public TabPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public TabPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public TabPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new MainPageFragment();
            case 1:
                return new ListGroceryFragment();
            case 2:
                return new AddGroceryFragment();
            default:
                return new MainPageFragment();

        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
