package com.jigar.warehouse.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jigar.warehouse.R;
import com.jigar.warehouse.model.Order;

import java.util.List;
import java.util.Locale;

public class OrdersAdapter extends RecyclerView.Adapter<OrdersAdapter.OrderViewHolder> {

    private List<Order> orderList;

    public OrdersAdapter(List<Order> orderList) {
        this.orderList = orderList;
    }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.order_list_row, viewGroup, false);

        return new OrderViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder orderViewHolder, int i) {
        Order mOrder = orderList.get(i);
        orderViewHolder.tv_id.setText(String.format(Locale.ENGLISH, "%d", mOrder.getId()));
        orderViewHolder.tv_location.setText(mOrder.getLocation());
        orderViewHolder.tv_item.setText(mOrder.getItems());
        orderViewHolder.tv_container.setText(mOrder.getContainer());
        orderViewHolder.tv_vehicle.setText(mOrder.getVehicle());

        if (mOrder.getId() == 1) {
            orderViewHolder.tv_id.setText("Id");
        }
    }

    @Override
    public int getItemCount() {
        return orderList.size();
    }

    public class OrderViewHolder extends RecyclerView.ViewHolder {
        LinearLayout ll_order;
        TextView tv_id, tv_location, tv_item, tv_container, tv_vehicle;

        public OrderViewHolder(View view) {
            super(view);
            ll_order = view.findViewById(R.id.ll_order);
            tv_id = view.findViewById(R.id.tv_id);
            tv_location = view.findViewById(R.id.tv_location);
            tv_item = view.findViewById(R.id.tv_item);
            tv_container = view.findViewById(R.id.tv_container);
            tv_vehicle = view.findViewById(R.id.tv_vehicle);
        }
    }
}
