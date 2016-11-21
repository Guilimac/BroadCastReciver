package br.com.fiap.broadcastreceiver.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by guilherme on 21/11/16.
 */

public class MyOrderedReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Nvo Reciver 1",Toast.LENGTH_LONG).show();
    }
}
