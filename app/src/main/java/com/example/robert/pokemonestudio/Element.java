package com.example.robert.pokemonestudio;

import android.graphics.drawable.Drawable;

/**
 * Created by Robert on 23/11/2015.
 */
public class Element {

    private int idImagen;
    private String texto;

    public Element(int id,String txt){
        this.idImagen=id;
        this.texto=txt;
    }


    public int getIdImagen() {
        return idImagen;
    }

    public String getTexto() {
        return texto;
    }
}
