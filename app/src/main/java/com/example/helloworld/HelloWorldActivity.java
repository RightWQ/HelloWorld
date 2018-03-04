package com.example.helloworld;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
//import com.alibaba.fastjson.JSON;

public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_layout);
//        JSON.parse("{\"username\":\"danny\"}");
//        Log.d("HelloWorldActivity", "onCreat execute");    //用于打印一些调试信息
        Log.d(TAG, "onCreate: execute");
    }
    private static final String TAG = "HelloWorldActivity";    //调用logt

}
