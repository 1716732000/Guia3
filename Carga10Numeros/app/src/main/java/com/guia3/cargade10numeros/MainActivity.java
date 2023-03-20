package com.guia3.cargade10numeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtValor;
    TextView txvAcumulado;
    TextView txvSuma;
    int Contador;
    double Suma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor = findViewById(R.id.edtValor);
        txvAcumulado = findViewById(R.id.txvAcumulado);
        txvSuma = findViewById(R.id.txvSuma);
    }

    public void CapturarValor(View view){

        String val1 = edtValor.getText().toString();
        double val2 = Double.parseDouble(val1);

        Contador = Contador + 1;
        if(Contador <= 10){

            String Cont = String.valueOf(Contador);
            txvAcumulado.setText(Cont);
            edtValor.setText("");
        }else{
            edtValor.setText("Valor maximo alcansado");
        }

        if(Contador >=6 && Contador <=10){
            Suma = Suma + val2;
            String Sum = String.valueOf(Suma);
            txvSuma.setText(Sum);
        }

    }


}