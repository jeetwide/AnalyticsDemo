package com.example.jeetendraachtani.analyticsdemo.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jeetendraachtani.analyticsdemo.App.MyApplication;
import com.example.jeetendraachtani.analyticsdemo.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onResume() {
        super.onResume();
        MyApplication.getInstance().trackScreenView("Second Screen");
    }
}
