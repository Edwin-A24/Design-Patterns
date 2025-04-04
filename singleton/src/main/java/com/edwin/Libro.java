package com.edwin;

public class Libro {
    //? Metodo que consulta el Autor y su inforamción
    public void consultarAutor(){
        System.out.println("El autor del libro es: "+Autor.getInstance().getInformacion());
    }

}
