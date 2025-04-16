package com.edwin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = Usuario.getInstance();

        while (true) {
            System.out.println("Bienvenido\nRegistre su usuario aqui:");
            String name = scanner.nextLine();
            System.out.println("Registre su contraseña aqui:");
            String passsword = scanner.nextLine();
            if (usuario.autenticarUsuario(name, passsword) == true) {
                break;
            }
        }
        scanner.close();
    }

}