package com.example.android.ftwtour;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        /*ViewPager and TabLayout code based on StackOverflow question asked May 29 '15 by TWilly and answered May 30 '15 Oleksii Shliama
         * https://stackoverflow.com/questions/30539772/android-tablayout-android-design*/
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        assert viewPager != null;
        viewPager.setAdapter(new MainFragmentPagerAdapter(getSupportFragmentManager(),
                MainActivity.this));

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        assert tabLayout != null;
        tabLayout.setupWithViewPager(viewPager);
    }
}
