package com.whatever.myapplication.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.whatever.myapplication.R;
import com.whatever.myapplication.domain.Customer;
import com.whatever.myapplication.holders.CustomerHolder;

import java.util.List;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerHolder> {
    private List<Customer> customerList;
    private Context context;
    private CustomerSetOnClickListener customerSetOnClickListener;

    public CustomerAdapter(List<Customer> customerList, Context context, CustomerSetOnClickListener customerSetOnClickListener){
        this.customerList = customerList;
        this.context = context;
        this.customerSetOnClickListener = customerSetOnClickListener;
    }
    public interface CustomerSetOnClickListener{
        void CustomerSetOnClickListener(Customer customer);
    }
    @NonNull
    @Override
    public CustomerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.item_customer, parent, false);
        return new CustomerHolder(view, context);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomerHolder holder, int position) {
        holder.bind(customerList.get(position), customerSetOnClickListener);
    }

    @Override
    public int getItemCount() {
        return customerList.size();
    }
}
