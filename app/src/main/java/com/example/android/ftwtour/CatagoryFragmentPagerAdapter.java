package com.example.android.ftwtour;



import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CatagoryFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;

    private String tabTitles[] = new String[] { "Desserts", "Parks", "Dives","Coffee" };
    private Context mContext;

    public CatagoryFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public CatagoryFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new DessertsFragment();
        } else if (position == 1) {
            return new ParksFragment();
        } else if (position == 2) {
            return new CoffeeFragment();
        } else {
            return new DivesFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        if (position == 0) {
            return mContext.getResources().getString(R.string.category_desserts);
        } else if (position == 1) {
            return mContext.getResources().getString(R.string.category_parks);
        } else if (position == 2) {
            return mContext.getResources().getString(R.string.category_coffee);
        } else {
            return mContext.getResources().getString(R.string.category_dives);
        }
    }

}