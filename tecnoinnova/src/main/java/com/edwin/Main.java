package com.edwin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = Usuario.getInstance();
        boolean validacion;

        do {
            if (validacion = false) {
                System.out.println("Bienvenido\nRegistre su usuario aqui:\n bienvenido nuevamente");
                String name = scanner.nextLine();
                System.out.println("Registre su contraseña aqui:");
                String passsword = scanner.nextLine();
                usuario.autenticarUsuario(name, passsword);
                usuario.validacion(name, passsword);
            }
        } while (validacion = true);

        scanner.close();
    }

}