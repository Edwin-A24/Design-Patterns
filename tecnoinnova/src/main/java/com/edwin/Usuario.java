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

    public void autenticarUsuario(String name, String passsword) {

        if (name.equals(nombre) && passsword.equals(contrasenia)) {
            System.out.println("Bienvenido al sistema TECNOINNOVA");
        } else {
            System.out.println("Error Acceso denegado al Sistema");
        }
    }
    public boolean validacion(String name, String password){
        if (name.equals(nombre) && password.equals(contrasenia)) {
            return true;
        } else {
            return false;
        }

    }

    public String getInformacion() {
        return "Nombre: " + nombre + " Contrasenia: " + contrasenia;
    }
}
