package com.mycompany.proyectointegrador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManagerDataBaseEmployee {

    private String archivo;

    public ManagerDataBaseEmployee(String archivo) {
        this.archivo = archivo;
    }

// Lee el .txt y convierte los datos en una lista con objetos 
    public List<Employee> getAllEmployees() {

        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                // IGNORAR LINEAS VACIAS
                if (linea.trim().isEmpty()) {
                    continue;
                }

                String[] datos = linea.split(",");

                // VALIDAR CANTIDAD DE COLUMNAS
                if (datos.length != 9) {

                    System.out.println("Linea invalida: " + linea);
                    continue;
                }

                try {

                    int id = Integer.parseInt(datos[0].trim());
                    String firstName = datos[1].trim();
                    String lastName = datos[2].trim();
                    int age = Integer.parseInt(datos[3].trim());
                    int yearsOfExperience = Integer.parseInt(datos[4].trim());
                    String email = datos[5].trim();
                    String occupation = datos[6].trim();
                    String workStatus = datos[7].trim();
                    double salary = Double.parseDouble(datos[8].trim());

                    Employee emp = new Employee(
                            id,
                            firstName,
                            lastName,
                            age,
                            yearsOfExperience,
                            email,
                            occupation,
                            workStatus,
                            salary
                    );

                    employees.add(emp);

                } catch (Exception e) {

                    System.out.println("Error procesando linea:");
                    System.out.println(linea);
                }
            }

        } catch (IOException e) {

            e.printStackTrace();
        }

        return employees;
    }

    // Guarda los datos en la DB
    public void save(Employee nueva) {

        List<Employee> employees = getAllEmployees();

        employees.add(nueva);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (Employee emp : employees) {
                bw.write(emp.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ELIMINAR
    public void delete(int idBuscado) {

        List<Employee> employees = getAllEmployees();

        employees.removeIf(emp -> emp.getId() == idBuscado);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (Employee emp : employees) {
                bw.write(emp.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // MODIFICAR
    public void update(int idBuscado, String campo, Object nuevoValor) {

        List<Employee> employees = getAllEmployees();

        for (Employee emp : employees) {

            if (emp.getId() == idBuscado) {

                switch (campo) {

                    case "firstName":
                        emp.setFirstName((String) nuevoValor);
                        break;

                    case "lastName":
                        emp.setLastName((String) nuevoValor);
                        break;

                    case "age":
                        emp.setAge((Integer) nuevoValor);
                        break;

                    case "yearsOfExperience":
                        emp.setYearsOfExperience((Integer) nuevoValor);
                        break;

                    case "email":
                        emp.setEmail((String) nuevoValor);
                        break;

                    case "salary":
                        emp.setSalary((Double) nuevoValor);
                        break;

                    case "occupation":
                        emp.setOccupation((String) nuevoValor);
                        break;

                    case "workStatus":
                        emp.setWorStatus((String) nuevoValor);
                        break;

                    default:
                        System.out.println("Campo invalido");
                        return;
                }
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (Employee emp : employees) {
                bw.write(emp.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // BUSCAR POR ID
    public Employee findByID(int idBuscado) {

        List<Employee> employees = getAllEmployees();

        for (Employee emp : employees) {

            if (emp.getId() == idBuscado) {
                return emp;
            }
        }

        return null;
    }

    public void showAll() {

        List<Employee> employees = getAllEmployees();

        if (employees.isEmpty()) {

            System.out.println("No hay empleados");
            return;
        }

        for (Employee emp : employees) {

            System.out.println("***** ***** EMPLEADO ID: " + emp.getId() + " ***** ****** ******");
            System.out.println("* First name: " + emp.getFirstName());
            System.out.println("* Last name: " + emp.getLastName());
            System.out.println("* Age: " + emp.getAge());
            System.out.println("* Email: " + emp.getEmail());
            System.out.println("* Years of experience: " + emp.getYearsOfExperience());
            System.out.println("* Occupation: " + emp.getOccupation());
            System.out.println("* Status: " + emp.getWorkStatus());
            System.out.println("* Salary: " + emp.getSalary());
            System.out.println("***** ****** ***** ****** ***** ****** ******\n");
            System.out.println("");

        }
    }

//Recorre las ids buscando la ultima para devolver la misma +1
    private boolean recorridoYaHecho = false;
    private int ultimoId = 0;

    public int getNextId() {

        if (!recorridoYaHecho) {

            List<Employee> employees = getAllEmployees();

            for (Employee emp : employees) {

                if (emp.getId() > ultimoId) {

                    ultimoId = emp.getId();
                }
            }

            recorridoYaHecho = true;
        }

        ultimoId++;

        return ultimoId;
    }

}
