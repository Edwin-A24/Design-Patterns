package com.edwin.Interfaces;

public interface IGestionReserva {
    public void realizarReserva(Integer numNoches, String tipoHabitacion);
    public void modificarReserva(Integer numNoches, String tipoHabitacion, Integer nuevaNoche);
    public void cancelarReserva(Integer numNoches, String tipoHabitacion);
    public void consultarDisponibilidad(String tipoHabitacion);


}
