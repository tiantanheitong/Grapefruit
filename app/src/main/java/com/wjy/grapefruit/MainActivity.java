package com.wjy.grapefruit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wjy.grapefruit.bmob.bean.BmobTestData;
import com.wjy.grapefruit.im.ImHomeActivity;

import org.json.JSONObject;

import cn.bmob.v3.BmobRealTimeData;
import cn.bmob.v3.listener.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, ImHomeActivity.class);
        startActivity(intent);
       /* BmobTestData data = new BmobTestData();
        BmobRealTimeData rtd = new BmobRealTimeData();*/
//        rtd.subTableUpdate();
//        rtd.start(this, new ValueEventListener() {
//            @Override
//            public void onConnectCompleted() {
//
//            }
//
//            @Override
//            public void onDataChange(JSONObject jsonObject) {
//
//            }
//        });
    }
}
