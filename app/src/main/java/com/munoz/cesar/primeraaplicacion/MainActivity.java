package com.munoz.cesar.primeraaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button miBoton = (Button)findViewById(R.id.button);

        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hola mundo", Toast.LENGTH_LONG).show();

                ((Button)v).setText("Se ha cambiado");

                String texto = ((Button)v).getText().toString();

                //Toast.makeText(getApplicationContext(), texto, Toast.LENGTH_LONG).show();
                TextView lbl = (TextView)findViewById(R.id.lblText);
                lbl.setText(texto);
            }
        });

        Button btnSuma = (Button)findViewById(R.id.Suma);

        btnSuma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Toast.makeText(getApplicationContext(), "2 + 2 = 4", Toast.LENGTH_LONG).show();
            }
        });
    }
        public void Pulsar(View v){
            Toast.makeText(getApplicationContext(), "Enlace estático", Toast.LENGTH_LONG).show();

    }
}
