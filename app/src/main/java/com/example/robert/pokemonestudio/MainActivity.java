package com.example.robert.pokemonestudio;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout r ;
    private ImageView imgPokeball,imgFuego,imgPlanta,imgAgua,imgElectricidad;
    private TextView lblFuego,lblPlanta,lblAgua,lblelectricidad;
    private Button boton;
    private int c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        continuar();
        finalizar();
    }

    public void iniVariables(){
        r = (RelativeLayout) findViewById(R.id.relativeLayout);
        imgPokeball=(ImageView) findViewById(R.id.imgPokeball);
        imgFuego=(ImageView) findViewById(R.id.imgFuego);
        imgPlanta=(ImageView) findViewById(R.id.imgPlanta);
        imgAgua=(ImageView) findViewById(R.id.imgAgua);
        imgElectricidad=(ImageView) findViewById(R.id.imgElectricidad);
        lblAgua=(TextView) findViewById(R.id.lblAgua);
        lblPlanta=(TextView) findViewById(R.id.lblPlanta);
        lblelectricidad=(TextView) findViewById(R.id.lblElectricidad);
        lblFuego=(TextView) findViewById(R.id.lblFuego);
        boton=(Button) findViewById(R.id.btn);
        c=0;
    }

    public void continuar(){
        iniVariables();
        imgFuego.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                c=1;
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                Bundle b = new Bundle();
                b.putString("charmander", String.valueOf(lblFuego));
                b.putInt("car",c);
                i.putExtras(b);
                startActivity(i);
                return false;
            }
        });

        imgPlanta.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                c=2;
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                Bundle b = new Bundle();
                b.putString("bulbasur", String.valueOf(lblPlanta));
                b.putInt("car", c);
                i.putExtras(b);
                startActivity(i);
                return false;
            }
        });

        imgElectricidad.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                c=3;
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                Bundle b = new Bundle();
                b.putString("pichu", String.valueOf(lblelectricidad));
                b.putInt("car", c);
                i.putExtras(b);
                startActivity(i);
                return false;
            }
        });

        imgAgua.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                c=4;
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                Bundle b = new Bundle();
                b.putString("squirtle", String.valueOf(lblAgua));
                b.putInt("car",c);
                i.putExtras(b);
                startActivity(i);
                return false;
            }
        });


    }

    public void finalizar(){
       boton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              finish();
           }
       });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.top_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id) {
            case R.id.pintarRojo:
                r.setBackgroundColor(getResources().getColor(R.color.rojo));
                return true;
            case R.id.pintarAzul:
                r.setBackgroundColor(getResources().getColor(R.color.azul));
                return true;
            case R.id.pintarAmarillo:
                r.setBackgroundColor(getResources().getColor(R.color.amarillo));
                return true;
            default :
                return false;
        }

    }
}
