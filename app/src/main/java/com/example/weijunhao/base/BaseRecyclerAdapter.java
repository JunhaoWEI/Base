package com.example.weijunhao.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WEI JUNHAO on 2017/2/6.
 */

public abstract class BaseRecyclerAdapter<T> extends RecyclerView.Adapter<RecyclerViewHolder> {
    protected final List<T> mData;
    protected final Context mContext;
    protected LayoutInflater mInflater;
    protected AdapterView.OnItemClickListener mClickListener;
    protected AdapterView.OnItemLongClickListener mLongClickListener;

    public BaseRecyclerAdapter(Context context, List<T> list) {
        mData = list != null ? list : new ArrayList<T>();
        mContext = context;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerViewHolder holder = new RecyclerViewHolder(mContext,mInflater.inflate(
                getItemLayoutId(viewType)), parent, false);
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
