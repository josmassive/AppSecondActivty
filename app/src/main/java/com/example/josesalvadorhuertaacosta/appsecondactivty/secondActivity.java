package com.example.josesalvadorhuertaacosta.appsecondactivty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity implements View.OnClickListener{

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        texto = (TextView) findViewById(R.id.text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if (extras != null){
            String dato = extras.getString("DATO");
            texto.setText(dato);
        }
    }

    @Override
    public void onClick(View view) {

    }
}
