package com.edwin.Facade;

import com.edwin.Utils.Cliente;
import com.edwin.Utils.Hotel;

public class ReservaFacade {
    private Cliente cliente;
    private Hotel hotel;

    public ReservaFacade() {
        this.cliente = new Cliente();
        this.hotel = new Hotel();
    }
    //? Metodos para el cliente
    public void realizarReservaCliente(Integer numNoches, String tipoHabitacion, Cliente cliente){
        cliente.realizarReserva(numNoches, tipoHabitacion);

    }
    public void modificarReservaCliente(Integer numNoches, String tipoHabitacion, Integer nuevaNoche){
        cliente.modificarReserva(numNoches, tipoHabitacion, nuevaNoche);
    }
    public void cancelarReservaCliente(Integer numNoches, String tipoHabitacion){
        cliente.cancelarReserva(numNoches, tipoHabitacion);
    }
    public void consultarDisponibilidadCliente(String tipoHabitacion){
        cliente.consultarDisponibilidad(tipoHabitacion);
    }

    //? Metodos para el hotel
    public void realizarReservaHotel(Integer numNoches, String tipoHabitacion, Hotel hotel){
        hotel.realizarReserva(numNoches, tipoHabitacion);

    }
    public void modificarReservaHotel(Integer numNoches, String tipoHabitacion, Integer nuevaNoche){
        hotel.modificarReserva(numNoches, tipoHabitacion, nuevaNoche);
    }
    public void cancelarReservaHotel(Integer numNoches, String tipoHabitacion){
        hotel.cancelarReserva(numNoches, tipoHabitacion);
    }
    public void consultarDisponibilidadHotel(String tipoHabitacion){
        hotel.consultarDisponibilidad(tipoHabitacion);
    }



}
