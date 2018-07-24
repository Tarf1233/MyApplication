package com.whatever.myapplication.holders;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.whatever.myapplication.R;
import com.whatever.myapplication.adapters.ScheduleAdapter;
import com.whatever.myapplication.domain.Schedule;

public class ScheduleHolder extends RecyclerView.ViewHolder{
    private Context context;
    private TextView textViewDia;
    private TextView textViewMes;
    private TextView textViewDescription;
    private TextView textViewSubdescription;
    private TextView textViewHora;


    public ScheduleHolder(View itemView, Context context) {
        super(itemView);

        this.context = context;
        textViewDia = itemView.findViewById(R.id.dia_schedule);
        textViewMes = itemView.findViewById(R.id.mes_schedule);
        textViewDescription = itemView.findViewById(R.id.description_schedule);
        textViewSubdescription = itemView.findViewById(R.id.sub_description_schedule);
        textViewHora = itemView.findViewById(R.id.hora_schedule);

    }
    public void bind(final Schedule schedule, final ScheduleAdapter.ScheduleSetOnClickListener scheduleSetOnClickListener){

        textViewDia.setText(schedule.getDia());
        textViewMes.setText(schedule.getMes());
        textViewDescription.setText(schedule.getDescription());
        textViewSubdescription.setText(schedule.getSubdescription());
        textViewHora.setText(schedule.getHora());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scheduleSetOnClickListener.ScheduleSetOnClickListener(schedule);
            }
        });
    }
}
