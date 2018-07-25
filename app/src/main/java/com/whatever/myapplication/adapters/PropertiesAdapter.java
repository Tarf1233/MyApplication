package com.whatever.myapplication.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.whatever.myapplication.R;
import com.whatever.myapplication.domain.Properties;
import com.whatever.myapplication.holders.PropertiesHolder;

import java.util.List;

public class PropertiesAdapter extends RecyclerView.Adapter<PropertiesHolder> {
    private List<Properties> propertiesList;
    private Context context;
    private PropertiesSetOnClickListener propertiesSetOnClickListener;

    public PropertiesAdapter(List<Properties> propertiesList, Context context, PropertiesSetOnClickListener propertiesSetOnClickListener){
        this.propertiesList = propertiesList;
        this.context = context;
        this.propertiesSetOnClickListener = propertiesSetOnClickListener;

    }
    public interface PropertiesSetOnClickListener{
        void PropertiesSetOnClickListener(Properties properties);
    }
    @NonNull
    @Override
    public PropertiesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.item_properties,parent,false);
        return new PropertiesHolder(view, context);
    }
    @Override
    public void onBindViewHolder(@NonNull PropertiesHolder holder, int position) {
        holder.bind(propertiesList.get(position), propertiesSetOnClickListener);
    }
    @Override
    public int getItemCount() {
        return propertiesList.size();
    }
}
