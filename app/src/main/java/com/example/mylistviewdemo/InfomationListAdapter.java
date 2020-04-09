package com.example.mylistviewdemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class InfomationListAdapter extends BaseAdapter {

    private Context mcontext;
    private List<Information> mInformationList;

    public InfomationListAdapter(Context mcontext, List<Information> mInformationList) {
        this.mcontext = mcontext;
        this.mInformationList = mInformationList;
    }

    @Override
    public int getCount() {
        return mInformationList.size();
    }

    @Override
    public Object getItem(int position) {
        return mInformationList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=View.inflate(mcontext,R.layout.infomation_list,null);
        TextView tname=(TextView)view.findViewById(R.id.textName);
        TextView temail=(TextView)view.findViewById(R.id.textEmail);
        TextView taddress=(TextView)view.findViewById(R.id.textAddress);

        tname.setText(mInformationList.get(position).getName());
        temail.setText(mInformationList.get(position).getEmail());
        taddress.setText(mInformationList.get(position).getAddress());

        return view;
    }
}
