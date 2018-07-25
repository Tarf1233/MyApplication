package com.whatever.myapplication.holders;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.whatever.myapplication.R;
import com.whatever.myapplication.adapters.CustomerAdapter;
import com.whatever.myapplication.domain.Customer;

public class CustomerHolder extends RecyclerView.ViewHolder {
    private Context context;
    private TextView textViewDescription;
    private TextView textViewSubDescription;

    public CustomerHolder(View itemView, Context context) {
        super(itemView);
        this.context = context;
        textViewDescription = itemView.findViewById(R.id.description_customer);
        textViewSubDescription = itemView.findViewById(R.id.sub_description_customer);
    }
    public void bind(final Customer customer, final CustomerAdapter.CustomerSetOnClickListener customerSetOnClickListener){

        textViewDescription.setText(customer.getDescription());
        textViewSubDescription.setText(customer.getSubdescription());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customerSetOnClickListener.CustomerSetOnClickListener(customer);
            }
        });
    }
}

