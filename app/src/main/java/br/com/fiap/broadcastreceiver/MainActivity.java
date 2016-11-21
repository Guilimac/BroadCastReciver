package br.com.fiap.broadcastreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logar(View v){
        Intent i = new Intent();
        i.setAction("android.app.action.ACTION_PASSWORD_SUCCEEDED");
        sendBroadcast(i);
        Intent io = new Intent();
        io.setAction("orderedBroadcast");
        sendBroadcast(io);
        Intent is = new Intent();
        is.setAction("orderedBroadcast2");
        sendBroadcast(is);

    }
}
