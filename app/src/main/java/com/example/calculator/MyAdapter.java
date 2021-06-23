package com.example.calculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    Context context;
    private ArrayList<enity> enities;

    public MyAdapter(Context context, ArrayList<enity> enities) {
        this.context = context;
        this.enities = enities;
    }
    @Override
    public int getCount() {
        return enities.size();
    }

    @Override
    public Object getItem(int position) {
        return enities.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.lay, null);
        TextView view = convertView.findViewById(R.id.tv);
        view.setText(enities.get(position).getContent());
        return convertView;
    }
}
