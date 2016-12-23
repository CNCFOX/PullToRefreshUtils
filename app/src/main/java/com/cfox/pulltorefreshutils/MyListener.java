package com.cfox.pulltorefreshutils;

import android.os.Handler;
import android.os.Message;

import com.cfox.pulltorefresh.PullToRefreshLayout;


public class MyListener implements PullToRefreshLayout.OnRefreshListener {

    @Override
    public void onRefresh(final PullToRefreshLayout pullToRefreshLayout) {
        // 下拉刷新操作
        new Handler() {
            @Override
            public void handleMessage(Message msg) {
                // 千万别忘了告诉控件刷新完毕了哦！
                pullToRefreshLayout.refreshFinish(PullToRefreshLayout.SUCCEED);
            }
        }.sendEmptyMessageDelayed(0, 5000);
    }


}
