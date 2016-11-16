package com.example.josesalvadorhuertaacosta.appsecondactivty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

     //se crean objetos que enviara al segundo activity
     Button boton;
     EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //se enlazan objetos con el bundle
        boton = (Button) findViewById(R.id.boton);
        editText = (EditText)findViewById(R.id.editText);

        boton.setOnClickListener(this);

    }


    //este metodo click se autogenero cuando se declaro el objeto boton
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.boton:

                //pasar a new activity
                String dato = editText.getText().toString();
                Intent intent = new Intent(MainActivity.this, secondActivity.   class);

                //envio de datos
                intent.putExtra("DATO", dato);

                //pasar a new activity
                startActivity(intent);
                break;
        }
    }


}
