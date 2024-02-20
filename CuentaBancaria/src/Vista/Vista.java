/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

public class Vista {
    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\nOpciones disponibles:");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Realizar deposito");
        System.out.println("3. Realizar retiro");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción (1/2/3/4): ");
        return scanner.nextInt();
    }

    public double leerCantidad() {
        System.out.print("Ingrese la cantidad: $");
        return scanner.nextDouble();
    }
}
