package com.guia3.tresvalores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtValor;
    TextView txvRespuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor = findViewById(R.id.edtValor);
        txvRespuesta = findViewById(R.id.txvRespuesta);
    }

    public void Analizar(View view){
        try {
            String Val1 = edtValor.getText().toString();
            int Val2 = Integer.parseInt(Val1);

            if(Val2 >= 1000){
                txvRespuesta.setText("ERROR Tiene mas de 3 cifras");
            }else if(Val2 >= 100){
                txvRespuesta.setText("Tiene 3 cifras");
            }else if(Val2 >= 10){
                txvRespuesta.setText("Tiene 2 cifras");
            }else if(Val2 < 10){
                txvRespuesta.setText("Tiene 1 cifra");
            }

        } catch (Exception e) {
            txvRespuesta.setText("VALOR NO ACEPTADO");
        }

    }
}