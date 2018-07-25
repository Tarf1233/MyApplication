package com.whatever.myapplication.holders;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.whatever.myapplication.R;
import com.whatever.myapplication.adapters.PropertiesAdapter;
import com.whatever.myapplication.domain.Properties;

public class PropertiesHolder extends RecyclerView.ViewHolder {
    private Context context;
    private TextView textViewDescription;
    private TextView textViewSubDescription;
    private TextView textViewArea;
    private TextView textViewBedroom;
    private TextView textViewBatroom;

    public PropertiesHolder(View itemView, Context context) {
        super(itemView);
        this.context = context;
        textViewDescription = itemView.findViewById(R.id.description_house_properties);
        textViewSubDescription = itemView.findViewById(R.id.subdescription_house_properties);
        textViewArea = itemView.findViewById(R.id.area_properties);
        textViewBedroom = itemView.findViewById(R.id.bedroom_properties);
        textViewBatroom = itemView.findViewById(R.id.batroom_properties);
    }
    public void bind(final Properties properties, final PropertiesAdapter.PropertiesSetOnClickListener propertiesSetOnClickListener){

        textViewDescription.setText(properties.getDescription());
        textViewSubDescription.setText(properties.getSubdescription());
        textViewArea.setText(properties.getArea());
        textViewBedroom.setText(properties.getBedroom());
        textViewBatroom.setText(properties.getBatroom());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                propertiesSetOnClickListener.PropertiesSetOnClickListener(properties);
            }
        });

    }
}
