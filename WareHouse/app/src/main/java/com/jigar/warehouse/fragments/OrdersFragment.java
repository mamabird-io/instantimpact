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
import com.jigar.warehouse.adapter.OrdersAdapter;
import com.jigar.warehouse.model.Order;

import java.util.ArrayList;


public class OrdersFragment extends Fragment {

    ArrayList<Order> mOrderArrayList = new ArrayList<>();
    RecyclerView rv_orders;
    OrdersAdapter mOrdersAdapter;


    public OrdersFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_orders, container, false);

        rv_orders = rootView.findViewById(R.id.rv_orders);
        rv_orders.setLayoutManager(new LinearLayoutManager(getActivity()));

        dummyData();

        mOrdersAdapter = new OrdersAdapter(mOrderArrayList);
        rv_orders.setAdapter(mOrdersAdapter);
        rv_orders.setItemAnimator(new DefaultItemAnimator());

        return rootView;
    }

    public void dummyData() {
        mOrderArrayList.clear();
        mOrderArrayList.add(new Order(1, "Location", "Items", "Container", "Vehicle"));
        mOrderArrayList.add(new Order(2, "Health Center 1", "4", "1", "Drone 1"));
        mOrderArrayList.add(new Order(3, "Health Center 2", "5", "9", "Drone 2"));
        mOrderArrayList.add(new Order(4, "Health Center 3", "2", "6", "Drone 3"));
        mOrderArrayList.add(new Order(5, "Health Center 4", "3", "5", "Drone 4"));
    }
}
