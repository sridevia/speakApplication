package com.sridevi.speakapplication.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.sridevi.speakapplication.R;

/**
 * Created by Sridevi on 9/8/2016.
 */
public class customAdapter extends BaseAdapter{

    public Context mcontext;
    public String[] mdays;
    public  customAdapter(Context context,String[] days){

        mcontext = context;
        mdays = days;
    }

    @Override
    public int getCount() {
        return mdays.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View rowview = null;
        LayoutInflater layoutInflater = (LayoutInflater)mcontext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        rowview = layoutInflater.inflate(R.layout.viewnames,null);
        TextView textView = (TextView)rowview.findViewById(R.id.textView);
        textView.setText(mdays[i]);

        return rowview;

    }
}
