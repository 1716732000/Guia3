package com.guia3.triangulo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtCateto1;
    EditText edtCateto2;
    EditText edtHipotenuza;
    String Cat1, Cat2, Hipo;
    int Cat11, Cat21, Hip1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCateto1 = findViewById(R.id.edtCateto1);
        edtCateto2 = findViewById(R.id.edtCateto2);
        edtHipotenuza = findViewById(R.id.edtHipotenuza);
    }

    public void AnalizarTriangulo(View view){
        Cat1 = edtCateto1.getText().toString();
        Cat2 = edtCateto2.getText().toString();
        Hipo = edtHipotenuza.getText().toString();

        Cat11 = Integer.parseInt(Cat1);
        Cat21 = Integer.parseInt(Cat2);
        Hip1 = Integer.parseInt(Hipo);

        if(Cat11 == Cat21 && Cat21 == Hip1){
            Intent Equi = new Intent(this, Triangulo_Equilatero.class);
            startActivity(Equi);
        }else if(Cat11 != Cat21 && Cat21 != Hip1){
            Intent Esca = new Intent(this, Triangulo_Escaleno.class);
            startActivity(Esca);
        }else if((Cat11 == Cat21 && Cat11 != Hip1) || (Cat11 == Hip1 && Cat11 != Cat21) || Cat21 == Hip1 || Cat21 != Cat11){
            Intent Isos = new Intent(this, Triangulo_Isosceles.class);
            startActivity(Isos);
        }
    }
}