package com.example.madaim.ex2;

import android.app.Application;
import android.util.Log;

/**
 * Created by Madaim on 23/09/2016.
 */
public class MyApp extends Application{

    public final static String MY_TAG="MyApp";
    @Override
    public void onCreate() {
        Log.i(MY_TAG, "App: onCreate event");
        super.onCreate();
    }

    @Override
    public void onTerminate() {
        Log.i(MY_TAG, "App: onTerminate event");
        super.onTerminate();
    }

}
