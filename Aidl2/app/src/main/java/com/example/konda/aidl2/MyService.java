package com.example.konda.aidl2;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.

return binder;
    }

    First.Stub binder=new First.Stub() {
        @Override
        public int basicTypes(int First, int Second) throws RemoteException {
           return First*Second;
        }
    };

      }
