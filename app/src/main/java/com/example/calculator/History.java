package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class History extends AppCompatActivity {
    private static final String TAG = "History";

    private ListView history2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        history2 = (ListView) findViewById(R.id.list1);
        initdata();

    }
    private void initdata() {
        ArrayList<enity> enities = MainActivity.enities;
        MyAdapter myAdapter = new MyAdapter(getApplicationContext(), enities);//初始化适配器
        history2.setAdapter(myAdapter);//绑定适配器
    }

}