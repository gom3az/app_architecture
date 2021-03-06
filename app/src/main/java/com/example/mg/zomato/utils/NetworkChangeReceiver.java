package com.example.mg.zomato.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


public class NetworkChangeReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(final Context context, final Intent intent) {
        boolean online = InternetConnection.getInstance().isConnected(context);
        InternetConnection.getInstance().onlineObserver().onNext(online);
        Log.i("onReceive: ", String.valueOf(online));
    }
}
