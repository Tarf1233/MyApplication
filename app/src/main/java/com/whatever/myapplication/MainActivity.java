package com.whatever.myapplication;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private SectionsPagerAdapter sectionsPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        sectionsPagerAdapter.addFragment(new Schedule(), "Schedule");
        sectionsPagerAdapter.addFragment(new Properties(), "Propeties");
        sectionsPagerAdapter.addFragment(new Customer(), "Customer");

        ViewPager mViewPager = (ViewPager) findViewById(R.id.contentt);
        mViewPager.setAdapter(sectionsPagerAdapter);


        TabLayout mTabLayout = (TabLayout) findViewById(R.id.abas);
        mTabLayout.setupWithViewPager(mViewPager);

    }
    private class SectionsPagerAdapter extends FragmentPagerAdapter {
        private final ArrayList<Fragment> fragmentList = new ArrayList<>();
        private final ArrayList<String> titleList = new ArrayList<>();

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
            /*fragments = new ArrayList<Fragment>(3);
            fragments.add(new schedule());
            fragments.add(new properties());
            fragments.add(new customer());

            titles = new ArrayList<String>(fragments.size());
            titles.add(getString(R.string.properties));
            titles.add(getString(R.string.schedule));
            titles.add(getString(R.string.customer));*/
        }
        void addFragment(Fragment fragment, String title){
            fragmentList.add(fragment);
            titleList.add(title);

        }
        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return titleList.get(position);
        }
    }



}

