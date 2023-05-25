package com.nilscreation.mytestapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerMessengerAdapter extends FragmentPagerAdapter {

    public ViewPagerMessengerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Fragment1();
        } else {
            return new Fragment2();
        }
    }

    @Override
    public int getCount() {
        return 2; //no. of tabs
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Fragment1";
        } else {
            return "Fragment2";
        }
    }
}
