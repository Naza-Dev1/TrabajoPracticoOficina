package com.mycompany.proyectointegrador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Office {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>(
                List.of(
                        new Employee("John", "Smith", "jdoe", 1000.0),
                        new Employee("Jane", "Williams", "jane", 2000.0),
                        new Employee("Joe", "Johnson", "joe", 3000.0),
                        new Employee("Jill", "Anderson", "jill", 4000.0),
                        new Employee("Jim", "Brown", "jim", 5000.0),
                        new Employee("Jenny", "Taylor", "jenny", 6000.0),
                        new Employee("Jen", "Clark", "jen", 7000.0),
                        new Employee("Jenny", "Thomas", "jenny", 8000.0),
                        new Employee("Jen", "Wilson", "jen", 9000.0)
                )
        );

        String eleccionUsuario = "";

        while (!eleccionUsuario.equals("0")) {

            System.out.println("****** Menu del Gestion de Oficina ******");
            System.out.println(" 0. Salir");
            System.out.println(" 1. Agregar un nuevo empleado");
            System.out.println(" 2. Agregar un nuevo supervisor");
            System.out.println("");

            System.out.print("Ingrese una opcion: ");

            eleccionUsuario = input.next();

            switch (eleccionUsuario) {

                case "0":
                    System.out.println("Saliendo del Gestor de Oficina...");
                    break;

                case "1":
                    System.out.println("Opcion 1");
                    break;

                case "2":
                    System.out.println("Opcion 2");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        input.close();
    }
}
