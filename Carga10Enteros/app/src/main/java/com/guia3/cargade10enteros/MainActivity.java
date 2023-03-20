package com.guia3.cargade10enteros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int Negativos = 0, Positivos = 0, Multiplos = 0, Pares = 0;
    TextView txvNegativos, txvPositivos, txvMultiplos, txvPares, txvMensaje;
    EditText edtN1, edtN2, edtN3, edtN4, edtN5, edtN6, edtN7, edtN8, edtN9, edtN10;

    int N1_2, N2_2, N3_2, N4_2, N5_2, N6_2, N7_2, N8_2, N9_2, N10_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvNegativos = findViewById(R.id.txvNegativos);
        txvPositivos = findViewById(R.id.txvPositivos);
        txvMultiplos = findViewById(R.id.txvMultiplos);
        txvPares = findViewById(R.id.txvPares);


        edtN1 = findViewById(R.id.edtN1);
        edtN2 = findViewById(R.id.edtN2);
        edtN3 = findViewById(R.id.edtN3);
        edtN4 = findViewById(R.id.edtN4);
        edtN5 = findViewById(R.id.edtN5);
        edtN6 = findViewById(R.id.edtN6);
        edtN7 = findViewById(R.id.edtN7);
        edtN8 = findViewById(R.id.edtN8);
        edtN9 = findViewById(R.id.edtN9);
        edtN10 = findViewById(R.id.edtN10);


    }

    public void Analizar(View vista){
        try{
            String N1 = edtN1.getText().toString().trim();
            String N2 = edtN2.getText().toString().trim();
            String N3 = edtN3.getText().toString().trim();
            String N4 = edtN4.getText().toString().trim();
            String N5 = edtN5.getText().toString().trim();
            String N6 = edtN6.getText().toString().trim();
            String N7 = edtN7.getText().toString().trim();
            String N8 = edtN8.getText().toString().trim();
            String N9 = edtN9.getText().toString().trim();
            String N10 = edtN10.getText().toString().trim();

            N1_2 = Integer.parseInt(N1);
            N2_2 = Integer.parseInt(N2);
            N3_2 = Integer.parseInt(N3);
            N4_2 = Integer.parseInt(N4);
            N5_2 = Integer.parseInt(N5);
            N6_2 = Integer.parseInt(N6);
            N7_2 = Integer.parseInt(N7);
            N8_2 = Integer.parseInt(N8);
            N9_2 = Integer.parseInt(N9);
            N10_2 = Integer.parseInt(N10);

            CalcularNegativos();
            CalcularPositivos();
            Multiplos15();
            AcumuladoPares();

            //Negativos
            String Neg = String.valueOf(Negativos);
            txvNegativos.setText("Valores negativos : " + Neg);
            //Positivos
            String Pos = String.valueOf(Positivos);
            txvPositivos.setText("Valores positivos : " + Pos);
            //Multiplos15
            String Mul = String.valueOf(Multiplos);
            txvMultiplos.setText("Multiplos de 15 : " + Mul);
            //Pares
            String Par = String.valueOf(Pares);
            txvPares.setText("Acumulado pares : " + Par);

        } catch (NumberFormatException e) {
            txvMensaje.setText("ERROR FATAL -- Un dato no valido");
        }
    }

    public void CalcularNegativos(){
        Negativos = 0;
        if (N1_2 < 0) {Negativos = Negativos + 1;}
        if (N2_2 < 0) {Negativos = Negativos + 1;}
        if (N3_2 < 0) {Negativos = Negativos + 1;}
        if (N4_2 < 0) {Negativos = Negativos + 1;}
        if (N5_2 < 0) {Negativos = Negativos + 1;}
        if (N6_2 < 0) {Negativos = Negativos + 1;}
        if (N7_2 < 0) {Negativos = Negativos + 1;}
        if (N8_2 < 0) {Negativos = Negativos + 1;}
        if (N9_2 < 0) {Negativos = Negativos + 1;}
        if (N10_2 < 0) {Negativos = Negativos + 1;}
    }

    public void CalcularPositivos(){
        Positivos = 0;
        if (N1_2 > 0) {Positivos = Positivos + 1;}
        if (N2_2 > 0) {Positivos = Positivos + 1;}
        if (N3_2 > 0) {Positivos = Positivos + 1;}
        if (N4_2 > 0) {Positivos = Positivos + 1;}
        if (N5_2 > 0) {Positivos = Positivos + 1;}
        if (N6_2 > 0) {Positivos = Positivos + 1;}
        if (N7_2 > 0) {Positivos = Positivos + 1;}
        if (N8_2 > 0) {Positivos = Positivos + 1;}
        if (N9_2 > 0) {Positivos = Positivos + 1;}
        if (N10_2 > 0) {Positivos = Positivos + 1;}
    }

    public void Multiplos15(){
        Multiplos = 0;
        if ((N1_2 % 15) == 0) {Multiplos = Multiplos + 1;}
        if ((N2_2 % 15) == 0) {Multiplos = Multiplos + 1;}
        if ((N3_2 % 15) == 0) {Multiplos = Multiplos + 1;}
        if ((N4_2 % 15) == 0) {Multiplos = Multiplos + 1;}
        if ((N5_2 % 15) == 0) {Multiplos = Multiplos + 1;}
        if ((N6_2 % 15) == 0) {Multiplos = Multiplos + 1;}
        if ((N7_2 % 15) == 0) {Multiplos = Multiplos + 1;}
        if ((N8_2 % 15) == 0) {Multiplos = Multiplos + 1;}
        if ((N9_2 % 15) == 0) {Multiplos = Multiplos + 1;}
        if ((N10_2 % 15) == 0) {Multiplos = Multiplos + 1;}
    }

    public void AcumuladoPares(){
        Pares = 0;
        if ((N1_2 % 2) == 0) {Pares = Pares + N1_2;}
        if ((N2_2 % 2) == 0) {Pares = Pares + N2_2;}
        if ((N3_2 % 2) == 0) {Pares = Pares + N3_2;}
        if ((N4_2 % 2) == 0) {Pares = Pares + N4_2;}
        if ((N5_2 % 2) == 0) {Pares = Pares + N5_2;}
        if ((N6_2 % 2) == 0) {Pares = Pares + N6_2;}
        if ((N7_2 % 2) == 0) {Pares = Pares + N7_2;}
        if ((N8_2 % 2) == 0) {Pares = Pares + N8_2;}
        if ((N9_2 % 2) == 0) {Pares = Pares + N9_2;}
        if ((N10_2 % 2) == 0) {Pares = Pares + N10_2;}
    }

}