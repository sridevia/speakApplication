package com.sridevi.speakapplication.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.sridevi.speakapplication.R;
import com.sridevi.speakapplication.Adapters.customAdapter;
import com.sridevi.speakapplication.Models.Data;

/**
 * Created by Sridevi on 9/8/2016.
 */
public class ListNames extends Activity {
    public ListView list;
    public Data data;
    //String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listnames);
        list = (ListView)findViewById(R.id.listView);
        data = new Data();

        customAdapter adapter = new customAdapter(ListNames.this,data.getDays());
        list.setAdapter(adapter);

    }
}
