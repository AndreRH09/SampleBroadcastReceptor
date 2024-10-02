package com.example.samplebroadcastreceptor;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;

public class MoonBroadCastReciver {

    private static final String EXTRA_MOON_PHASE = "org.example.samplebroadcastreceiver.MoonBroadCastReciver.EXTRA_MOON_PHASE";

    private static final String TAG = "MoonBroadCastReciver";

    public void onReceive(Context context, Intent intent){

        String message = intent.getStringExtra(EXTRA_MOON_PHASE);
        writeToFile(message, context);
        Log.d(TAG, message);

    }
}


    public void writeToFile(String data, Context context){
        Intent intent = new Intent();

        intent.setComponent(new ComponentName(org.));

        intent.setAction(EXTRA_MOON_PHASE);
        intent.putExtra(EXTRA_MOON_PHASE,message);

        sendBroadcast(intent);
        Log.d(TAG, "Mensaje Eviado");}

}
