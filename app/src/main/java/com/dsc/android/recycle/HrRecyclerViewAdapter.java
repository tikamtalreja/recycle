package com.dsc.android.recycle;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class HrRecyclerViewAdapter extends RecyclerView.Adapter<HrRecyclerViewAdapter.MyViewHolder> {
    private Context context;
    private LayoutInflater layoutInflater;
    private List<HrRecyclerViewData> recyclerViewDataList = new ArrayList<>();

    public  HrRecyclerViewAdapter(Context context){
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }
    public void setRecyclerViewDataList(List<HrRecyclerViewData> recyclerViewDataList) {
        this.recyclerViewDataList = recyclerViewDataList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.hr_recycler_view, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final HrRecyclerViewData data = recyclerViewDataList.get(position);
        Glide.with(context).load(data.getHr_image()).apply(RequestOptions.circleCropTransform())
                .into(holder.hrimage);
    }

    @Override
    public int getItemCount() {
        return recyclerViewDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView hrimage;
        public MyViewHolder(View itemView) {
            super(itemView);
            hrimage = itemView.findViewById(R.id.hr_image);
        }
    }
}
