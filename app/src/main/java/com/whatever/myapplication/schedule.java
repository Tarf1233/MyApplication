package com.whatever.myapplication;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class schedule extends Fragment {


    public schedule() {

    }


    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_schedule, container, false);

       String[] itens = {"1", "2"};

       ListView list = (ListView) view.findViewById(R.id.listt);


       ArrayAdapter<String> ListViewAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, itens);

      list.setAdapter(ListViewAdapter);

        return view;
    }









}

