package com.edwin.Utils;

import com.edwin.Interfaces.IGestionReserva;

public class Hotel implements IGestionReserva {
    private String nombre;
    private String contraseña;

    private static Hotel instance;


    public Hotel() {
        this.nombre = "Edwin_Amezquita";
        this.contraseña = "san12345";
    }

    public static Hotel getInstance(){
        if (instance == null) {
            instance = new Hotel();
        }
        return instance;
    }

    public boolean aunteticarAdmin(String NmA, String Pswrd){
        if (NmA.equals(nombre) && Pswrd.equals(contraseña)) {
            System.out.println("\nBienvenido " + NmA);
            System.out.println("Acceso Otorgado");
            return true;
        } else {
            System.out.println("Error de auntenticación !!\n");
            return false;
        }
    }

    @Override
    public void realizarReserva(Integer numNoches, String tipoHabitacion) {
        System.out.println(
                "Hotel ha realizado una reserva por " + numNoches + " noches en habitación " + tipoHabitacion);
    }

    @Override
    public void modificarReserva(Integer numNoches, String tipoHabitacion, Integer nuevaNoche) {
        System.out.println("Hotel a modificado una reserva de " + numNoches + " a " + nuevaNoche
                + " noches de habitación " + tipoHabitacion);
    }

    @Override
    public void cancelarReserva(Integer numNoches, String tipoHabitacion) {
        System.out.println(
                "Hotel ha cancelado una reserva por " + numNoches + " noches en habitación " + tipoHabitacion);
    }

    @Override
    public void consultarDisponibilidad(String tipoHabitacion) {
        System.out.println("Disponibilidad en habitación " + tipoHabitacion + ": disponible");
    }

}
