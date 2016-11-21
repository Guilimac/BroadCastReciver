package br.com.fiap.broadcastreceiver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AlarmeActivity extends AppCompatActivity {

    EditText edtTempo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarme);
        edtTempo = (EditText)findViewById(R.id.edtTempo);
    }

    public void configurar(View v){
        String tempo = edtTempo.getText().toString();
        if(!tempo.equals("")){
            int valTempo = Integer.parseInt(tempo);
        }
    }
}
