package com.whatever.myapplication.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.whatever.myapplication.R;
import com.whatever.myapplication.activitys.CustomerShowActivity;
import com.whatever.myapplication.adapters.PropertiesAdapter;
import com.whatever.myapplication.domain.Properties;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PropertiesFragment extends Fragment {
    private RecyclerView recyclerView;
    private PropertiesAdapter propertiesAdapter;
    private ArrayList<Properties> propertiesArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_properties, container, false);
        recyclerView = view.findViewById(R.id.list_properties);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);

        propertiesArrayList = new ArrayList<>();

        propertiesArrayList.add(new Properties("House 1","Show house in Miami beach", "350","5","6"));
        propertiesArrayList.add(new Properties("House 2","Show house in Miami beach", "350","5","6"));
        propertiesArrayList.add(new Properties("House 3","Show house in Miami beach", "3","5","6"));
        propertiesArrayList.add(new Properties("House 4","Show house in Miami beach", "3","5","6"));

        propertiesAdapter = new PropertiesAdapter(propertiesArrayList, getContext(), new PropertiesAdapter.PropertiesSetOnClickListener() {
            @Override
            public void PropertiesSetOnClickListener(Properties properties) {
                Intent intent = new Intent(getActivity(), CustomerShowActivity.class);
                startActivity(intent);
            }
        });

        recyclerView.setAdapter(propertiesAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
        return view;
    }

}
