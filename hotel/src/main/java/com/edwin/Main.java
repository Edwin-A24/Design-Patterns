package com.edwin;

import java.util.Scanner;

import com.edwin.Facade.ReservaFacade;
import com.edwin.Utils.Cliente;
import com.edwin.Utils.Hotel;

public class Main {
    public static void main(String[] args) {
        ReservaFacade reservaFacade = new ReservaFacade();
        Cliente cliente = new Cliente();
        Hotel hotel = new Hotel();
        Scanner sc = new Scanner(System.in);
        int opc = 1;
        System.out.println("Bienvenido! Ingresando al sistema . . .\n");

        while (opc != 0) {
            System.out.println("Seleccione su rol dentro del sistema");
            System.out.println("1. Administrador");
            System.out.println("2. Cliente");
            System.out.println("0. Cerrar");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese su Identificación como Administrador");
                    System.out.print("Nombre de usuario: ");
                    sc.nextLine();
                    String NmA = sc.nextLine();
                    System.out.print("Contraseña: ");
                    String Pswrd = sc.nextLine();
                    if (hotel.aunteticarAdmin(NmA, Pswrd) == true) {
                        BienvenidoAd(hotel, reservaFacade, sc);
                    }
                    break;

                case 2:
                    System.out.println("Ingrese su nombre");
                    sc.nextLine();
                    String NmC = sc.nextLine();
                    System.out.println("\nBienvenido " + NmC);
                    BienvenidoCl(cliente, reservaFacade, sc);
                    break;

                case 0:
                    System.out.println("Gracias por utilizar nuestros servicios de HyJ\n");
                    System.out.println("Saliendo del sistema . . .");
                    break;

                default:
                    System.out.println("¡¡ Opción no válida !!");
                    break;
            }
        }
        sc.close();
    }

    public static void BienvenidoAd(Hotel hotel, ReservaFacade reservaFacade, Scanner sc) {
        while (true) {
            System.out.println("\nHola de nuevo !");
            System.out.println("Bienvenido al sistema del hotel HyJ");
            System.out.println("Registre: ");
            System.out.println("1. Realizar Reserva");
            System.out.println("2. Modificar Reserva");
            System.out.println("3. Cancelar Reserva");
            System.out.println("4. Consultar Reserva");
            System.out.println("0. Salir");
            int slc = sc.nextInt();

            int numNoches;
            String tipoHabitacion;
            int nuevaNoche;
            switch (slc) {

                case 1:
                    System.out.print("Ingrese la cantidad de noches a reservar: ");
                    numNoches = sc.nextInt();
                    System.out.print("Ingrese el tipo de habitación a reservar: ");
                    sc.nextLine();
                    tipoHabitacion = sc.nextLine();
                    System.out.println("__________________________________________");
                    reservaFacade.realizarReservaHotel(numNoches, tipoHabitacion, hotel);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de noches que reservo: ");
                    numNoches = sc.nextInt();
                    System.out.print("Ingrese el tipo de habitación que reservo: ");
                    sc.nextLine();
                    tipoHabitacion = sc.nextLine();
                    System.out.print("Ingrese la nueva cantidad de noches a reservar: ");
                    nuevaNoche = sc.nextInt();
                    System.out.println("__________________________________________");
                    reservaFacade.modificarReservaHotel(numNoches, tipoHabitacion, nuevaNoche);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad de noches que reservo: ");
                    numNoches = sc.nextInt();
                    System.out.print("Ingrese el tipo de habitación que reservo: ");
                    sc.nextLine();
                    tipoHabitacion = sc.nextLine();
                    System.out.println("__________________________________________");

                    reservaFacade.cancelarReservaHotel(numNoches, tipoHabitacion);
                    break;
                case 4:
                    System.out.print("Ingrese el tipo de habitación que esta disponible: ");
                    sc.nextLine();
                    tipoHabitacion = sc.nextLine();
                    System.out.println("__________________________________________");
                    reservaFacade.consultarDisponibilidadHotel(tipoHabitacion);
                    break;
                case 0:
                    System.out.println("Regresando . . ");
                    break;

                default:
                    System.out.println("Error! Opción invalida");
                    break;
            }
            if (slc == 0) {
                break;
            }
        }

    }

    public static void BienvenidoCl(Cliente cliente, ReservaFacade reservaFacade, Scanner sc) {

        while (true) {

            System.out.println("\nBienvenidos al hotel HyJ");
            System.out.println("Seleccione: ");
            System.out.println("1. Realizar Reserva");
            System.out.println("2. Modificar Reserva");
            System.out.println("3. Cancelar Reserva");
            System.out.println("4. Consultar Reserva");
            System.out.println("0. Salir");
            int slc = sc.nextInt();

            int numNoches;
            String tipoHabitacion;
            int nuevaNoche;

            switch (slc) {
                case 1:
                    System.out.println("Ingrese el número de noches a hospedar: ");
                    numNoches = sc.nextInt();
                    System.out.println("Ingrese el tipo de habitación que desea: ");
                    sc.nextLine();
                    tipoHabitacion = sc.nextLine();
                    System.out.println("__________________________________________");
                    reservaFacade.realizarReservaCliente(numNoches, tipoHabitacion, cliente);
                    break;

                case 2:
                    System.out.println("Ingrese el número de noches que había reservado: ");
                    numNoches = sc.nextInt();
                    System.out.println("Ingrese el tipo de habitación que desea cambiar: ");
                    sc.nextLine();
                    tipoHabitacion = sc.nextLine();
                    System.out.println("Ingrese el número de noches a cambiar: ");
                    nuevaNoche = sc.nextInt();
                    System.out.println("__________________________________________");
                    reservaFacade.modificarReservaCliente(numNoches, tipoHabitacion, nuevaNoche);
                    break;

                case 3:
                    System.out.println("Ingrese el número de noches que había reservado: ");
                    numNoches = sc.nextInt();
                    System.out.println("Ingrese el tipo de habitación que habia reservado: ");
                    sc.nextLine();
                    tipoHabitacion = sc.nextLine();
                    System.out.println("__________________________________________");
                    reservaFacade.cancelarReservaCliente(numNoches, tipoHabitacion);
                    break;

                case 4:
                    System.out.println("Ingrese el tipo de habitación para verificar su disponibilidad: ");
                    sc.nextLine();
                    tipoHabitacion = sc.nextLine();
                    reservaFacade.consultarDisponibilidadCliente(tipoHabitacion);
                    break;

                case 0:
                    System.out.println("Regresando . . ");
                    break;

                default:
                    System.out.println("Error! Opción invalida");
                    break;
            }
            if (slc == 0) {
                break;
            }
        }

    }

}