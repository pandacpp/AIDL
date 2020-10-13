package com.panda.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new MyBinder();
    }

    static class MyBinder extends IMyAidlInterface.Stub {

        @Override
        public String getName() {
            return "test";
        }

        @Override
        public User getUserName() {
            return new User("HHH");
        }
    }
}
