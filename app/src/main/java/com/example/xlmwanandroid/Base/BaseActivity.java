package com.example.xlmwanandroid.Base;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.xlmwanandroid.R;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }




}