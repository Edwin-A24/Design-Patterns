package com.edwin;

public class Main {
    public static void main(String[] args) {
        //? Obtener la instacia única del autor
        Autor autor1 = Autor.getInstance();
        System.out.println("Autor 1:\n"+autor1.getInformacion());
        System.out.println("--------------------------");
        //? Obtener la instacia única del autor
        Autor autor2 = Autor.getInstance();
        System.out.println("Autor 2:\n"+autor2.getInformacion());
        articulo();

        Tesis tesis = new Tesis();
        tesis.consultarAutor();
        
        Libro libro = new Libro();
        libro.consultarAutor();
    }
    public static void articulo() {
        System.out.println("Estoy desde el metodo articulo y el autor es: "+Autor.getInstance().getInformacion());
    }
}