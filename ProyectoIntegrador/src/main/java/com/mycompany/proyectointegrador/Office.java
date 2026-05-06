package com.mycompany.proyectointegrador;

//------------------------------------------------------------
//Importamos las librerias necesarias.
//------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//------------------------------------------------------------
//Declaramos a Office como clase publica.
//------------------------------------------------------------
public class Office {

    //------------------------------------------------------------
    //Declaramos el metodo principal "main". 
    //------------------------------------------------------------
    public static void main(String[] args) {

        //------------------------------------------------------------
        //Instanciamos con la libreria Scanner a "input" que nos 
        // permite guadar los datos ingresados del usuario.
        // 
        // Tambien creamos la variable "eleccionUsuario" que contendra
        // lo que el usuario digite.
        //------------------------------------------------------------
        Scanner input = new Scanner(System.in);
        String eleccionUsuarioMenu = "";
        String eleccionUsuarioSubMenu = "";
        Integer id_employee = 10;
        Integer id_supervisor = 10;
        String nombre;
        String apellido;
        Integer edad;
        Integer añosExperincia;
        String email;
        String ocupacion;
        Boolean estaActivo;
        Boolean estaJubilado;
        Double salario;
        //------------------------------------------------------------
        //Creamos e instanciamos la Lista "employees", esta contiene 
        //los datos de los empleados que se le daran al Contructor.
        //------------------------------------------------------------
        List<Employee> employees = new ArrayList<>(
                List.of(
                        new Employee(1, "Andres", "Morales", 28, 5, "andres.morales@company.com", "Employee", true, false, 3200.0),
                        new Employee(2, "Valeria", "Castro", 24, 2, "valeria.castro@company.com", "Employee", true, false, 2500.0),
                        new Employee(3, "Sebastian", "Rojas", 30, 7, "sebastian.rojas@company.com", "Employee", true, false, 4100.0),
                        new Employee(4, "Camila", "Herrera", 27, 4, "camila.herrera@company.com", "Employee", true, false, 3600.0),
                        new Employee(5, "Daniel", "Vega", 22, 1, "daniel.vega@company.com", "Employee", true, false, 2100.0),
                        new Employee(6, "Paula", "Mendoza", 29, 6, "paula.mendoza@company.com", "Employee", true, false, 4300.0),
                        new Employee(7, "Ricardo", "Navarro", 31, 8, "ricardo.navarro@company.com", "Employee", true, false, 4800.0),
                        new Employee(8, "Lucia", "Paredes", 26, 3, "lucia.paredes@company.com", "Employee", true, false, 3400.0),
                        new Employee(9, "Fernando", "Ibarra", 35, 10, "fernando.ibarra@company.com", "Employee", true, false, 5200.0)
                )
        );

        //------------------------------------------------------------
        //Creamos e instanciamos la Lista "supervisors", esta contiene 
        //los datos de los supervisores que se le daran al Contructor.
        //------------------------------------------------------------
        List<Supervisor> supervisors = new ArrayList<>(
                List.of(
                        new Supervisor(1, "Carlos", "Lopez", 35, 10, "carlos.lopez@company.com", "Supervisor", true, false, 8500.0),
                        new Supervisor(2, "Maria", "Gonzalez", 40, 15, "maria.gonzalez@company.com", "Supervisor", true, false, 9500.0),
                        new Supervisor(3, "Luis", "Martinez", 38, 12, "luis.martinez@company.com", "Supervisor", true, false, 9000.0),
                        new Supervisor(4, "Ana", "Rodriguez", 42, 18, "ana.rodriguez@company.com", "Supervisor", true, false, 11000.0),
                        new Supervisor(5, "Pedro", "Sanchez", 37, 11, "pedro.sanchez@company.com", "Supervisor", true, false, 8700.0),
                        new Supervisor(6, "Laura", "Ramirez", 39, 14, "laura.ramirez@company.com", "Supervisor", true, false, 9200.0),
                        new Supervisor(7, "Jorge", "Torres", 45, 20, "jorge.torres@company.com", "Supervisor", true, false, 12000.0),
                        new Supervisor(8, "Sofia", "Flores", 36, 9, "sofia.flores@company.com", "Supervisor", true, false, 8800.0),
                        new Supervisor(9, "Diego", "Vargas", 41, 16, "diego.vargas@company.com", "Supervisor", true, false, 10500.0)
                )
        );

        //------------------------------------------------------------
        //Creamos un bucle while que mostrara el menu del programa.
        //El bucle se detenie si "eleccionUsuario" es igual a 0.
        //------------------------------------------------------------
        while (!eleccionUsuarioMenu.equals("0")) {

            //------------------------------------------------------------
            //Mostramos por pantalla las opciones disponibles del menu.
            //------------------------------------------------------------
            System.out.println("***** MENU DE GESTION DE OFICINA *****");
            System.out.println(" 0. Salir");
            System.out.println(" 1. Agregar un nuevo trabajador");
            System.err.println(" 2. Dar de baja a un trabajador");
            System.err.println(" 3. Dar de alta a un trabajador");
            System.out.println(" 4. Mostrar datos de los trabajadores");
            System.out.println(" 5. Modificar el salario de un trabajador");
            System.out.println(" 6. Modificar el horario de un trabajador");
            System.out.println(" 7. Modificar el email de un trabajador");
            System.out.println(" 8. Ascender un trabajador");
            System.out.println(" 9. Jubilar un trabajador");

            System.out.print("Ingrese una opcion: ");
            eleccionUsuarioMenu = input.nextLine();

            switch (eleccionUsuarioMenu) {

                case "0":
                    System.out.println(" SALIENDO DEL GESTOR DE OFICINA *****");
                    break;

                case "1":
                    eleccionUsuarioSubMenu = "";

                    while (!eleccionUsuarioSubMenu.equals("0")) {

                        System.out.println("***** MENU DE AGREGAR NUEVO TRABAJADOR *****");
                        System.out.println(" 0. Volver al menu principal.");
                        System.out.println(" 1. Agregar un nuevo empleado.");
                        System.out.println(" 2. Agregar un nuevo supervisor.");

                        System.out.print("Ingrese una opcion: ");
                        eleccionUsuarioSubMenu = input.nextLine();

                        switch (eleccionUsuarioSubMenu) {
                            case "0":
                                System.out.println("Volviendo al menu principal");
                                break;

                            case "1":

                                System.out.print("***** AGREGAR UN NUEVO EMPLEADO *****\n");

                                System.out.print("Ingrese el nombre del empleado: ");
                                nombre = input.nextLine();
                                System.out.print("Ingrese el apellido del empleado: ");
                                apellido = input.nextLine();
                                System.out.print("Ingrese la edad del empleado: ");
                                edad = Integer.parseInt(input.nextLine());
                                System.out.print("Ingrese los años de experiencia empleado: ");
                                añosExperincia = Integer.parseInt(input.nextLine());
                                System.out.print("Ingrese el email del empleado: ");
                                email = input.nextLine();
                                System.out.print("Ingrese la ocupacion del empleado: ");
                                ocupacion = input.nextLine();
                                System.out.print("El empleado esta activo: (true o false): ");
                                estaActivo = Boolean.parseBoolean(input.nextLine());
                                System.out.print("El empleado esta jubilado: (true o false): ");
                                estaJubilado = Boolean.parseBoolean(input.nextLine());
                                System.out.print("Ingrese el salario del empleado: ");
                                salario = Double.parseDouble(input.nextLine());

                                employees.add(new Employee(id_employee, nombre, apellido, edad, añosExperincia, email, ocupacion, estaActivo, estaJubilado, salario));
                                id_employee++;
                                break;

                            case "2":
                                System.out.print("***** AGREGAR UN NUEVO SUPERVISOR *****\n");

                                System.out.print("Ingrese el nombre del supervisor: ");
                                nombre = input.nextLine();
                                System.out.print("Ingrese el apellido del supervisor: ");
                                apellido = input.nextLine();
                                System.out.print("Ingrese la edad del supervisor: ");
                                edad = Integer.parseInt(input.nextLine());
                                System.out.print("Ingrese los años de experiencia supervisor: ");
                                añosExperincia = Integer.parseInt(input.nextLine());
                                System.out.print("Ingrese el email del supervisor: ");
                                email = input.nextLine();
                                System.out.print("Ingrese la ocupacion del supervisor: ");
                                ocupacion = input.nextLine();
                                System.out.print("El supervisor esta activo: (true o false): ");
                                estaActivo = Boolean.parseBoolean(input.nextLine());
                                System.out.print("El supervisor esta jubilado: (true o false): ");
                                estaJubilado = Boolean.parseBoolean(input.nextLine());
                                System.out.print("Ingrese el salario del supervisor: ");
                                salario = Double.parseDouble(input.nextLine());

                                supervisors.add(new Supervisor(id_supervisor, nombre, apellido, edad, añosExperincia, email, ocupacion, estaActivo, estaJubilado, salario));
                                id_supervisor++;
                                break;

                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    }
                    break;

                case "2":
                    eleccionUsuarioSubMenu = "";

                    while (!eleccionUsuarioSubMenu.equals("0")) {

                        System.out.println("***** MENU DAR DE BAJA A UN TRABAJADOR *****");
                        System.out.println(" 0. Volver al menu principal.");
                        System.out.println(" 1. Dar de baja a un empleado.");
                        System.out.println(" 2. Dar de baja a un supervisor.");

                        System.out.print("Ingrese una opcion: ");
                        eleccionUsuarioSubMenu = input.nextLine();

                        switch (eleccionUsuarioSubMenu) {
                            case "0":
                                System.out.println("Volviendo al menu principal");
                                break;

                            case "1":
                                System.out.println("***** DAR DE BAJA A UN EMPLEADO *****");
                                break;

                            case "2":
                                System.out.println("***** DAR DE BAJA A UN SUPERVISOR *****");
                                break;

                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    }
                    break;

                case "3":
                    eleccionUsuarioSubMenu = "";

                    while (!eleccionUsuarioSubMenu.equals("0")) {

                        System.out.println("***** MENU DAR DE ALTA A UN TRABAJADOR *****");
                        System.out.println(" 0. Volver al menu principal.");
                        System.out.println(" 1. Dar de alta a un empleado.");
                        System.out.println(" 2. Dar de alta a un supervisor.");

                        System.out.print("Ingrese una opcion: ");
                        eleccionUsuarioSubMenu = input.nextLine();

                        switch (eleccionUsuarioSubMenu) {
                            case "0":
                                System.out.println("Volviendo al menu principal");
                                break;

                            case "1":
                                System.out.println("***** DAR DE ALTA A UN EMPLEADO *****");
                                break;

                            case "2":
                                System.out.println("***** DAR DE ALTA A UN SUPERVISOR *****");
                                break;

                            default:
                                System.out.println("Opcion no valida");
                                break;

                        }
                    }
                    break;

                case "4":
                    eleccionUsuarioSubMenu = "";

                    while (!eleccionUsuarioSubMenu.equals("0")) {

                        System.out.println("***** MENU DE MOSTRAR LOS DATOS DE LOS TRABAJADORES *****");
                        System.out.println(" 0. Volver al menu principal.");
                        System.out.println(" 1. Mostrar datos de los empleados.");
                        System.out.println(" 2. Mostrar datos de los supervisores.");

                        System.out.print("Ingrese una opcion: ");
                        eleccionUsuarioSubMenu = input.nextLine();

                        switch (eleccionUsuarioSubMenu) {
                            case "0":
                                System.out.println("Volviendo al menu principal");
                                break;

                            case "1":
                                System.out.println("***** MOSTRANDO DATOS DE LOS EMPLEADOS *****");
                                for (Employee emp : employees) {
                                    emp.showDates();
                                }
                                break;

                            case "2":
                                System.out.println("***** MOSTRANDO DATOS DE LOS SUPERVISORES *****");
                                for (Supervisor sup : supervisors) {
                                    sup.showDates();
                                }
                                break;

                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }

                    }
                    break;

                case "5":
                    eleccionUsuarioSubMenu = "";

                    while (!eleccionUsuarioSubMenu.equals("0")) {

                        System.out.println("***** MENU DE MODIFICAR EL SALARIO DE UN TRABAJADOR *****");
                        System.out.println(" 0. Volver al menu principal.");
                        System.out.println(" 1. Modificar el salario de un empleado.");
                        System.out.println(" 2. Modificar el salario de un supervisor.");

                        System.out.print("Ingrese una opcion: ");
                        eleccionUsuarioSubMenu = input.nextLine();

                        switch (eleccionUsuarioSubMenu) {
                            case "0":
                                System.out.println("Volviendo al menu principal");
                                break;

                            case "1":
                                System.out.println("***** MODIFICAR EL SALARIO DE UN EMPLEADO *****");

                                break;

                            case "2":
                                System.out.println("***** MODIFICAR EL SALARIO DE UN SUPERVISOR *****");
                                break;

                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }

                    }
                    break;

                case "6":
                    eleccionUsuarioSubMenu = "";

                    while (!eleccionUsuarioSubMenu.equals("0")) {

                        System.out.println("***** MENU DE MODIFICAR EL HORARIO A UN TRABAJADOR *****");
                        System.out.println(" 0. Volver al menu principal.");
                        System.out.println(" 1. Modificar el horario a un empleado.");
                        System.out.println(" 2. Modificar el horario a un supervisor.");

                        System.out.print("Ingrese una opcion: ");
                        eleccionUsuarioSubMenu = input.nextLine();

                        switch (eleccionUsuarioSubMenu) {
                            case "0":
                                System.out.println("Volviendo al menu principal");
                                break;

                            case "1":
                                System.out.println("***** MODIFICAR HORARIO A UN EMPLEADO *****");
                                break;

                            case "2":
                                System.out.println("***** MODIFICAR HORARIO A UN SUPERVISOR *****");
                                break;

                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    }
                    break;

                case "7":
                    eleccionUsuarioSubMenu = "";

                    while (!eleccionUsuarioSubMenu.equals("0")) {

                        System.out.println("***** MENU DE MODIFICAR EL EMAIL A UN TRABAJADOR *****");
                        System.out.println(" 0. Volver al menu principal.");
                        System.out.println(" 1. Modificar el email a un empleado.");
                        System.out.println(" 2. Modificar el email a un supervisor.");

                        System.out.print("Ingrese una opcion: ");
                        eleccionUsuarioSubMenu = input.nextLine();

                        switch (eleccionUsuarioSubMenu) {
                            case "0":
                                System.out.println("Volviendo al menu principal");
                                break;

                            case "1":
                                System.out.println("***** MODIFICAR EMAIL A UN EMPLEADO *****");
                                break;

                            case "2":
                                System.out.println("***** MODIFICAR EMAIL A UN SUPERVISOR *****");
                                break;

                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    }
                    break;

                case "8":
                    eleccionUsuarioSubMenu = "";

                    while (!eleccionUsuarioSubMenu.equals("0")) {

                        System.out.println("***** MENU DE ASCENDER A UN TRABAJADOR *****");
                        System.out.println(" 0. Volver al menu principal.");
                        System.out.println(" 1. Ascender a un empleado.");
                        System.out.println(" 2. Ascender a un supervisor.");

                        System.out.print("Ingrese una opcion: ");
                        eleccionUsuarioSubMenu = input.nextLine();

                        switch (eleccionUsuarioSubMenu) {
                            case "0":
                                System.out.println("Volviendo al menu principal");
                                break;

                            case "1":
                                System.out.println("***** ASCENDER A UN EMPLEADO *****");
                                break;

                            case "2":
                                System.out.println("***** ASCENDER A UN SUPERVISOR *****");
                                break;

                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    }
                    break;

                case "9":
                    eleccionUsuarioSubMenu = "";

                    while (!eleccionUsuarioSubMenu.equals("0")) {

                        System.out.println("***** MENU DE JUBILACION A UN TRABAJADOR *****");
                        System.out.println(" 0. Volver al menu principal.");
                        System.out.println(" 1. Jubilar a un empleado.");
                        System.out.println(" 2. Jubilar a un supervisor.");

                        System.out.print("Ingrese una opcion: ");
                        eleccionUsuarioSubMenu = input.nextLine();

                        switch (eleccionUsuarioSubMenu) {
                            case "0":
                                System.out.println("Volviendo al menu principal");
                                break;

                            case "1":
                                System.out.println("***** JUBILAR A UN EMPLEADO *****");
                                break;

                            case "2":
                                System.out.println("***** JUBILAR A UN SUPERVISOR *****");
                                break;

                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    }
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        input.close();
    }
}

// case "5":
//     System.out.println("***** MOSTRANDO LOS SALARIOS DE LOS EMPLEADOS *****");
//     for (Employee emp : employees) {
//         String nombreCompleto = emp.getFirstName() + " " + emp.getLastName();
//         System.out.println("Empleado: " + nombreCompleto + " | Salario: " + emp.getSalary());
//     }
//     break;
// case "6":
//     System.out.println("***** MOSTRANDO LOS SALARIOS DE LOS SUPERVISORES *****");
//     for (Supervisor sup : supervisors) {
//         String nombreCompleto = sup.getFirstName() + " " + sup.getLastName();
//         System.out.println("Empleado: " + nombreCompleto + " | Salario: " + sup.getSalary());
//     }
                //     break;
