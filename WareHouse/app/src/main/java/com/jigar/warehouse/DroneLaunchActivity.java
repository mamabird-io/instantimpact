package com.jigar.warehouse;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.jigar.warehouse.adapter.DroneLaunchAdapter;
import com.jigar.warehouse.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class DroneLaunchActivity extends AppCompatActivity {

    RecyclerView rv_vehicles;
    DroneLaunchAdapter mVehicleAdapter;

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
        setContentView(R.layout.activity_drone_launch);

        ActionBar mBar = getSupportActionBar();
        if (mBar != null) {
            mBar.setTitle("Drone Launch");
            mBar.setDisplayHomeAsUpEnabled(true);
        }


        rv_vehicles = findViewById(R.id.rv_vehicles);
        rv_vehicles.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Vehicle("Name", "Location", "Time To Home"));

        mVehicleAdapter = new DroneLaunchAdapter(vehicleList);
        rv_vehicles.setAdapter(mVehicleAdapter);
        rv_vehicles.setItemAnimator(new DefaultItemAnimator());
    }
}
