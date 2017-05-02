package com.example.cheng.swiprefreshlayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {

    private SwipeRefreshLayout swipeRefreshLayout;
    private RecyclerView recyclerView;

    private int lastVisionItem;
    private LinearLayoutManager mLayoutManager;

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {


            super.handleMessage(msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
//        recyclerView = (RecyclerView) findViewById(android.R.id.list);
//
////        swipeRefreshLayout.setColorSchemeResources(R.color.color1,R.color.color2,R.color.color3,R.color.color4);
//        swipeRefreshLayout.setOnRefreshListener(this);
//
//        //这句话是为了，第一次进入页面的时候显示加载进度条
//        swipeRefreshLayout.setProgressViewOffset(false,0, (int) TypedValue.applyDimension(
//                TypedValue.COMPLEX_UNIT_DIP,24,getResources().getDisplayMetrics()));
//
//        recyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
//            @Override
//            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
//                super.onScrollStateChanged(recyclerView,newState);
////                if (newState == RecyclerView.SCROLL_STATE_IDLE
////                        && lastVisionItem +1 == adapter.getItemCount()){
////                    swipeRefreshLayout.setRefreshing(true);
////                    //此处实现网络请求数据
////                    handler.sendEmptyMessageDelayed(0,3000);
////                }
//            }
//
//            @Override
//            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
//                super.onScrolled(recyclerView, dx, dy);
//                lastVisionItem = mLayoutManager.findLastVisibleItemPosition();
//            }
//        });
//
//        recyclerView.setHasFixedSize(true);
//        mLayoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(mLayoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
////        adapter = new SampleAdapter();
////        recyclerView.setAdapter(adapter);
//
//        //此处实现网络请求数据
//        handler.sendEmptyMessageDelayed(0,3000);
    }

    /**
     * 下拉刷新
     */
    @Override
    public void onRefresh() {

    }

    public void gotoTestActivity(View view) {
        startActivity(new Intent(this, TestActivity.class));
    }
}
