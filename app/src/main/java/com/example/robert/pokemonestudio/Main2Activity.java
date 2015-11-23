package com.example.robert.pokemonestudio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private RelativeLayout r ;
    private ImageView imagen;
    private TextView texto;
    private int intt;
    private int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        rellena();
    }

    public void iniciaVariables(){
        r=(RelativeLayout)findViewById(R.id.relativeLayaout2);
        imagen=(ImageView)findViewById(R.id.imgSegunda);
        texto=(TextView)findViewById(R.id.lblSegunda);
        intt=0;
        a=0;
    }

    public void rellena(){
        iniciaVariables();
        Bundle b = getIntent().getExtras();
        if(b!=null) {
            String fuego = b.getString("charmander");
            String agua = b.getString("squirtle");
            String planta = b.getString("bulbasur");
            String electricidad = b.getString("pichu");
            int c = b.getInt("car");

            if (fuego == fuego&&c==1) {
                imagen.setImageDrawable(getResources().getDrawable(R.drawable.charmilion));
                texto.setText("Charmeleon");
                intt=1;
            }
            if (planta == planta&&c==2) {
                imagen.setImageDrawable(getResources().getDrawable(R.drawable.ivasur));
                texto.setText("Ivasur");
                intt=2;
            }
            if (electricidad == electricidad&&c==3) {
                imagen.setImageDrawable(getResources().getDrawable(R.drawable.picachu));
                texto.setText("Picachu");
                intt=3;
            }
            if (agua == agua&&c==4) {
                imagen.setImageDrawable(getResources().getDrawable(R.drawable.squirtlee));
                texto.setText("Wartortle");
                intt=4;
            }
        }

        imagen.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(intt==1){

                    a = 1;
                    String fuego = "Charmeleon";
                    Intent i = new Intent(getApplicationContext(), Main3Activity.class);
                    Bundle f = new Bundle();
                    f.putString("Charmeleon", fuego);
                    f.putInt("id", a);
                    i.putExtras(f);
                    startActivity(i);

                }
                if(intt==2){

                    a=2;
                    String planta = "Ivasur";
                    Intent i = new Intent(getApplicationContext(), Main3Activity.class);
                    Bundle f = new Bundle();
                    f.putString("Ivasur", planta);
                    f.putInt("id", a);
                    i.putExtras(f);
                    startActivity(i);

                }
                if(intt==3){

                    a=3;
                    String electricidad = "Picachu";
                    Intent i = new Intent(getApplicationContext(), Main3Activity.class);
                    Bundle f = new Bundle();
                    f.putString("Picachu", electricidad);
                    f.putInt("id", a);
                    i.putExtras(f);
                    startActivity(i);
                }
                if(intt==4){

                    a=4;
                    String agua = "Wartortle";
                    Intent i = new Intent(getApplicationContext(), Main3Activity.class);
                    Bundle f = new Bundle();
                    f.putString("Charmeleon", agua);
                    f.putInt("id",a);
                    i.putExtras(f);
                    startActivity(i);
                }
                return false;
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
