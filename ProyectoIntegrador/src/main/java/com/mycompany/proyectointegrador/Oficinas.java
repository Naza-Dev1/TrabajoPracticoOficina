
package com.mycompany.proyectointegrador;

// Importamos una libreria de java para el manejo de Arrays
import java.util.ArrayList;

// Importamos una libreria de java para el manejo de Listas
import java.util.List;

public class Oficinas {

    // Metodo main, desde aqui empieza la ejecucion del programa
    public static void main(String[] args) {
        // Create a list of employees

        //
        //
        //
        // Se declara una lista
        // "List" es una interfaz de la libreria
        // "<Employee>" esto indica que la lista solo puede contener objetos de tipo
        // "Employee"
        // "employees" es el nombre de la lista
        // "= new ArrayList<>" a lo anterior le asigna la lista
        // "List.of(" crea una lista temporal para usarla con objetos ya cargados
        // La lista crea objetos con sus parametros.

        List<Employee> employees = new ArrayList<>(
                List.of(
                        // firstName, lastName, age, documentNumber, phoneNumber, address, email, active, salary
                        new Employee("John", "Smith", "jdoe", 1000.0),
                        new Employee("Jane", "Williams", "jane", 2000.0),
                        new Employee("Joe", "Johnson", "joe", 3000.0),
                        new Employee("Jill", "Anderson", "jill", 4000.0),
                        new Employee("Jim", "Brown", "jim", 5000.0),
                        new Employee("Jenny", "Taylor", "jenny", 6000.0),
                        new Employee("Jen", "Clark", "jen", 7000.0),
                        new Employee("Jenny", "Thomas", "jenny", 8000.0),
                        new Employee("Jen", "Wilson", "jen", 9000.0)));

    }
}
