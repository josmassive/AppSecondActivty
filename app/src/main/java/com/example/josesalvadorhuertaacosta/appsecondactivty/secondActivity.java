package com.example.josesalvadorhuertaacosta.appsecondactivty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class secondActivity extends AppCompatActivity implements View.OnClickListener{

    TextView texto;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        texto = (TextView) findViewById(R.id.text);

        listView  = (ListView) findViewById(R.id.lista);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if (extras != null){
            String dato = extras.getString("DATO");
            texto.setText(dato);
        }

        int[] numeros = new int[4];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;

        for (int i=1; i<numeros.length; i++){

            System.out.println(i+"prueba de escritura  ----------------------------------------");
        }
    }

    @Override
    public void onClick(View view) {

    }
}
