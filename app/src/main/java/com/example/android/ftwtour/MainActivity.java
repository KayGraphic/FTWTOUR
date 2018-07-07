package com.example.android.ftwtour;

/*Code inspired by Github article by Niranjan Bhaskar called Google Play Style Tabs using TabLayout
* https://github.com/codepath/android_guides/wiki/Google-Play-Style-Tabs-using-TabLayout Accessed 2018_06_25*/
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);


        assert viewPager != null;
        viewPager.setAdapter(new CatagoryFragmentPagerAdapter(getSupportFragmentManager(),
                MainActivity.this));

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        assert tabLayout != null;
        tabLayout.setupWithViewPager(viewPager);
    }
}