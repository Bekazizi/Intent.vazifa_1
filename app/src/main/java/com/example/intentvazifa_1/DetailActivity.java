package com.example.intentvazifa_1;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    public final String TAG = DetailActivity.class.toString();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
//        initViews();
    }
//    void initViews(){
//        TextView tv_detail = (TextView) findViewById(R.id.tv_detail);
//
//        String name = getIntent().getStringExtra("name");
//        Log.d(TAG, name);
//
//        String age = getIntent().getStringExtra("age");
//        Log.d(TAG, age);
//
//        tv_detail.setText("name: "+ name + " age: "+age);
//    }
}
