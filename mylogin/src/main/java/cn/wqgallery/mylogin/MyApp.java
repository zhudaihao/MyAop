package cn.wqgallery.mylogin;

import android.app.Application;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        myApp = this;
    }

    private static MyApp myApp;

    public static MyApp getinstacne() {
        return myApp;
    }
}
