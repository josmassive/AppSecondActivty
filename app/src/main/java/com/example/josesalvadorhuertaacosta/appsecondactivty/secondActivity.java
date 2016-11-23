package com.example.josesalvadorhuertaacosta.appsecondactivty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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
        String[] valores = new String[]{"Holanda", "España", "EU", "India", "Mexico", "China", "Uruguay", "Brasil"};

        //se crea adaptador para llenar un elemento como queremos
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, valores);
        listView.setAdapter(adapter);
        // para poder dar clck a cada elemento de la lista
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Position"+position, Toast.LENGTH_SHORT).show();
            }
        });

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if (extras != null){
            String dato = extras.getString("DATO");
            texto.setText(dato);
        }

        /*int[] numeros = new int[4];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;

        for (int i=1; i<numeros.length; i++){

            System.out.println(i+"prueba de escritura  ----------------------------------------");
        }*/


    }

    @Override
    public void onClick(View view) {

    }
}
