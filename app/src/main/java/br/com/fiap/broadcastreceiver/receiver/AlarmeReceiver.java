package br.com.fiap.broadcastreceiver.receiver;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.NotificationCompat;
import android.widget.Toast;

import br.com.fiap.broadcastreceiver.AlarmeActivity;
import br.com.fiap.broadcastreceiver.R;

/**
 * Created by guilherme on 21/11/16.
 */

public class AlarmeReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Alarme disparado",Toast.LENGTH_LONG).show();
        enviarNotificacao(context);
    }

    private void enviarNotificacao(Context context){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);

        builder.setContentIntent(
                PendingIntent.getActivity(context,0,
                        new Intent(context, AlarmeActivity.class),
                        PendingIntent.FLAG_UPDATE_CURRENT));
        builder.setContentTitle("Alarme disparado");
        builder.setContentText("Seu alarme foi disparado com sucesso");
        builder.setTicker("Nova Mensagem");
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setAutoCancel(true);

        NotificationManager manager = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(100,builder.build());

    }
}
