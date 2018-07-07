package com.example.android.ftwtour;
//ViewPager with FragmentPager Adapter code informed by https://guides.codepath.com/android/viewpager-with-fragmentpageradapter Accessed 2018_06_30
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CatagoryFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    CatagoryFragmentPagerAdapter(FragmentManager fm, Context context) {
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
        return 4;
    }
    @Override
    public CharSequence getPageTitle(int position) {
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