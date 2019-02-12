package com.rikkei.appb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class OpenAppReceiver extends BroadcastReceiver {

    public static final String EXTRA_MESSAGE = "msg";

    @Override
    public void onReceive(Context context, Intent intent) {
        String msg = intent.getStringExtra(EXTRA_MESSAGE);
        Intent intentB = new Intent(context, SecondActivity.class);
        intentB.putExtra(EXTRA_MESSAGE, msg);
        context.startActivity(intentB);
    }
}
