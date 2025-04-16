package com.edwin;

public class Usuario {
    // ? Atributos de la clase Usuario
    private String nombre;
    private String contrasenia;

    // ? Instancia privada y estatica que almacena una unica instancia
    private static Usuario instance;

    // ? Contructor privado vacio
    private Usuario() {
        nombre = "angie.suarezr";
        contrasenia = "1234.";
    }

    // ? Metodo estatico para obtener la unica instancia del Usuario
    // ?
    public static Usuario getInstance() {
        if (instance == null) {
            instance = new Usuario();
        }
        return instance;
    }

    public boolean autenticarUsuario(String name, String passsword) {

        if (name.equals(nombre) && passsword.equals(contrasenia)) {
            System.out.println("Bienvenido al sistema TECNOINNOVA");
            return true;
        } else {
            System.out.println("Error Acceso denegado al Sistema");
            return false;
        }
    }
    public String getInformacion() {
        return "Nombre: " + nombre + " Contrasenia: " + contrasenia;
    }
}
