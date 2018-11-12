package com.example.onexzgj.screenutils.base;

import android.app.Application;
import android.content.Context;

/**
 * Created by OnexZgj on 2018/11/12.
 */

public class App extends Application {

    private static App mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance=this;
        app=this;
    }

    private static Application app=null;

    public static Context getAppContext() {
        return mInstance.getApplicationContext();
    }

    public static Context getApplication() {
        return app;
    }

    public static App getInstance() {
        return mInstance;
    }


}
