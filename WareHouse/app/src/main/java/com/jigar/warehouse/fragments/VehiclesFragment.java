package com.jigar.warehouse.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jigar.warehouse.R;
import com.jigar.warehouse.adapter.VehicleAdapter;
import com.jigar.warehouse.model.Vehicle;

import java.util.ArrayList;


public class VehiclesFragment extends Fragment {

    RecyclerView rv_vehicles;
    ArrayList<Vehicle> mVehicleArrayList = new ArrayList<>();
    VehicleAdapter mVehicleAdapter;

    public VehiclesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_vehicles, container, false);

        rv_vehicles = rootView.findViewById(R.id.rv_vehicles);
        rv_vehicles.setLayoutManager(new LinearLayoutManager(getActivity()));

        dummyData();

        mVehicleAdapter = new VehicleAdapter(mVehicleArrayList);
        rv_vehicles.setAdapter(mVehicleAdapter);
        rv_vehicles.setItemAnimator(new DefaultItemAnimator());

        return rootView;
    }

    public void dummyData() {
        mVehicleArrayList.clear();
        mVehicleArrayList.add(new Vehicle("Name", "Location", "Time To Home"));
        mVehicleArrayList.add(new Vehicle("Drone 1", "Health Center 2", "2H"));
        mVehicleArrayList.add(new Vehicle("Drone 2", "Center 9", "1H"));
        mVehicleArrayList.add(new Vehicle("Drone 2", "Center 5", "1H"));
        mVehicleArrayList.add(new Vehicle("Drone 2", "Center 2", "1H"));
    }

}
