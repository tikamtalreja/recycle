package com.dsc.android.recycle;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class VrRecyclerViewAdapter extends RecyclerView.Adapter<VrRecyclerViewAdapter.MyVIewHolder> {
    private Context context;
    private LayoutInflater layoutInflater;
    private List<RecyclerViewData> recyclerViewDataList = new ArrayList<>();

    public  VrRecyclerViewAdapter(Context context){
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }
    public void setRecyclerViewDataList(List<RecyclerViewData> recyclerViewDataList) {
        this.recyclerViewDataList = recyclerViewDataList;
    }
    @NonNull
    @Override
    public VrRecyclerViewAdapter.MyVIewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = layoutInflater.inflate(R.layout.vr_recycler_view, parent, false);
        return new MyVIewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyVIewHolder holder, int position) {
        final RecyclerViewData data = recyclerViewDataList.get(position);
        holder.vrname.setText(data.getName());
        holder.vrphone.setText(data.getPhone());
        Glide.with(context).load(data.getVr_image()).apply(RequestOptions.circleCropTransform())
                .into(holder.vrimage);
    }

    @Override
    public int getItemCount() {
        return recyclerViewDataList.size();
    }

    public class MyVIewHolder extends RecyclerView.ViewHolder {
        TextView vrname, vrphone;
        ImageView vrimage;
        public MyVIewHolder(View itemView) {
            super(itemView);
            vrname = itemView.findViewById(R.id.vr_name);
            vrphone = itemView.findViewById(R.id.vr_phone);
            vrimage = itemView.findViewById(R.id.vr_image);

        }
    }
}
