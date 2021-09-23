package com.example.boton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo el boton siguiente
    public void Siguiente (View view){
        Intent siguiente = new Intent(this, SegundoActivity.class);
        startActivity(siguiente);


    }
}