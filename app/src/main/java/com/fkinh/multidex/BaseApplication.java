package com.fkinh.multidex;

import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

/**
 * Author: jinghao
 * Email: jinghao@meizu.com
 * Date: 2016-02-29
 */
public class BaseApplication extends MultiDexApplication {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();

        final Context mContext = this;
        new Runnable() {

            @Override
            public void run() {
                // put your logic here!
                // use the mContext instead of this here
            }
        }.run();
    }

}
