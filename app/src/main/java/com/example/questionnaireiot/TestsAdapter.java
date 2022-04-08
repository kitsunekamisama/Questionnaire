package com.example.questionnaireiot;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class TestsAdapter extends BaseAdapter {

    private int numOfTests;

    public TestsAdapter(int numOfTests) {
        this.numOfTests = numOfTests;
    }

    @Override
    public int getCount() {
        return numOfTests;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        View view;
        if(convertView == null){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.test_item_layout, parent, false);
        }
        else {
            view = convertView;
        }
        ((TextView) view.findViewById(R.id.testNo_tv)).setText(String.valueOf(i+1));
        return view;
    }
}
