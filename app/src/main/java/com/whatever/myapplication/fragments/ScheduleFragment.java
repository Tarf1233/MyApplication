package com.whatever.myapplication.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.whatever.myapplication.Listadapter;
import com.whatever.myapplication.Listobj;
import com.whatever.myapplication.R;
import com.whatever.myapplication.adapters.ScheduleAdapter;
import com.whatever.myapplication.domain.Schedule;

import java.util.ArrayList;

public class ScheduleFragment extends Fragment {
    private ArrayList<Schedule> scheduleArrayList;
    private RecyclerView recyclerView;
    private ScheduleAdapter scheduleAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_schedule, container, false);

        recyclerView = view.findViewById(R.id.list_schedule);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        Schedule schedule = new Schedule("05"," July","Meeting with Sir. John","Show houser in miami beach", "10:00 AM");
        Schedule schedule2 = new Schedule("08", "July","Meeting with Sir. John","Show houser in miami beach", "10:00 AM");
        Schedule schedule3 = new Schedule("09","July","Meeting with Sir. John","Show houser in miami beach", "10:00 AM");
        Schedule schedule4 = new Schedule("20","Agos","Meeting with Sir. John","Show houser in miami beach", "10:00 AM");
        Schedule schedule5 = new Schedule("13","Deze","Meeting with Sir. John","Show houser in miami beach", "10:00 AM");

        scheduleArrayList = new ArrayList<>();
        scheduleArrayList.add(schedule);
        scheduleArrayList.add(schedule2);
        scheduleArrayList.add(schedule3);
        scheduleArrayList.add(schedule4);
        scheduleArrayList.add(schedule5);

        scheduleAdapter = new ScheduleAdapter(scheduleArrayList, getContext(), new ScheduleAdapter.ScheduleSetOnClickListener() {
            @Override
            public void ScheduleSetOnClickListener(Schedule schedule) {
                Toast.makeText(getContext(),"Clicou,", Toast.LENGTH_SHORT).show();
            }
        });

        recyclerView.setAdapter(scheduleAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

        return view;
    }
}
