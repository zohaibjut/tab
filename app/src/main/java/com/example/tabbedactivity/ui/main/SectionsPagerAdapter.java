package com.example.tabbedactivity.ui.main;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.example.tabbedactivity.fragments.HomeFragment;
import com.example.tabbedactivity.fragments.SportFragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {
    int totalTabs;
    private final Context mContext;
    public static String[]  TabTitle= new String[]{"A","B"};

    public SectionsPagerAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        mContext = context;
        this.totalTabs = totalTabs;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFragment();

            case 1:
                return  new SportFragment();
            default:
                return  null;

        }

    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return TabTitle[position];
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return totalTabs;
    }
}