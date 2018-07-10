package com.whatever.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Listadapter extends ArrayAdapter<Listobj> {
    private final Context context;
    private final ArrayList<Listobj> elementos;


    public Listadapter(Context context, ArrayList<Listobj> elementos) {
        super(context, R.layout.customlist, elementos);
        this.context = context;
        this.elementos = elementos;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.customlist, parent, false);

        TextView dataa = (TextView) rowView.findViewById(R.id.dataa);
        TextView description = (TextView) rowView.findViewById(R.id.descriptionn);
        TextView hourr = (TextView) rowView.findViewById(R.id.hourr);
        TextView namee = (TextView) rowView.findViewById(R.id.namee);


        dataa.setText(elementos.get(position).getDatee());
        description.setText(elementos.get(position).getDescriptionn());
        hourr.setText(elementos.get(position).getHourr());
        namee.setText(elementos.get(position).getNamee());
        return rowView;


    }
}
