package com.edwin;

public class Autor {
    //? Atributos de la clase Autor
    private String nombre;
    private String apellido;
    private Integer edad;

    private static Autor instance;
    //? Contructor privado en vacio
    private Autor(){
        nombre = "Juan";
        apellido = "Torres";
        edad = 25;
    }
    //? Metodo estatico para obtner la unica instancia de Autor
    public static Autor getInstance(){
        //? Si la instancia aun no ha sido creada
        if (instance==null) {
            instance= new Autor();
        }
        //? Retorna la instancia única creada
        return instance;
    }
    //? Retorna la información del Autor (toString)
    public String getInformacion(){
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad;
    }


}
