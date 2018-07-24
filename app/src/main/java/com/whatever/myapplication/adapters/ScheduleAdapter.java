package com.whatever.myapplication.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.whatever.myapplication.R;
import com.whatever.myapplication.domain.Schedule;
import com.whatever.myapplication.holders.ScheduleHolder;

import java.util.List;

public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleHolder> {
    private List<Schedule> scheduleList;
    private Context context;
    private ScheduleSetOnClickListener scheduleSetOnClickListener;

    public ScheduleAdapter(List<Schedule> scheduleList, Context context, ScheduleSetOnClickListener scheduleSetOnClickListener){
        this.context = context;
        this.scheduleList = scheduleList;
        this.scheduleSetOnClickListener = scheduleSetOnClickListener;
    }

    public interface ScheduleSetOnClickListener{
        void ScheduleSetOnClickListener(Schedule schedule);
    }
    @NonNull
    @Override
    public ScheduleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.item_schedule, parent, false);
        return new ScheduleHolder(view, context);
    }

    @Override
    public void onBindViewHolder(@NonNull ScheduleHolder holder, int position) {
        holder.bind(scheduleList.get(position), scheduleSetOnClickListener);
    }

    @Override
    public int getItemCount() {
        return scheduleList.size();
    }
}
