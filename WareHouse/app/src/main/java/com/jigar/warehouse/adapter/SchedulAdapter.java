package com.jigar.warehouse.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jigar.warehouse.DroneLaunchActivity;
import com.jigar.warehouse.OrderDetailActivity;
import com.jigar.warehouse.R;

import java.util.List;

public class SchedulAdapter extends RecyclerView.Adapter<SchedulAdapter.DroneLaunchViewHolder> {

    Context context;
    private List<String> vehicleList;

    public SchedulAdapter(List<String> vehicleList, Context context1) {
        this.vehicleList = vehicleList;
        this.context = context1;
    }

    @NonNull
    @Override
    public DroneLaunchViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.schedul_list_row, viewGroup, false);

        return new DroneLaunchViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DroneLaunchViewHolder viewHolder, int i) {
        //Vehicle mVehicle = vehicleList.get(i);

//        viewHolder.iv_icon.setImageDrawable(R.drawable.drone_scan);
        viewHolder.tv_name.setText(vehicleList.get(i));
        viewHolder.tv_order.setText(String.format("%d", i + 42));

        viewHolder.iv_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, DroneLaunchActivity.class));
            }
        });
        viewHolder.tv_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, DroneLaunchActivity.class));
            }
        });

        viewHolder.tv_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, OrderDetailActivity.class));

            }
        });


        if (i == 0) {
            viewHolder.iv_icon.setImageDrawable(null);
            viewHolder.tv_name.setText("Vehicles");
            viewHolder.tv_order.setText("Orders");
            viewHolder.tv_order.setClickable(false);
            viewHolder.tv_name.setClickable(false);
            viewHolder.iv_icon.setClickable(false);
        }

    }

    @Override
    public int getItemCount() {
        return vehicleList.size();
    }

    public class DroneLaunchViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_icon;
        TextView tv_name, tv_order;
        LinearLayout ll_vehicle;

        public DroneLaunchViewHolder(View view) {
            super(view);
            ll_vehicle = view.findViewById(R.id.ll_vehicle);
            iv_icon = view.findViewById(R.id.iv_icon);
            tv_name = view.findViewById(R.id.tv_name);
            tv_order = view.findViewById(R.id.tv_order);

        }
    }
}
