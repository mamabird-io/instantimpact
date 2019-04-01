package com.jigar.warehouse.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jigar.warehouse.R;
import com.jigar.warehouse.model.Vehicle;

import java.util.List;

public class VehicleAdapter extends RecyclerView.Adapter<VehicleAdapter.VehicleViewHolder> {

    private List<Vehicle> vehicleList;

    public VehicleAdapter(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    @NonNull
    @Override
    public VehicleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.vehicle_list_row, viewGroup, false);

        return new VehicleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull VehicleViewHolder viewHolder, int i) {
        Vehicle mVehicle = vehicleList.get(i);
        viewHolder.tv_name.setText(mVehicle.getName());
        viewHolder.tv_location.setText(mVehicle.getLocation());
        viewHolder.tv_time_home.setText(mVehicle.getTime_to_home());
    }

    @Override
    public int getItemCount() {
        return vehicleList.size();
    }

    public class VehicleViewHolder extends RecyclerView.ViewHolder {
        LinearLayout ll_vehicle;
        TextView tv_name, tv_location, tv_time_home;

        public VehicleViewHolder(View view) {
            super(view);
            ll_vehicle = view.findViewById(R.id.ll_vehicle);
            tv_name = view.findViewById(R.id.tv_name);
            tv_location = view.findViewById(R.id.tv_location);
            tv_time_home = view.findViewById(R.id.tv_time_home);

        }
    }
}
