package com.prueba.tresenraya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.io.BufferedReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNuevaPartida = (Button) findViewById(R.id.button);
        final tresenrayaview terv = (tresenrayaview) findViewById(R.id.view);

        btnNuevaPartida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                terv.iniciarPartida();
            }
        });
    }
}
