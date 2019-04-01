package com.jigar.warehouse;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.jigar.warehouse.adapter.SchedulAdapter;

import java.util.ArrayList;

public class SchedulingActivity extends AppCompatActivity {

    RecyclerView rv_schedule;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheduling);

        ActionBar mBar = getSupportActionBar();
        if (mBar != null) {
            mBar.setTitle("Scheduling");
            mBar.setDisplayHomeAsUpEnabled(true);
        }

        rv_schedule = findViewById(R.id.rv_schedule);

        rv_schedule.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        ArrayList<String> mStrings = new ArrayList<>();
        mStrings.add("Vehicle 1");
        mStrings.add("DR 2");
        mStrings.add("Veh 6");
        SchedulAdapter mAdapter = new SchedulAdapter(mStrings, SchedulingActivity.this);
        rv_schedule.setAdapter(mAdapter);
        rv_schedule.setItemAnimator(new DefaultItemAnimator());
        
    }


}
