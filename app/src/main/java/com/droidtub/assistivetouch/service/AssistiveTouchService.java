package com.droidtub.assistivetouch.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by hanh on 02/11/2015.
 */
public class AssistiveTouchService extends Service {

    public static final String ASSISTIVE_TOUCH_START_ACTION = "com.droidtub.assistive_start_action";
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
