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

public class Schedule extends Fragment {


        public Schedule() {

        }


        @Override

        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

                View view = inflater.inflate(R.layout.fragment_schedule, container, false);

                ListView lista = (ListView) view.findViewById(R.id.listt);

                Context context = inflater.getContext();

                ArrayAdapter adapter = new Listadapter(getActivity(), addList());
                lista.setAdapter(adapter);

                return view;
        }

        public ArrayList<Listobj> addList(){
                ArrayList<Listobj>  oficinass = new ArrayList<Listobj>();

                Listobj e = new Listobj("01", "joao", "visity on madagascar", "4:20", "5 july");
                oficinass.add(e);

                e = new Listobj("01", "joao", "visity on madagascar", "4:20", "5 july");
                oficinass.add(e);


                e = new Listobj("01", "joao", "visity on madagascar", "4:20", "5 july");
                oficinass.add(e);

                e = new Listobj("01", "joao", "visity on madagascar", "4:20", "5 july");
                oficinass.add(e);

                e = new Listobj("01", "joao", "visity on madagascar", "4:20", "5 july");
                oficinass.add(e);

                e = new Listobj("01", "joao", "visity on madagascar", "4:20", "5 july");
                oficinass.add(e);

                e = new Listobj("01", "joao", "visity on madagascar", "4:20", "5 july");
                oficinass.add(e);

                return oficinass;

        }


}
