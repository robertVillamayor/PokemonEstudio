package com.example.robert.pokemonestudio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private ImageView imagen;
    private TextView texto;
    private Button boton;
    private int abc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        rellena();

    }

    public void iniVariables(){
        imagen = (ImageView)findViewById(R.id.imgTercera);
        texto= (TextView)findViewById(R.id.lblTercera);
        boton= (Button)findViewById(R.id.btnEvolucion);
        abc=0;
    }

    public void rellena (){
        iniVariables();
        Bundle b = getIntent().getExtras();
        if(b!=null){
            int a = b.getInt("id");
            String fuego = b.getString("Charmeleon");
            String agua = b.getString("Wartortle");
            String planta = b.getString("Ivasur");
            String electricidad = b.getString("Picachu");

            if(fuego==fuego&&a==1){
                imagen.setImageDrawable(getResources().getDrawable(R.drawable.charizard));
                texto.setText("Charizard");
                abc=1;
            }
            if(planta==planta&&a==2){
                imagen.setImageDrawable(getResources().getDrawable(R.drawable.venusur));
                texto.setText("Venusur");
                abc=2;
            }
            if(electricidad==electricidad&&a==3){
                imagen.setImageDrawable(getResources().getDrawable(R.drawable.raichu));
                texto.setText("Raichu");
                abc=3;
            }
            if(agua==agua&&a==4){
                imagen.setImageDrawable(getResources().getDrawable(R.drawable.blastoise));
                texto.setText("Blastoise");
                abc=4;
            }

            boton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getApplicationContext(),Main4Activity.class);
                    Bundle b = new Bundle();
                    b.putInt("clave",abc);
                    i.putExtras(b);
                    startActivity(i);
                    finish();
                }
            });
        }
    }
}
