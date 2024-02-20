/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.modelo;
import Vista.Vista;

/**
 *
 * @author niko2
 */
public class Controlador {
    
    private modelo cuenta;
    private Vista vista;

    public Controlador() {
        cuenta = new modelo("123456", "Juan Pérez");
        vista = new Vista();
    }

    public void ejecutar() {
        while (true) {
            int opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: $" + cuenta.consultarSaldo());
                    break;
                case 2:
                    double deposito = vista.leerCantidad();
                    cuenta.depositar(deposito);
                    System.out.println("Deposito realizado correctamente.");
                    break;
                case 3:
                    double retiro = vista.leerCantidad();
                    if (cuenta.retirar(retiro)) {
                        System.out.println("Retiro realizado correctamente.");
                    } else {
                        System.out.println("Saldo insuficiente para realizar el retiro.");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar nuestra aplicación");
                    System.exit(0);
                default:
                    System.out.println("Opción no valida. Intente nuevamente.");
            }
        }
    }

    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        controlador.ejecutar();
    }
}
