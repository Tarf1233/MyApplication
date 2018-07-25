package com.whatever.myapplication.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.whatever.myapplication.R;
import com.whatever.myapplication.adapters.CustomerAdapter;
import com.whatever.myapplication.domain.Customer;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CustomerFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<Customer> customerArrayList;
    private CustomerAdapter customerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_customer, container, false);

        recyclerView = view.findViewById(R.id.list_customer);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        customerArrayList = new ArrayList<>();
        customerArrayList.add(new Customer("Gal Gadot","Petah Tikva - Israel"));
        customerArrayList.add(new Customer("Gal Gadot","Petah Tikva - Israel"));
        customerArrayList.add(new Customer("Gal Gadot","Petah Tikva - Israel"));
        customerArrayList.add(new Customer("Gal Gadot","Petah Tikva - Israel"));

        customerAdapter = new CustomerAdapter(customerArrayList, getContext(), new CustomerAdapter.CustomerSetOnClickListener() {
            @Override
            public void CustomerSetOnClickListener(Customer customer) {
                Toast.makeText(getContext(), "Clicou", Toast.LENGTH_SHORT).show();
            }
        });

        recyclerView.setAdapter(customerAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
        return view;
    }

}
