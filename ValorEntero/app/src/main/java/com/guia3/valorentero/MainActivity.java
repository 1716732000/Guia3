package com.guia3.valorentero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText valor;
   int val1;
   TextView Respuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor = findViewById(R.id.etNumero);
        Respuesta = findViewById(R.id.tvRespuesta);
    }

    public void Calcular(View view){
        String val1 = valor.getText().toString();

        try {
            int val2 = Integer.parseInt(val1);

            if(val2 > 0){
                Respuesta.setText("Valor Positivo");
            }else if(val2 < 0){
                Respuesta.setText("Valor Negativo");
            }else if(val2 == 0){
                Respuesta.setText("Valor Nulo");
            }
        } catch (NumberFormatException e) {
            Respuesta.setText("Valor Nulo");
        }
    }

}