package com.whatever.myapplication;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       ViewPager mViewPager = (ViewPager) findViewById(R.id.contentt);
        mViewPager.setAdapter(new Adapterr(getSupportFragmentManager()));


       TabLayout mTabLayout = (TabLayout) findViewById(R.id.abas);


    }
         private class Adapterr extends FragmentStatePagerAdapter{
        private final ArrayList<Fragment>fragments;
             private final ArrayList<String>titles;




             public Adapterr(FragmentManager fm) {
                 super(fm);
                 fragments = new ArrayList<Fragment>(2);
                 fragments.add(new schedule());
                 fragments.add(new properties());
                 fragments.add(new customer());

                 titles = new ArrayList<String>(fragments.size());
                 titles.add(getString(R.string.properties));
                 titles.add(getString(R.string.schedule));
                 titles.add(getString(R.string.customer));
             }

             @Override
             public Fragment getItem(int position) {
                 return fragments.get(position);
             }

             @Override
             public int getCount() {
                 return fragments.size();
             }

             @Nullable
             @Override
             public CharSequence getPageTitle(int position) {
                 return titles.get(position);
             }
         }



}
