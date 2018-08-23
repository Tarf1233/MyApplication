package com.whatever.myapplication.fragments;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.whatever.myapplication.R;
import com.whatever.myapplication.activitys.MainActivity;
import com.whatever.myapplication.fragments.CustomerFragment;
import com.whatever.myapplication.fragments.PropertiesFragment;

import com.whatever.myapplication.fragments.ScheduleFragment;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private SectionsPagerAdapter sectionsPagerAdapter;
    private TabLayout mTabLayout;
    private int[] icons = {
            R.drawable.home,
            R.drawable.search,
            R.drawable.add,
            R.drawable.user
    };
    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = layoutInflater.inflate(R.layout.fragment_main, viewGroup, false);

        sectionsPagerAdapter = new SectionsPagerAdapter(getFragmentManager());
        sectionsPagerAdapter.addFragment(new HomeFragment(), "");
        /*sectionsPagerAdapter.addFragment(new CustomerFragment(), "");
        sectionsPagerAdapter.addFragment(new PropertiesFragment(), "");
        sectionsPagerAdapter.addFragment(new ScheduleFragment(), "");*/

        ViewPager mViewPager = view.findViewById(R.id.content_main_vp);
        mViewPager.setAdapter(sectionsPagerAdapter);

        mTabLayout = view.findViewById(R.id.abas_menu);
        mTabLayout.setupWithViewPager(mViewPager);
        //setIconsTab();

        return view;
    }
    private void setIconsTab(){
        for(int i = 0; i < 4; i++)
            mTabLayout.getTabAt(i).setIcon(icons[i]);
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

