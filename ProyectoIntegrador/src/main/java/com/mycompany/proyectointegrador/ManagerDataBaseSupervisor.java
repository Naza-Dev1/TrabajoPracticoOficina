package com.mycompany.proyectointegrador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManagerDataBaseSupervisor {

    private String archivo;

    public ManagerDataBaseSupervisor(String archivo) {
        this.archivo = archivo;
    }

// Lee el .txt y convierte los datos en una lista con objetos 
    public List<Supervisor> getAllSupervisors() {

        List<Supervisor> supervisors = new ArrayList<>();

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

                    Supervisor sup = new Supervisor(
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

                    supervisors.add(sup);

                } catch (Exception e) {

                    System.out.println("Error procesando linea:");
                    System.out.println(linea);
                }
            }

        } catch (IOException e) {

            e.printStackTrace();
        }

        return supervisors;
    }

    // Guarda los datos en la DB
    public void save(Supervisor nueva) {

        List<Supervisor> supervisors = getAllSupervisors();

        supervisors.add(nueva);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (Supervisor sup : supervisors) {
                bw.write(sup.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ELIMINAR
    public void delete(int idBuscado) {

        List<Supervisor> supervisors = getAllSupervisors();

        supervisors.removeIf(sup -> sup.getId() == idBuscado);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (Supervisor sup : supervisors) {
                bw.write(sup.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // MODIFICAR
    public void update(int idBuscado, String campo, Object nuevoValor) {

        List<Supervisor> supervisors = getAllSupervisors();

        for (Supervisor sup : supervisors) {

            if (sup.getId() == idBuscado) {

                switch (campo) {

                    case "firstName":
                        sup.setFirstName((String) nuevoValor);
                        break;

                    case "lastName":
                        sup.setLastName((String) nuevoValor);
                        break;

                    case "age":
                        sup.setAge((Integer) nuevoValor);
                        break;

                    case "yearsOfExperience":
                        sup.setYearsOfExperience((Integer) nuevoValor);
                        break;

                    case "email":
                        sup.setEmail((String) nuevoValor);
                        break;

                    case "salary":
                        sup.setSalary((Double) nuevoValor);
                        break;

                    case "occupation":
                        sup.setOccupation((String) nuevoValor);
                        break;

                    case "workStatus":
                        sup.setWorStatus((String) nuevoValor);
                        break;

                    default:
                        System.out.println("Campo invalido");
                        return;
                }
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (Supervisor sup : supervisors) {
                bw.write(sup.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // BUSCAR POR ID
    public Supervisor findByID(int idBuscado) {

        List<Supervisor> supervisors = getAllSupervisors();

        for (Supervisor sup : supervisors) {

            if (sup.getId() == idBuscado) {
                return sup;
            }
        }

        return null;
    }

    public void showAll() {

        List<Supervisor> supervisors = getAllSupervisors();

        if (supervisors.isEmpty()) {

            System.out.println("No hay empleados");
            return;
        }

        for (Supervisor sup : supervisors) {

            System.out.println("***** ***** EMPLEADO ID: " + sup.getId() + " ***** ****** ******");
            System.out.println("* First name: " + sup.getFirstName());
            System.out.println("* Last name: " + sup.getLastName());
            System.out.println("* Age: " + sup.getAge());
            System.out.println("* Email: " + sup.getEmail());
            System.out.println("* Years of experience: " + sup.getYearsOfExperience());
            System.out.println("* Occupation: " + sup.getOccupation());
            System.out.println("* Status: " + sup.getWorkStatus());
            System.out.println("* Salary: " + sup.getSalary());
            System.out.println("***** ****** ***** ****** ***** ****** ******\n");
            System.out.println("");

        }
    }

//Recorre las ids buscando la ultima para devolver la misma +1
    private boolean recorridoYaHecho = false;
    private int ultimoId = 0;

    public int getNextId() {

        if (!recorridoYaHecho) {

            List<Supervisor> supervisorss = getAllSupervisors();

            for (Supervisor sup : supervisorss) {

                if (sup.getId() > ultimoId) {

                    ultimoId = sup.getId();
                }
            }

            recorridoYaHecho = true;
        }

        ultimoId++;

        return ultimoId;
    }

}
