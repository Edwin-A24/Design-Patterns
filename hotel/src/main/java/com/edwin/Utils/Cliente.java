package com.edwin.Utils;

import com.edwin.Interfaces.IGestionReserva;

public class Cliente implements IGestionReserva {
    @Override
    public void realizarReserva(Integer numNoches, String tipoHabitacion) {
        System.out.println(
                "Cliente ha realizado una reserva por " + numNoches + " noches en habitación "
                        + tipoHabitacion);
    }

    @Override
    public void modificarReserva(Integer numNoches, String tipoHabitacion, Integer nuevaNoche) {
        System.out.println("Cliente a modificado una reserva de " + numNoches + " a " + nuevaNoche
                + " noches de habitación " + tipoHabitacion);
    }

    @Override
    public void cancelarReserva(Integer numNoches, String tipoHabitacion) {
        System.out.println(
                "Cliente ha cancelado una reserva por " + numNoches + " noches en habitación "
                        + tipoHabitacion);
    }

    @Override
    public void consultarDisponibilidad(String tipoHabitacion) {
        System.out.println("Disponibilidad en habitación " + tipoHabitacion + ": disponible");

    }

}
