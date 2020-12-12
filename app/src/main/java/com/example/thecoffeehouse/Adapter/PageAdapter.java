package com.example.thecoffeehouse.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PageAdapter extends FragmentStatePagerAdapter {
    List<Fragment> fragments;
    private int  numTab;
    public PageAdapter(@NonNull FragmentManager fm, int numTab) {
        super(fm);
        this.numTab = numTab;
        this.fragments = new ArrayList<>();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }

    @Override
    public int getCount() {
        return numTab;
    }
    public void addFragment(Fragment fragment){
        fragments.add(fragment);
    }
}