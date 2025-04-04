package com.edwin;

public class Tesis {
    //? Metodo que consulta el Autor y su inforamción
    public void consultarAutor(){
        System.out.println("El autor de la tesis es: "+Autor.getInstance().getInformacion());
    }

}
