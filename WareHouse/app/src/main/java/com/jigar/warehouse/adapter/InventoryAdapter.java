package com.jigar.warehouse.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jigar.warehouse.R;
import com.jigar.warehouse.model.Inventory;

import java.util.List;

public class InventoryAdapter extends RecyclerView.Adapter<InventoryAdapter.InventoryViewHolder> {

    private List<Inventory> inventoryList;

    public InventoryAdapter(List<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }

    @NonNull
    @Override
    public InventoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.inventory_list_row, viewGroup, false);

        return new InventoryViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull InventoryViewHolder viewHolder, int i) {
        Inventory mInventory = inventoryList.get(i);
        viewHolder.tv_item.setText(mInventory.getItem());
        viewHolder.tv_quantity.setText(mInventory.getQuantity());
        viewHolder.tv_location.setText(mInventory.getLocation());
    }

    @Override
    public int getItemCount() {
        return inventoryList.size();
    }

    public class InventoryViewHolder extends RecyclerView.ViewHolder {
        LinearLayout ll_inventory;
        TextView tv_item, tv_location, tv_quantity;

        public InventoryViewHolder(View view) {
            super(view);
            ll_inventory = view.findViewById(R.id.ll_inventory);
            tv_item = view.findViewById(R.id.tv_item);
            tv_quantity = view.findViewById(R.id.tv_quantity);
            tv_location = view.findViewById(R.id.tv_location);
        }
    }
}
