package com.example.chelianwang.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.chelianwang.R;
import com.example.chelianwang.bean.Petrol;

import java.util.List;

/**
 * Created by 12847 on 2016/5/12.
 */
public class ListGridViewAdapter extends BaseAdapter {

    private List<Petrol> list;
    private LayoutInflater mInflater;

    public ListGridViewAdapter(Context context, List<Petrol> list) {
        this.list = list;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return list.size();
    }

    @Override
    public Petrol getItem(int position) {
        // TODO Auto-generated method stub
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup arg2) {
        // TODO Auto-generated method stub
        View rowView = null;
        if (convertView == null) {
            rowView = mInflater.inflate(R.layout.item_price_gridview, null);
        } else {
            rowView = convertView;
        }
        TextView tv = (TextView) rowView.findViewById(R.id.tv);
        Petrol p = getItem(position);
        tv.setText(p.getType() + " " + p.getPrice());
        return rowView;
    }

}
