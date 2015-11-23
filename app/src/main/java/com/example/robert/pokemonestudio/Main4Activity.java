package com.example.robert.pokemonestudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {

    private ListView lista;
    private ArrayList<Element> fuego;
    private ArrayList<Element> agua;
    private ArrayList<Element> electricidad;
    private ArrayList<Element> planta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        rellena();
    }

    public void iniVariables(){
        lista = (ListView) findViewById(R.id.listView);
        fuego = new ArrayList<Element>();
        fuego.add(new Element(R.drawable.charmander,"1º"));
        fuego.add(new Element(R.drawable.charmilion,"2º"));
        fuego.add(new Element(R.drawable.charizard,"3º"));
        agua = new ArrayList<Element>();
        agua.add(new Element(R.drawable.squirtle,"1º"));
        agua.add(new Element(R.drawable.squirtlee,"2º"));
        agua.add(new Element(R.drawable.blastoise,"3º"));
        electricidad = new ArrayList<Element>();
        electricidad.add(new Element(R.drawable.pichu,"1º"));
        electricidad.add(new Element(R.drawable.picachu,"2º"));
        electricidad.add(new Element(R.drawable.raichu,"3º"));
        planta = new ArrayList<Element>();
        planta.add(new Element(R.drawable.bulbasur,"1º"));
        planta.add(new Element(R.drawable.ivasur,"2º"));
        planta.add(new Element(R.drawable.venusur,"3º"));
    }

    public void rellena(){
        iniVariables();
        Bundle b = getIntent().getExtras();
        if(b!=null){
            int a = b.getInt("clave");
            if(a==1){
                lista.setAdapter(new AdaptadorLista(this, R.layout.element, fuego) {

                    public void onEntrada(Object entrada, View view) {

                        if (entrada != null) {

                            ImageView imagen1 = (ImageView) view.findViewById(R.id.imageView);
                            if (imagen1 != null)
                                imagen1.setImageResource(((Element) entrada).getIdImagen());

                            TextView text = (TextView) view.findViewById(R.id.textView2);
                            if (text != null)
                                text.setText(((Element) entrada).getTexto());
                        }
                    }
                });
            }

            if(a==2){
                lista.setAdapter(new AdaptadorLista(this, R.layout.element, planta) {

                    public void onEntrada(Object entrada, View view) {

                        if (entrada != null) {

                            ImageView imagen1 = (ImageView) view.findViewById(R.id.imageView);
                            if (imagen1 != null)
                                imagen1.setImageResource(((Element) entrada).getIdImagen());

                            TextView text = (TextView) view.findViewById(R.id.textView2);
                            if (text != null)
                                text.setText(((Element) entrada).getTexto());
                        }
                    }
                });
            }

            if(a==3){
                lista.setAdapter(new AdaptadorLista(this, R.layout.element, electricidad) {

                    public void onEntrada(Object entrada, View view) {

                        if (entrada != null) {

                            ImageView imagen1 = (ImageView) view.findViewById(R.id.imageView);
                            if (imagen1 != null)
                                imagen1.setImageResource(((Element) entrada).getIdImagen());

                            TextView text = (TextView) view.findViewById(R.id.textView2);
                            if (text != null)
                                text.setText(((Element) entrada).getTexto());
                        }
                    }
                });
            }

            if(a==4){
                lista.setAdapter(new AdaptadorLista(this, R.layout.element, agua) {

                    public void onEntrada(Object entrada, View view) {

                        if (entrada != null) {

                            ImageView imagen1 = (ImageView) view.findViewById(R.id.imageView);
                            if (imagen1 != null)
                                imagen1.setImageResource(((Element) entrada).getIdImagen());

                            TextView text = (TextView) view.findViewById(R.id.textView2);
                            if (text != null)
                                text.setText(((Element) entrada).getTexto());
                        }
                    }
                });
            }
        }
    }
}
