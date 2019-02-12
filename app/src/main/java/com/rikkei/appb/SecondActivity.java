package com.rikkei.appb;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tvDemo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
    }

    private void initView() {
        tvDemo = findViewById(R.id.text_demo);
        String msg = getIntent().getStringExtra(OpenAppReceiver.EXTRA_MESSAGE);
        tvDemo.setText(msg);
    }
}
