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
import com.jigar.warehouse.adapter.InventoryAdapter;
import com.jigar.warehouse.model.Inventory;

import java.util.ArrayList;


public class InventoryFragment extends Fragment {

    RecyclerView rv_inventory;
    ArrayList<Inventory> mInventoryArrayList = new ArrayList<>();
    InventoryAdapter mInventoryAdapter;

    public InventoryFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_inventory, container, false);

        rv_inventory = rootView.findViewById(R.id.rv_inventory);
        rv_inventory.setLayoutManager(new LinearLayoutManager(getActivity()));

        dummyData();

        mInventoryAdapter = new InventoryAdapter(mInventoryArrayList);
        rv_inventory.setAdapter(mInventoryAdapter);
        rv_inventory.setItemAnimator(new DefaultItemAnimator());

        return rootView;
    }

    private void dummyData() {
        mInventoryArrayList.clear();
        mInventoryArrayList.add(new Inventory("Item", "Qty", "Location"));
        mInventoryArrayList.add(new Inventory("Grocery", "45", "WareHouse 1"));
        mInventoryArrayList.add(new Inventory("Food", "60", "Wh 2"));
    }

}
