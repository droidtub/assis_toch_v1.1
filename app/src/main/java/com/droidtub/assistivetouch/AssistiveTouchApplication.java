package com.droidtub.assistivetouch;

import android.app.Application;
import android.content.Intent;

import com.droidtub.assistivetouch.service.AssistiveTouchService;

/**
 * Created by hanh on 02/11/2015.
 */
public class AssistiveTouchApplication extends Application {
    private static AssistiveTouchApplication instance;

    @Override
    public void onCreate(){
        super.onCreate();
        instance = this;
        Intent i = new Intent(AssistiveTouchService.ASSISTIVE_TOUCH_START_ACTION);
        startService(i);
    }

    public static AssistiveTouchApplication getInstance(){
        return instance;
    }
}
