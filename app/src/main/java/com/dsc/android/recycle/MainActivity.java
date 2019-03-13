package com.dsc.android.recycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView hrRecyclerView,vrRecyclerView;
    private HrRecyclerViewAdapter HrrecyclerViewAdapter;
    private VrRecyclerViewAdapter vrRecyclerViewAdapter;
    private List<RecyclerViewData> mockDataList = new ArrayList<>();
    private List<HrRecyclerViewData> mockDataList1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hrRecyclerView = findViewById(R.id.hr_recyclerview);
        vrRecyclerView = findViewById(R.id.vr_recyclerview);
        createMockList();
        setUpRecyclerView();
    }

    private void setUpRecyclerView() {
        HrrecyclerViewAdapter = new HrRecyclerViewAdapter(this);
        hrRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        hrRecyclerView.setAdapter(HrrecyclerViewAdapter);
        HrrecyclerViewAdapter.setRecyclerViewDataList(mockDataList1);
        HrrecyclerViewAdapter.notifyDataSetChanged();

        //Vertical
        vrRecyclerViewAdapter = new VrRecyclerViewAdapter(this);
        vrRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        vrRecyclerView.setAdapter(vrRecyclerViewAdapter);
        vrRecyclerViewAdapter.setRecyclerViewDataList(mockDataList);
        vrRecyclerViewAdapter.notifyDataSetChanged();



    }

    private void createMockList(){
        RecyclerViewData data;
        HrRecyclerViewData data1;
        data1 = new HrRecyclerViewData("https://cdn.pixabay.com/photo/2016/09/25/15/11/android-1693894__340.jpg");
        mockDataList1.add(data1);
        data1 = new HrRecyclerViewData("https://cdn.pixabay.com/photo/2016/09/25/15/11/android-1693894__340.jpg");
        mockDataList1.add(data1);
        data1 = new HrRecyclerViewData("https://cdn.pixabay.com/photo/2016/09/25/15/11/android-1693894__340.jpg");
        mockDataList1.add(data1);
        data1 = new HrRecyclerViewData("https://cdn.pixabay.com/photo/2016/09/25/15/11/android-1693894__340.jpg");
        mockDataList1.add(data1);
        data1 = new HrRecyclerViewData("https://cdn.pixabay.com/photo/2016/09/25/15/11/android-1693894__340.jpg");
        mockDataList1.add(data1);
        data1 = new HrRecyclerViewData("https://cdn.pixabay.com/photo/2016/09/25/15/11/android-1693894__340.jpg");
        mockDataList1.add(data1);



        data = new RecyclerViewData("tikam", "9691920858","https://cdn.pixabay.com/photo/2016/09/25/15/11/android-1693894__340.jpg");
        mockDataList.add(data);
        data = new RecyclerViewData("vivek", "9074955179","https://cdn.pixabay.com/photo/2016/09/25/15/11/android-1693894__340.jpg");
        mockDataList.add(data);
        data = new RecyclerViewData("bijin", "8461857371","https://cdn.pixabay.com/photo/2016/09/25/15/11/android-1693894__340.jpg");
        mockDataList.add(data);
        data = new RecyclerViewData("rutik", "7223029222","https://cdn.pixabay.com/photo/2016/09/25/15/11/android-1693894__340.jpg");
        mockDataList.add(data);
        data = new RecyclerViewData("archit", "9424141038","https://cdn.pixabay.com/photo/2016/09/25/15/11/android-1693894__340.jpg");
        mockDataList.add(data);
    }

}
