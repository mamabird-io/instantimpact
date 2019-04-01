package com.jigar.warehouse.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jigar.warehouse.R;
import com.jigar.warehouse.model.Vehicle;

import java.util.List;
import java.util.Locale;

public class DroneLaunchAdapter extends RecyclerView.Adapter<DroneLaunchAdapter.DroneLaunchViewHolder> {

    private List<Vehicle> vehicleList;

    public DroneLaunchAdapter(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    @NonNull
    @Override
    public DroneLaunchViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.drone_list_row, viewGroup, false);

        return new DroneLaunchViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DroneLaunchViewHolder viewHolder, int i) {
        //Vehicle mVehicle = vehicleList.get(i);
        viewHolder.tv_id.setText(String.format(Locale.ENGLISH, "%d", i + 1));
        viewHolder.tv_name.setText("Loaded");
        viewHolder.tv_location.setText("Ready");
        viewHolder.tv_time_home.setText("Take Off");
    }

    @Override
    public int getItemCount() {
        return vehicleList.size();
    }

    public class DroneLaunchViewHolder extends RecyclerView.ViewHolder {
        LinearLayout ll_vehicle;
        TextView tv_id;
        CheckBox tv_name, tv_location, tv_time_home;

        public DroneLaunchViewHolder(View view) {
            super(view);
            ll_vehicle = view.findViewById(R.id.ll_vehicle);
            tv_id = view.findViewById(R.id.tv_id);
            tv_name = view.findViewById(R.id.tv_name);
            tv_location = view.findViewById(R.id.tv_location);
            tv_time_home = view.findViewById(R.id.tv_time_home);

        }
    }
}
