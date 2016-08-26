package com.netanel.logservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class LogService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
//        String version = intent.getExtras().getString("version");
        return new ILogService.Stub(){

            public void log_d(String tag, String message) throws RemoteException{
                Log.d(tag, message);
            }

            public void log(Message msg) throws RemoteException{
                Log.d(msg.getTag(), msg.getText());
            }
        };
    }
}
