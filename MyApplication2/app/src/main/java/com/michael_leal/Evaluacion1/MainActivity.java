package com.michael_leal.Evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    private Button Confirmar1;
    private EditText Nombre1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Confirmar1=(Button) findViewById(R.id.Confirmar1);
        Nombre1=(EditText) findViewById(R.id.Nombre1);
        Confirmar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),Nombre1.getText().toString()+ ", Pedido confirmado!",Toast.LENGTH_LONG).show();
            }
        });


    }
}
