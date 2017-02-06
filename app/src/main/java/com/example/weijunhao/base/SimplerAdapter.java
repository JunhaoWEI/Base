package com.example.weijunhao.base;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WEI JUNHAO on 2017/2/6.
 */

public class SimplerAdapter extends RecyclerView.Adapter<SimplerAdapter.ViewHolder> {
    private List<String> items;

    public SimplerAdapter(@NonNull List<String> dateItems) {
        this.items = dateItems != null ? dateItems : new ArrayList<String>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
