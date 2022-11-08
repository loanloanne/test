package com.tranthikimloan.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class brfAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<brfclass> arraylist;

    public brfAdapter(Context context, int layout, List<brfclass> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewHolder holder;
        if (convertView==null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            holder=new viewHolder();
            holder.ten=(TextView) convertView.findViewById(R.id.txt_name);
            holder.danhgia=(TextView) convertView.findViewById(R.id.txt_ratingValue);
            holder.luotmua = (TextView) convertView.findViewById(R.id.txt_ratingCount);
            holder.diachi= (TextView) convertView.findViewById(R.id.txt_address);
            holder.hinhanh=(ImageView) convertView.findViewById(R.id.imv_photo);
            convertView.setTag(holder);
        }
        else {
            holder=(viewHolder) convertView.getTag();

        }
        holder.ten.setText(arraylist.get(position).name);
        holder.danhgia.setText(arraylist.get(position).ratingValue);
        holder.diachi.setText(arraylist.get(position).address);
        holder.luotmua.setText(arraylist.get(position).ratingCount);
        holder.hinhanh.setImageResource(arraylist.get(position).photo);
        return convertView;
    }
    private class viewHolder{
        TextView ten;
        TextView danhgia;
        TextView luotmua;
        TextView diachi;
        ImageView hinhanh;
    }
}
