package com.mehta.android.ands17a1;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyService extends Service {

    /*
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    */



    String tag="MyService";
    MediaPlayer mp;

    @Override
    public IBinder onBind(Intent intent){
        return null;
    }

    @Override
    public void onCreate(){
        super.onCreate();
        mp = MediaPlayer.create(getApplicationContext(), R.raw.wave);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        mp.start();
        mp.setLooping(true);
        return START_STICKY;
    }

    @Override
    public void onDestroy(){
        mp.release();
        super.onDestroy();
    }
}
