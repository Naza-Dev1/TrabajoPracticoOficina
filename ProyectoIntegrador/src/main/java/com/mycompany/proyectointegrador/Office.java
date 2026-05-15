package com.mycompany.proyectointegrador;

//------------------------------------------------------------
//Importamos las librerias necesarias.
//------------------------------------------------------------
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
        // Instanciamos desde el archivo ManagerDataBaseEmployee a 
        // "DataBaseEmployee", este nos permite hace las operaciones
        // save, update y deleted a la base de datos.
        // 
        // Instanciamos desde el archivo ManagerDataBaseSupervisor a 
        // "DataBaseSupervisor", este nos permite hace las operaciones
        // save, update y deleted a la base de datos.
        // 
        // Tambien creamos la variable "eleccionUsuario" que contendra
        // lo que el usuario digite.
        //------------------------------------------------------------
        ManagerDataBaseEmployee DataBaseEmployee = new ManagerDataBaseEmployee("DataBaseEmployee.txt");
        ManagerDataBaseSupervisor DataBaseSupervisor = new ManagerDataBaseSupervisor("DataBaseSupervisor.txt");

        Scanner input = new Scanner(System.in);
        String eleccionUsuarioMenu = "";
        String eleccionUsuarioSubMenu = "";
        String eleccionUsuarioSubSubMenu = "";

        Integer id_employee;
        Integer id_supervisor = 10;
        String nombre;
        String apellido;
        Integer edad;
        Integer añosExperincia;
        String email;
        String ocupacion;
        String estadoLaboral;
        Double salario;

        //------------------------------------------------------------
        //Creamos un bucle while que mostrara el menu del programa.
        //El bucle se detenie si "eleccionUsuario" es igual a 0.
        //------------------------------------------------------------
        while (!eleccionUsuarioMenu.equals("0")) {

            //------------------------------------------------------------
            //Mostramos por pantalla las opciones disponibles del menu.
            //------------------------------------------------------------
            System.out.println("***** MENU DE GESTION DE OFICINA *****");
            System.out.println("* [0]-> Salir");
            System.out.println("* [1]-> Agregar un nuevo trabajador");
            System.err.println("* [2]-> Eliminar a un trabajador");
            System.err.println("* [3]-> Modificar datos un trabajador");
            System.out.println("* [4]-> Mostrar datos de los trabajadores");
            System.out.println("* [5]-> Libre");
            System.out.println("* [6]-> Libre");
            System.out.println("* [7]-> Libre");
            System.out.println("* [8]-> Libre");
            System.out.println("* [9]-> Libre");

            //------------------------------------------------------------
            //Le pedimos al usuario que ingrese una opcion
            //------------------------------------------------------------
            System.out.print("* Ingrese una opcion: ");
            eleccionUsuarioMenu = input.nextLine();
            System.out.println("");

            //------------------------------------------------------------
            //Segun la eleccion del usuario se lo llevara a uno u otro 
            //menu
            //------------------------------------------------------------
            switch (eleccionUsuarioMenu) {

                //------------------------------------------------------------
                //En caso de elegir 0 se sale del programa
                //------------------------------------------------------------
                case "0":
                    System.out.println("***** SALIENDO DEL GESTOR DE OFICINA *****");
                    break;

                //------------------------------------------------------------
                //En caso de elegir 1 ingresa al menu Agregar Nuevo Trabajador
                //------------------------------------------------------------
                case "1":
                    eleccionUsuarioSubMenu = "";

                    while (!eleccionUsuarioSubMenu.equals("0")) {

                        //------------------------------------------------------------
                        //Mostramos por pantalla las nuevas opciones disponibles del 
                        // submenu.
                        //------------------------------------------------------------
                        System.out.println("***** MENU DE AGREGAR NUEVO TRABAJADOR *****");
                        System.out.println("* [0]-> Volver al menu principal.");
                        System.out.println("* [1]-> Agregar un nuevo empleado.");
                        System.out.println("* [2]-> Agregar un nuevo supervisor.");

                        //------------------------------------------------------------
                        //Le pedimos al usuario que ingrese una opcion
                        //------------------------------------------------------------
                        System.out.print("* Ingrese una opcion: ");
                        eleccionUsuarioSubMenu = input.nextLine();
                        System.out.println("");

                        //------------------------------------------------------------
                        //Segun la eleccion del usuario se ejecutara una u otra seccion
                        // de codigo  
                        //------------------------------------------------------------
                        switch (eleccionUsuarioSubMenu) {

                            //------------------------------------------------------------
                            //Volvemos al Menu inicial
                            //------------------------------------------------------------
                            case "0":
                                System.out.println("* Volviendo al menu principal");
                                System.out.println("");
                                break;

                            //------------------------------------------------------------
                            //Agregamos un nuevo empleado. Se pediran los correspondientes
                            // datos del empleado y se almacenaran en la base de datos.
                            // ------------------------------------------------------------
                            case "1":

                                System.out.println("***** AGREGAR UN NUEVO EMPLEADO *****");

                                id_employee = DataBaseEmployee.getNextId();

                                System.out.print("* Ingrese el nombre del empleado: ");
                                nombre = input.nextLine();

                                System.out.print("* Ingrese el apellido del empleado: ");
                                apellido = input.nextLine();

                                System.out.print("* Ingrese la edad del empleado: ");
                                edad = Integer.parseInt(input.nextLine());

                                System.out.print("* Ingrese los años de experiencia empleado: ");
                                añosExperincia = Integer.parseInt(input.nextLine());

                                System.out.print("* Ingrese el email del empleado: ");
                                email = input.nextLine();

                                System.out.print("* Ingrese la ocupacion del empleado: ");
                                ocupacion = input.nextLine();

                                System.out.print("* Ingrese el estado laboral del empleado ([1]-> Activo [2]-> Suspendido [3]-> Retirado [4]-> Parte medico): ");
                                estadoLaboral = input.nextLine();

                                switch (estadoLaboral) {
                                    case "1":
                                        estadoLaboral = "Active";
                                        break;

                                    case "2":
                                        estadoLaboral = "Suspended";
                                        break;

                                    case "3":
                                        estadoLaboral = "Retired";
                                        break;

                                    case "4":
                                        estadoLaboral = "onMedicalLeave";
                                        break;

                                    default:
                                        estadoLaboral = "Active";
                                        break;
                                }

                                System.out.print("* Ingrese el salario del empleado: ");
                                salario = Double.parseDouble(input.nextLine());

                                DataBaseEmployee.save(new Employee(id_employee, nombre, apellido, edad, añosExperincia, email, ocupacion, estadoLaboral, salario));

                                System.out.println("***** SE AGREGO EL NUEVO EMPLEADO *****");
                                System.out.println("");

                                break;

                            //------------------------------------------------------------
                            //Agregamos un nuevo supervisor. Se pediran los correspondientes
                            // datos del supervisor y se almacenaran en la base de datos.
                            //------------------------------------------------------------
                            case "2":
                                System.out.print("***** AGREGAR UN NUEVO SUPERVISOR *****");

                                id_supervisor = DataBaseSupervisor.getNextId();

                                System.out.print("* Ingrese el nombre del supervisor: ");
                                nombre = input.nextLine();

                                System.out.print("* Ingrese el apellido del supervisor: ");
                                apellido = input.nextLine();

                                System.out.print("Ingrese la edad del supervisor: ");
                                edad = Integer.parseInt(input.nextLine());

                                System.out.print("* Ingrese los años de experiencia supervisor: ");
                                añosExperincia = Integer.parseInt(input.nextLine());

                                System.out.print("* Ingrese el email del supervisor: ");
                                email = input.nextLine();

                                System.out.print("* Ingrese la ocupacion del supervisor: ");
                                ocupacion = input.nextLine();

                                System.out.print("* Ingrese el estado laboral del supervisor ([1]-> Activo [2]-> Suspendido [3]-> Retirado [4]-> Parte medico): ");
                                estadoLaboral = input.nextLine();

                                switch (estadoLaboral) {
                                    case "1":
                                        estadoLaboral = "Active";
                                        break;

                                    case "2":
                                        estadoLaboral = "Suspended";
                                        break;

                                    case "3":
                                        estadoLaboral = "Retired";
                                        break;

                                    case "4":
                                        estadoLaboral = "onMedicalLeave";
                                        break;

                                    default:
                                        estadoLaboral = "Active";
                                        break;
                                }
                                System.out.print("* Ingrese el salario del supervisor: ");
                                salario = Double.parseDouble(input.nextLine());

                                DataBaseSupervisor.save(new Supervisor(id_supervisor, nombre, apellido, edad, añosExperincia, email, ocupacion, estadoLaboral, salario));

                                System.out.println("***** SE AGREGO EL NUEVO SUPERVISOR *****");
                                System.out.println("");

                                break;

                            //------------------------------------------------------------
                            //En caso de elegir una opcion invalida se muestra un mensaje y
                            // se regresa al Submenu
                            //------------------------------------------------------------
                            default:
                                System.out.println("* Opcion no valida");
                                System.out.println("");
                                break;
                        }
                    }
                    break;

                //------------------------------------------------------------
                //En caso de elegir 2 ingresa al Menu dar de baja a un 
                // trabajador
                //------------------------------------------------------------
                case "2":
                    eleccionUsuarioSubMenu = "";

                    while (!eleccionUsuarioSubMenu.equals("0")) {

                        System.out.println("***** MENU ELIMINAR A UN TRABAJADOR *****");
                        System.out.println("* [0]-> Volver al menu principal.");
                        System.out.println("* [1]-> Eliminar a un empleado.");
                        System.out.println("* [2]-> Eliminar a un supervisor.");

                        System.out.print("* Ingrese una opcion: ");
                        eleccionUsuarioSubMenu = input.nextLine();
                        System.out.println("");
                        int idEliminarTrabajador;
                        String confirmarEliminacion;

                        switch (eleccionUsuarioSubMenu) {
                            case "0":
                                System.out.println("* Volviendo al menu principal");
                                System.out.println("");
                                break;

                            case "1":
                                System.out.println("***** ELIMINAR A UN EMPLEADO *****");

                                System.out.print("* Ingrese el ID del empleado: ");
                                idEliminarTrabajador = input.nextInt();
                                input.nextLine();

                                System.out.println("");

                                Employee emp = DataBaseEmployee.findByID(idEliminarTrabajador);

                                if (emp != null) {

                                    System.out.println("***** SE ENCONTRO EL ID: " + idEliminarTrabajador + " *****");

                                    System.out.println(
                                            "* Empleado: "
                                            + emp.getFirstName() + " "
                                            + emp.getLastName()
                                    );

                                    System.out.println("");

                                    System.out.print("* ELIMINAR al empleado: "
                                            + emp.getFirstName() + " "
                                            + emp.getLastName() + "? ([0]-> Cancelar [1]-> Confirmar): ");

                                    confirmarEliminacion = input.nextLine();
                                    System.out.println("");

                                    if (confirmarEliminacion.equals("1")) {
                                        DataBaseEmployee.delete(idEliminarTrabajador);
                                        System.out.println("***** EMPLEADO ELIMINADO EXITOSAMENTE *****");
                                    } else {
                                        System.out.println("***** SE CANCELO LA OPERACION *****");
                                        System.out.println("");
                                        break;
                                    }

                                } else {

                                    System.out.println(
                                            "***** NO SE ENCONTRO EL ID: "
                                            + idEliminarTrabajador
                                            + " *****"
                                    );
                                }

                                System.out.println("");
                                break;

                            case "2":
                                System.out.println("***** ELIMINAR A UN SUPERVISOR *****");

                                System.out.print("* Ingrese el ID del supervisor: ");
                                idEliminarTrabajador = input.nextInt();
                                input.nextLine();

                                System.out.println("");

                                Supervisor sup = DataBaseSupervisor.findByID(idEliminarTrabajador);

                                if (sup != null) {

                                    System.out.println("***** SE ENCONTRO EL ID: " + idEliminarTrabajador + " *****");

                                    System.out.println(
                                            "* Supervisor: "
                                            + sup.getFirstName() + " "
                                            + sup.getLastName()
                                    );

                                    System.out.println("");

                                    System.out.print("* ELIMINAR al supervisor: "
                                            + sup.getFirstName() + " "
                                            + sup.getLastName() + "? ([0]-> Cancelar [1]-> Confirmar): ");

                                    confirmarEliminacion = input.nextLine();
                                    System.out.println("");

                                    if (confirmarEliminacion.equals("1")) {
                                        DataBaseSupervisor.delete(idEliminarTrabajador);
                                        System.out.println("***** SUPERVISOR ELIMINADO EXITOSAMENTE *****");
                                    } else {
                                        System.out.println("***** SE CANCELO LA OPERACION *****");
                                        System.out.println("");
                                        break;
                                    }

                                } else {

                                    System.out.println(
                                            "***** NO SE ENCONTRO EL ID: "
                                            + idEliminarTrabajador
                                            + " *****"
                                    );
                                }

                                System.out.println("");
                                break;

                            default:
                                System.out.println("* Opcion no valida");
                                System.out.println("");
                                break;
                        }
                    }
                    break;
                //------------------------------------------------------------
                //En caso de elegir 3 ingresa al Menu modificar estado a un
                // trabajador 
                //------------------------------------------------------------
                case "3":

                    eleccionUsuarioSubMenu = "";

                    while (!eleccionUsuarioSubMenu.equals("0")) {

                        //------------------------------------------------------------
                        // MENU PRINCIPAL DE MODIFICACION
                        //------------------------------------------------------------
                        System.out.println("***** MODIFICAR DATOS DE UN TRABAJADOR *****");
                        System.out.println("* [0]-> Volver al menu principal.");
                        System.out.println("* [1]-> Modificar nombre de un trabajador");
                        System.out.println("* [2]-> Modificar apellido de un trabajador");
                        System.out.println("* [3]-> Modificar edad de un trabajador");
                        System.out.println("* [4]-> Modificar años de experiencia de un trabajador");
                        System.out.println("* [5]-> Modificar email de un trabajador");
                        System.out.println("* [6]-> Modificar ocupacion de un trabajador");
                        System.out.println("* [7]-> Modificar estado laboral de un trabajador");
                        System.out.println("* [8]-> Modificar salario de un trabajador");

                        System.out.print("* Ingrese una opcion: ");
                        eleccionUsuarioSubMenu = input.nextLine();

                        System.out.println("");

                        switch (eleccionUsuarioSubMenu) {

                            case "0":
                                System.out.println("* Volviendo al menu principal");
                                System.out.println("");
                                break;

                            //------------------------------------------------------------
                            // SUB-SUBMENU case "1" Modificar nombre a un trabajador 
                            //------------------------------------------------------------
                            case "1":

                                eleccionUsuarioSubSubMenu = "";

                                while (!eleccionUsuarioSubSubMenu.equals("0")) {

                                    System.out.println("***** MODIFICAR NOMBRE DE UN TRABAJADOR *****");
                                    System.out.println("* [0]-> Volver al menu de modificacion.");
                                    System.out.println("* [1]-> Modificar nombre de un empleado");
                                    System.out.println("* [2]-> Modificar nombre de un supervisor");

                                    System.out.print("* Ingrese una opcion: ");
                                    eleccionUsuarioSubSubMenu = input.nextLine();
                                    System.out.println("");

                                    int idModificarNombre;

                                    switch (eleccionUsuarioSubSubMenu) {

                                        case "0":

                                            System.out.println("* Volviendo al menu de modificacion");
                                            System.out.println("");
                                            break;

                                        case "1":

                                            System.out.println("***** MODIFICAR NOMBRE A UN EMPLEADO *****");

                                            System.out.print("* Ingrese el ID del empleado: ");
                                            idModificarNombre = input.nextInt();
                                            input.nextLine();

                                            System.out.println("");

                                            Employee emp = DataBaseEmployee.findByID(idModificarNombre);

                                            if (emp != null) {

                                                System.out.println("***** SE ENCONTRO EL ID: " + idModificarNombre + " *****");

                                                System.out.println(
                                                        "* Empleado: "
                                                        + emp.getFirstName() + " "
                                                        + emp.getLastName()
                                                        + " * Nombre actual: "
                                                        + emp.getFirstName()
                                                );

                                                System.out.println("");

                                                System.out.print("*Ingrese el nuevo nombre del empleado: ");
                                                String nuevoNombreEmpleado = input.nextLine();

                                                System.out.println("");

                                                DataBaseEmployee.update(idModificarNombre, "firstName", nuevoNombreEmpleado);

                                                System.out.println("***** NOMBRE MODIFICADO EXITOSAMENTE *****");

                                            } else {

                                                System.out.println(
                                                        "***** NO SE ENCONTRO EL ID: "
                                                        + idModificarNombre
                                                        + " *****"
                                                );
                                            }

                                            System.out.println("");
                                            break;

                                        case "2":
                                            System.out.println("***** MODIFICAR NOMBRE A UN SUPERVISOR *****");
                                            System.out.print("* Ingrese el ID del supervisor: ");
                                            idModificarNombre = input.nextInt();
                                            input.nextLine();

                                            System.out.println("");

                                            Supervisor sup = DataBaseSupervisor.findByID(idModificarNombre);

                                            if (sup != null) {

                                                System.out.println("***** SE ENCONTRO EL ID: " + idModificarNombre + " *****");

                                                System.out.println(
                                                        "Supervisor: "
                                                        + sup.getFirstName() + " "
                                                        + sup.getLastName()
                                                        + " * Nombre actual: "
                                                        + sup.getFirstName()
                                                );

                                                System.out.println("");

                                                System.out.print("* Ingrese el nuevo nombre del supervisor: ");
                                                String nuevoNombreSupervisor = input.nextLine();

                                                System.out.println("");

                                                DataBaseSupervisor.update(idModificarNombre, "firstName", nuevoNombreSupervisor);

                                                System.out.println("***** NOMBRE MODIFICADO EXITOSAMENTE *****");

                                            } else {

                                                System.out.println(
                                                        "***** NO SE ENCONTRO EL ID: "
                                                        + idModificarNombre
                                                        + " *****"
                                                );
                                            }

                                            System.out.println("");
                                            break;

                                        default:

                                            System.out.println("* Opcion no valida");
                                            System.out.println("");
                                            break;
                                    }
                                }

                                break;

                            //------------------------------------------------------------
                            // SUB-SUBMENU case "2" Modificar apellido a un trabajador
                            //------------------------------------------------------------
                            case "2":

                                eleccionUsuarioSubSubMenu = "";

                                while (!eleccionUsuarioSubSubMenu.equals("0")) {

                                    System.out.println("***** MODIFICAR APELLIDO DE UN TRABAJADOR *****");
                                    System.out.println("* [0]-> Volver al menu de modificacion.");

                                    System.out.println("* [1]-> Modificar apellido de un empleado");
                                    System.out.println("* [2]-> Modificar apellido de un supervisor");

                                    System.out.print("* Ingrese una opcion: ");
                                    eleccionUsuarioSubSubMenu = input.nextLine();
                                    System.out.println("");

                                    int idModificarApellido;

                                    switch (eleccionUsuarioSubSubMenu) {

                                        case "0":
                                            System.out.println("* Volviendo al menu de modificacion");
                                            System.out.println("");
                                            break;

                                        case "1":
                                            System.out.println("***** MODIFICAR APELLIDO A UN EMPLEADO *****");
                                            System.out.print("* Ingrese el ID del empleado: ");
                                            idModificarApellido = input.nextInt();
                                            input.nextLine();
                                            System.out.println("");

                                            Employee emp = DataBaseEmployee.findByID(idModificarApellido);

                                            if (emp != null) {

                                                System.out.println("***** SE ENCONTRO EL ID: " + idModificarApellido + " *****");

                                                System.out.println(
                                                        "* Empleado: "
                                                        + emp.getFirstName() + " "
                                                        + emp.getLastName()
                                                        + " * Apellido actual: "
                                                        + emp.getLastName()
                                                );

                                                System.out.println("");

                                                System.out.print("*Ingrese el nuevo apellido del empleado: ");
                                                String nuevoApellidoEmpleado = input.nextLine();

                                                System.out.println("");

                                                DataBaseEmployee.update(idModificarApellido, "lastName", nuevoApellidoEmpleado);

                                                System.out.println("***** APELLIDO MODIFICADO EXITOSAMENTE *****");

                                            } else {

                                                System.out.println(
                                                        "***** NO SE ENCONTRO EL ID: "
                                                        + idModificarApellido
                                                        + " *****"
                                                );
                                            }

                                            System.out.println("");
                                            break;

                                        case "2":
                                            System.out.println("***** MODIFICAR APELLIDO A UN SUPERVISOR *****");
                                            System.out.print("* Ingrese el ID del supervisor: ");
                                            idModificarApellido = input.nextInt();
                                            input.nextLine();

                                            System.out.println("");

                                            Supervisor sup = DataBaseSupervisor.findByID(idModificarApellido);

                                            if (sup != null) {

                                                System.out.println("***** SE ENCONTRO EL ID: " + idModificarApellido + " *****");

                                                System.out.println(
                                                        "Supervisor: "
                                                        + sup.getFirstName() + " "
                                                        + sup.getLastName()
                                                        + " * Apellido actual: "
                                                        + sup.getLastName()
                                                );

                                                System.out.println("");

                                                System.out.print("* Ingrese el nuevo apellido del supervisor: ");
                                                String nuevoApellidoSupervisor = input.nextLine();

                                                System.out.println("");

                                                DataBaseSupervisor.update(idModificarApellido, "lastName", nuevoApellidoSupervisor);

                                                System.out.println("***** APELLIDO MODIFICADO EXITOSAMENTE *****");

                                            } else {

                                                System.out.println(
                                                        "***** NO SE ENCONTRO EL ID: "
                                                        + idModificarApellido
                                                        + " *****"
                                                );
                                            }

                                            System.out.println("");
                                            break;

                                        default:

                                            System.out.println("* Opcion no valida");
                                            System.out.println("");
                                            break;
                                    }
                                }

                                break;
                            //------------------------------------------------------------
                            // SUB-SUBMENU case "3" Modificar edad a un trabajador
                            //------------------------------------------------------------
                            case "3":

                                eleccionUsuarioSubSubMenu = "";

                                while (!eleccionUsuarioSubSubMenu.equals("0")) {

                                    System.out.println("***** MODIFICAR EDAD DE UN TRABAJADOR *****");
                                    System.out.println("* [0]-> Volver al menu de modificacion.");
                                    System.out.println("* [1]-> Modificar edad de un empleado");
                                    System.out.println("* [2]-> Modificar edad de un supervisor");

                                    System.out.print("* Ingrese una opcion: ");
                                    eleccionUsuarioSubSubMenu = input.nextLine();

                                    System.out.println("");
                                    int idModificarEdad;

                                    switch (eleccionUsuarioSubSubMenu) {

                                        case "0":

                                            System.out.println("* Volviendo al menu de modificacion");

                                            System.out.println("");
                                            break;

                                        case "1":
                                            System.out.println("***** MODIFICAR EDAD A UN EMPLEADO *****");
                                            System.out.print("* Ingrese el ID del empleado: ");
                                            idModificarEdad = input.nextInt();
                                            input.nextLine();
                                            System.out.println("");

                                            Employee emp = DataBaseEmployee.findByID(idModificarEdad);

                                            if (emp != null) {

                                                System.out.println("***** SE ENCONTRO EL ID: " + idModificarEdad + " *****");

                                                System.out.println(
                                                        "* Empleado: "
                                                        + emp.getFirstName() + " "
                                                        + emp.getLastName()
                                                        + " * Edad actual: "
                                                        + emp.getAge()
                                                );

                                                System.out.println("");

                                                System.out.print("*Ingrese la nueva edad del empleado: ");
                                                int nuevoEdadEmpleado = Integer.parseInt(input.nextLine());

                                                System.out.println("");

                                                DataBaseEmployee.update(idModificarEdad, "age", nuevoEdadEmpleado);

                                                System.out.println("***** EDAD MODIFICADO EXITOSAMENTE *****");

                                            } else {

                                                System.out.println(
                                                        "***** NO SE ENCONTRO EL ID: "
                                                        + idModificarEdad
                                                        + " *****"
                                                );
                                            }

                                            System.out.println("");
                                            break;

                                        case "2":
                                            System.out.println("***** MODIFICAR EDAD A UN SUPERVISOR *****");
                                            System.out.print("* Ingrese el ID del supervisor: ");
                                            idModificarEdad = input.nextInt();
                                            input.nextLine();

                                            System.out.println("");

                                            Supervisor sup = DataBaseSupervisor.findByID(idModificarEdad);

                                            if (sup != null) {

                                                System.out.println("***** SE ENCONTRO EL ID: " + idModificarEdad + " *****");

                                                System.out.println(
                                                        "Supervisor: "
                                                        + sup.getFirstName() + " "
                                                        + sup.getLastName()
                                                        + " * Edad actual: "
                                                        + sup.getAge()
                                                );

                                                System.out.println("");

                                                System.out.print("* Ingrese la nueva edad del supervisor: ");
                                                int nuevoEdadSupervisor = Integer.parseInt(input.nextLine());

                                                System.out.println("");

                                                DataBaseSupervisor.update(idModificarEdad, "age", nuevoEdadSupervisor);

                                                System.out.println("***** EDAD MODIFICADO EXITOSAMENTE *****");

                                            } else {

                                                System.out.println(
                                                        "***** NO SE ENCONTRO EL ID: "
                                                        + idModificarEdad
                                                        + " *****"
                                                );
                                            }

                                            System.out.println("");
                                            break;

                                        default:

                                            System.out.println("* Opcion no valida");
                                            System.out.println("");
                                            break;
                                    }
                                }

                                break;

                            //------------------------------------------------------------
                            // SUB-SUBMENU case "4" Modificar años de experiencia a un trabajador
                            //------------------------------------------------------------
                            case "4":

                                eleccionUsuarioSubSubMenu = "";

                                while (!eleccionUsuarioSubSubMenu.equals("0")) {

                                    System.out.println("***** MODIFICAR ANNOS DE EXPERIENCIA DE UN TRABAJADOR *****");
                                    System.out.println("* [0]-> Volver al menu de modificacion.");
                                    System.out.println("* [1]-> Modificar annos de experiencia de un empleado");
                                    System.out.println("* [2]-> Modificar annos de experiencia de un supervisor");

                                    System.out.print("* Ingrese una opcion: ");
                                    eleccionUsuarioSubSubMenu = input.nextLine();
                                    System.out.println("");

                                    int idModificarAnnosDeExperiencia;

                                    switch (eleccionUsuarioSubSubMenu) {

                                        case "0":

                                            System.out.println("* Volviendo al menu de modificacion");

                                            System.out.println("");
                                            break;

                                        case "1":
                                            System.out.println("***** MODIFICAR ANNOS DE EXPERIENCIA A UN EMPLEADO *****");
                                            System.out.print("* Ingrese el ID del empleado: ");
                                            idModificarAnnosDeExperiencia = input.nextInt();
                                            input.nextLine();
                                            System.out.println("");

                                            Employee emp = DataBaseEmployee.findByID(idModificarAnnosDeExperiencia);

                                            if (emp != null) {

                                                System.out.println("***** SE ENCONTRO EL ID: " + idModificarAnnosDeExperiencia + " *****");

                                                System.out.println(
                                                        "* Empleado: "
                                                        + emp.getFirstName() + " "
                                                        + emp.getLastName()
                                                        + " * Annos de experiencia actual: "
                                                        + emp.getYearsOfExperience()
                                                );

                                                System.out.println("");

                                                System.out.print("*Ingrese la nueva cantidad de annos de experiencia del empleado: ");
                                                int nuevoAnnoExperienciaEmpleado = Integer.parseInt(input.nextLine());

                                                System.out.println("");

                                                DataBaseEmployee.update(idModificarAnnosDeExperiencia, "yearsOfExperience", nuevoAnnoExperienciaEmpleado);

                                                System.out.println("***** ANNOS DE EXPERIENCIA MODIFICADO EXITOSAMENTE *****");

                                            } else {

                                                System.out.println(
                                                        "***** NO SE ENCONTRO EL ID: "
                                                        + idModificarAnnosDeExperiencia
                                                        + " *****"
                                                );
                                            }

                                            System.out.println("");
                                            break;

                                        case "2":
                                            System.out.println("***** MODIFICAR ANNOS DE EXPERIENCIA A UN SUPERVISOR *****");
                                            System.out.print("* Ingrese el ID del supervisor: ");
                                            idModificarAnnosDeExperiencia = input.nextInt();
                                            input.nextLine();

                                            System.out.println("");

                                            Supervisor sup = DataBaseSupervisor.findByID(idModificarAnnosDeExperiencia);

                                            if (sup != null) {

                                                System.out.println("***** SE ENCONTRO EL ID: " + idModificarAnnosDeExperiencia + " *****");

                                                System.out.println(
                                                        "Supervisor: "
                                                        + sup.getFirstName() + " "
                                                        + sup.getLastName()
                                                        + " * Edad actual: "
                                                        + sup.getYearsOfExperience()
                                                );

                                                System.out.println("");

                                                System.out.print("* Ingrese la nueva cantidad de annos de experiencia del supervisor: ");
                                                int nuevoAnnoExperienciaSupervisor = Integer.parseInt(input.nextLine());

                                                System.out.println("");

                                                DataBaseSupervisor.update(idModificarAnnosDeExperiencia, "yearOfExperiencie", nuevoAnnoExperienciaSupervisor);

                                                System.out.println("***** ANNOS DE EXPERIENCIA MODIFICADO EXITOSAMENTE *****");

                                            } else {

                                                System.out.println(
                                                        "***** NO SE ENCONTRO EL ID: "
                                                        + idModificarAnnosDeExperiencia
                                                        + " *****"
                                                );
                                            }

                                            System.out.println("");
                                            break;

                                        default:

                                            System.out.println("* Opcion no valida");
                                            System.out.println("");
                                            break;
                                    }
                                }

                                break;

                            //------------------------------------------------------------
                            // SUB-SUBMENU case "5" Modificar email a un trabajador
                            //------------------------------------------------------------
                            case "5":

                                eleccionUsuarioSubSubMenu = "";

                                while (!eleccionUsuarioSubSubMenu.equals("0")) {

                                    System.out.println("***** MODIFICAR EMAIL DE UN TRABAJADOR *****");
                                    System.out.println("* [0]-> Volver al menu de modificacion.");
                                    System.out.println("* [1]-> Modificar email de un empleado");
                                    System.out.println("* [2]-> Modificar email de un supervisor");

                                    System.out.print("* Ingrese una opcion: ");
                                    eleccionUsuarioSubSubMenu = input.nextLine();
                                    System.out.println("");

                                    int idModificarEmail;

                                    switch (eleccionUsuarioSubSubMenu) {

                                        case "0":

                                            System.out.println("* Volviendo al menu principal");

                                            System.out.println("");
                                            break;

                                        case "1":

                                            System.out.println("***** MODIFICAR EMAIL A UN EMPLEADO *****");

                                            System.out.print("* Ingrese el ID del empleado: ");
                                            idModificarEmail = input.nextInt();
                                            input.nextLine();

                                            System.out.println("");

                                            Employee emp = DataBaseEmployee.findByID(idModificarEmail);

                                            if (emp != null) {

                                                System.out.println("***** SE ENCONTRO EL ID: " + idModificarEmail + " *****");

                                                System.out.println(
                                                        "* Empleado: "
                                                        + emp.getFirstName() + " "
                                                        + emp.getLastName()
                                                        + " * Email actual: "
                                                        + emp.getEmail()
                                                );

                                                System.out.println("");

                                                System.out.print("*Ingrese el nuevo email del empleado: ");
                                                String nuevoEmailEmpleado = input.nextLine();

                                                System.out.println("");

                                                DataBaseEmployee.update(idModificarEmail, "email", nuevoEmailEmpleado);

                                                System.out.println("***** EMAIL MODIFICADO EXITOSAMENTE *****");

                                            } else {

                                                System.out.println(
                                                        "***** NO SE ENCONTRO EL ID: "
                                                        + idModificarEmail
                                                        + " *****"
                                                );
                                            }

                                            System.out.println("");
                                            break;

                                        case "2":
                                            System.out.println("***** MODIFICAR EMAIL A UN SUPERVISOR *****");
                                            System.out.print("* Ingrese el ID del supervisor: ");
                                            idModificarEmail = input.nextInt();
                                            input.nextLine();

                                            System.out.println("");

                                            Supervisor sup = DataBaseSupervisor.findByID(idModificarEmail);

                                            if (sup != null) {

                                                System.out.println("***** SE ENCONTRO EL ID: " + idModificarEmail + " *****");

                                                System.out.println(
                                                        "Supervisor: "
                                                        + sup.getFirstName() + " "
                                                        + sup.getLastName()
                                                        + " * Email actual: "
                                                        + sup.getEmail()
                                                );

                                                System.out.println("");

                                                System.out.print("* Ingrese el nuevo email del supervisor: ");
                                                String nuevoEmailSupervisor = input.nextLine();

                                                System.out.println("");

                                                DataBaseSupervisor.update(idModificarEmail, "email", nuevoEmailSupervisor);

                                                System.out.println("***** EMAIL MODIFICADO EXITOSAMENTE *****");

                                            } else {

                                                System.out.println(
                                                        "***** NO SE ENCONTRO EL ID: "
                                                        + idModificarEmail
                                                        + " *****"
                                                );
                                            }

                                            System.out.println("");
                                            break;

                                        default:

                                            System.out.println("* Opcion no valida");
                                            System.out.println("");
                                            break;
                                    }
                                }

                                break;
                            //------------------------------------------------------------
                            // SUB-SUBMENU case "6" Modificar ocupacion a un trabajador
                            //------------------------------------------------------------
                            case "6":

                                eleccionUsuarioSubSubMenu = "";

                                while (!eleccionUsuarioSubSubMenu.equals("0")) {

                                    System.out.println("***** MODIFICAR OCUPACION DE UN TRABAJADOR *****");
                                    System.out.println("* [0]-> Volver al menu de modificacion.");
                                    System.out.println("* [1]-> Modificar ocupacion de un empleado");
                                    System.out.println("* [2]-> Modificar ocupacion de un supervisor");

                                    System.out.print("* Ingrese una opcion: ");
                                    eleccionUsuarioSubSubMenu = input.nextLine();

                                    System.out.println("");
                                    int idModificarOcupacion;

                                    switch (eleccionUsuarioSubSubMenu) {

                                        case "0":

                                            System.out.println("* Volviendo al menu de modificacion");

                                            System.out.println("");
                                            break;

                                        case "1":
                                            System.out.println("***** MODIFICAR OCUPACION A UN EMPLEADO *****");
                                            System.out.print("* Ingrese el ID del empleado: ");
                                            idModificarOcupacion = input.nextInt();
                                            input.nextLine();
                                            System.out.println("");

                                            Employee emp = DataBaseEmployee.findByID(idModificarOcupacion);

                                            if (emp != null) {

                                                System.out.println("***** SE ENCONTRO EL ID: " + idModificarOcupacion + " *****");

                                                System.out.println(
                                                        "* Empleado: "
                                                        + emp.getFirstName() + " "
                                                        + emp.getLastName()
                                                        + " * Ocupacion actual: "
                                                        + emp.getOccupation()
                                                );

                                                System.out.println("");

                                                System.out.print("*Ingrese la nueva ocupacion del empleado: ");
                                                String nuevoOcupacionEmpleado = input.nextLine();

                                                System.out.println("");

                                                DataBaseEmployee.update(idModificarOcupacion, "occupation", nuevoOcupacionEmpleado);

                                                System.out.println("***** OCUPACION MODIFICADO EXITOSAMENTE *****");

                                            } else {

                                                System.out.println(
                                                        "***** NO SE ENCONTRO EL ID: "
                                                        + idModificarOcupacion
                                                        + " *****"
                                                );
                                            }

                                            System.out.println("");
                                            break;

                                        case "2":
                                            System.out.println("***** MODIFICAR OCUPACION A UN SUPERVISOR *****");
                                            System.out.print("* Ingrese el ID del supervisor: ");
                                            idModificarOcupacion = input.nextInt();
                                            input.nextLine();

                                            System.out.println("");

                                            Supervisor sup = DataBaseSupervisor.findByID(idModificarOcupacion);

                                            if (sup != null) {

                                                System.out.println("***** SE ENCONTRO EL ID: " + idModificarOcupacion + " *****");

                                                System.out.println(
                                                        "Supervisor: "
                                                        + sup.getFirstName() + " "
                                                        + sup.getLastName()
                                                        + " * Ocupacion actual: "
                                                        + sup.getOccupation()
                                                );

                                                System.out.println("");

                                                System.out.print("* Ingrese la nueva ocupacion del supervisor: ");
                                                String nuevoOcupacionSupervisor = input.nextLine();

                                                System.out.println("");

                                                DataBaseSupervisor.update(idModificarOcupacion, "occupation", nuevoOcupacionSupervisor);

                                                System.out.println("***** OCUPACION MODIFICADO EXITOSAMENTE *****");

                                            } else {

                                                System.out.println(
                                                        "***** NO SE ENCONTRO EL ID: "
                                                        + idModificarOcupacion
                                                        + " *****"
                                                );
                                            }

                                            System.out.println("");
                                            break;

                                        default:

                                            System.out.println("* Opcion no valida");
                                            System.out.println("");
                                            break;
                                    }
                                }

                                break;

                            //------------------------------------------------------------
                            // SUB-SUBMENU case "7" Modificar estado laboral a un trabajador
                            //------------------------------------------------------------
                            case "7":

                                eleccionUsuarioSubSubMenu = "";

                                while (!eleccionUsuarioSubSubMenu.equals("0")) {

                                    System.out.println("***** MODIFICAR ESTADO LABORAL DE UN TRABAJADOR *****");
                                    System.out.println("* [0]-> Volver al menu de modificacion.");
                                    System.out.println("* [1]-> Modificar estado laboral de un empleado");
                                    System.out.println("* [2]-> Modificar estado laboral de un supervisor");

                                    System.out.print("* Ingrese una opcion: ");
                                    eleccionUsuarioSubSubMenu = input.nextLine();

                                    System.out.println("");
                                    int idModificarEstadoLaboral;

                                    switch (eleccionUsuarioSubSubMenu) {

                                        case "0":

                                            System.out.println("* Volviendo al menu de modificacion");

                                            System.out.println("");
                                            break;

                                        case "1":
                                            System.out.println("***** MODIFICAR ESTADO LABORAL A UN EMPLEADO *****");
                                            System.out.print("* Ingrese el ID del empleado: ");
                                            idModificarEstadoLaboral = input.nextInt();
                                            input.nextLine();
                                            System.out.println("");

                                            Employee emp = DataBaseEmployee.findByID(idModificarEstadoLaboral);

                                            if (emp != null) {

                                                System.out.println("***** SE ENCONTRO EL ID: " + idModificarEstadoLaboral + " *****");

                                                System.out.println(
                                                        "* Empleado: "
                                                        + emp.getFirstName() + " "
                                                        + emp.getLastName()
                                                        + " * Estado laboral actual: "
                                                        + emp.getWorkStatus()
                                                );

                                                System.out.println("");

                                                System.out.print("*Ingrese el nuevo estado laboral del empleado ([1]-> Activo [2]-> Suspendido [3]-> Retirado [4]-> Parte medico): ");
                                                String nuevoEstadoLaboralEmpleado = input.nextLine();

                                                switch (nuevoEstadoLaboralEmpleado) {
                                                    case "1":
                                                        nuevoEstadoLaboralEmpleado = "Active";
                                                        break;

                                                    case "2":
                                                        nuevoEstadoLaboralEmpleado = "Suspended";
                                                        break;

                                                    case "3":
                                                        nuevoEstadoLaboralEmpleado = "Retired";
                                                        break;

                                                    case "4":
                                                        nuevoEstadoLaboralEmpleado = "onMedicalLeave";
                                                        break;

                                                    default:
                                                        nuevoEstadoLaboralEmpleado = "Active";
                                                        break;
                                                }

                                                System.out.println("");

                                                DataBaseEmployee.update(idModificarEstadoLaboral, "workStatus", nuevoEstadoLaboralEmpleado);

                                                System.out.println("***** ESTADO LABORAL MODIFICADO EXITOSAMENTE *****");

                                            } else {

                                                System.out.println(
                                                        "***** NO SE ENCONTRO EL ID: "
                                                        + idModificarEstadoLaboral
                                                        + " *****"
                                                );
                                            }

                                            System.out.println("");
                                            break;

                                        case "2":
                                            System.out.println("***** MODIFICAR ESTADO LABORAL A UN SUPERVISOR *****");
                                            System.out.print("* Ingrese el ID del supervisor: ");
                                            idModificarEstadoLaboral = input.nextInt();
                                            input.nextLine();

                                            System.out.println("");

                                            Supervisor sup = DataBaseSupervisor.findByID(idModificarEstadoLaboral);

                                            if (sup != null) {

                                                System.out.println("***** SE ENCONTRO EL ID: " + idModificarEstadoLaboral + " *****");

                                                System.out.println(
                                                        "Supervisor: "
                                                        + sup.getFirstName() + " "
                                                        + sup.getLastName()
                                                        + " * Estado laboral actual: "
                                                        + sup.getWorkStatus()
                                                );

                                                System.out.println("");

                                                System.out.print("* Ingrese el nuevo estado laboral del supervisor ([1]-> Activo [2]-> Suspendido [3]-> Retirado [4]-> Parte medico): ");
                                                String nuevoEstadoLaboralSupervisor = input.nextLine();

                                                switch (nuevoEstadoLaboralSupervisor) {
                                                    case "1":
                                                        nuevoEstadoLaboralSupervisor = "Active";
                                                        break;

                                                    case "2":
                                                        nuevoEstadoLaboralSupervisor = "Suspended";
                                                        break;

                                                    case "3":
                                                        nuevoEstadoLaboralSupervisor = "Retired";
                                                        break;

                                                    case "4":
                                                        nuevoEstadoLaboralSupervisor = "onMedicalLeave";
                                                        break;

                                                    default:
                                                        nuevoEstadoLaboralSupervisor = "Active";
                                                        break;
                                                }

                                                System.out.println("");

                                                DataBaseSupervisor.update(idModificarEstadoLaboral, "workStatus", nuevoEstadoLaboralSupervisor);

                                                System.out.println("***** ESTADO LABORAL MODIFICADO EXITOSAMENTE *****");

                                            } else {

                                                System.out.println(
                                                        "***** NO SE ENCONTRO EL ID: "
                                                        + idModificarEstadoLaboral
                                                        + " *****"
                                                );
                                            }

                                            System.out.println("");
                                            break;

                                        default:

                                            System.out.println("* Opcion no valida");
                                            System.out.println("");
                                            break;
                                    }
                                }

                                break;
                            //------------------------------------------------------------
                            // SUB-SUBMENU case "8" Modificar salario a un trabajador
                            //------------------------------------------------------------
                            case "8":

                                eleccionUsuarioSubSubMenu = "";

                                while (!eleccionUsuarioSubSubMenu.equals("0")) {

                                    System.out.println("***** MODIFICAR SALARIO DE UN TRABAJADOR *****");
                                    System.out.println("* [0]-> Volver al menu de modificacion.");
                                    System.out.println("* [1]-> Modificar salario de un empleado");
                                    System.out.println("* [2]-> Modificar salario de un supervisor");

                                    System.out.print("* Ingrese una opcion: ");
                                    eleccionUsuarioSubSubMenu = input.nextLine();

                                    System.out.println("");
                                    int idModificarSalario;

                                    switch (eleccionUsuarioSubSubMenu) {

                                        case "0":

                                            System.out.println("* Volviendo al menu de modificacion");

                                            System.out.println("");
                                            break;

                                        case "1":

                                            System.out.println("***** MODIFICAR EL SALARIO DE UN EMPLEADO *****");

                                            System.out.print("* Ingrese el ID del empleado: ");
                                            idModificarSalario = input.nextInt();
                                            input.nextLine();

                                            System.out.println("");

                                            Employee emp = DataBaseEmployee.findByID(idModificarSalario);

                                            if (emp != null) {

                                                System.out.println("***** SE ENCONTRO EL ID: " + idModificarSalario + " *****");

                                                System.out.println(
                                                        "* Empleado: "
                                                        + emp.getFirstName() + " "
                                                        + emp.getLastName()
                                                        + " * Salario actual: $"
                                                        + emp.getSalary()
                                                );

                                                System.out.println("");

                                                System.out.print("*Ingrese el nuevo salario del empleado: ");
                                                Double nuevoSalarioEmpleado = Double.parseDouble(input.nextLine());

                                                System.out.println("");

                                                DataBaseEmployee.update(idModificarSalario, "salary", nuevoSalarioEmpleado);

                                                System.out.println("***** SALARIO MODIFICADO EXITOSAMENTE *****");

                                            } else {

                                                System.out.println(
                                                        "***** NO SE ENCONTRO EL ID: "
                                                        + idModificarSalario
                                                        + " *****"
                                                );
                                            }

                                            System.out.println("");
                                            break;

                                        case "2":

                                            System.out.println("***** MODIFICAR EL SALARIO DE UN SUPERVISOR *****");

                                            System.out.print("* Ingrese el ID del supervisor: ");
                                            idModificarSalario = input.nextInt();
                                            input.nextLine();

                                            System.out.println("");

                                            Supervisor sup = DataBaseSupervisor.findByID(idModificarSalario);

                                            if (sup != null) {

                                                System.out.println("***** SE ENCONTRO EL ID: " + idModificarSalario + " *****");

                                                System.out.println(
                                                        "* Supervisor: "
                                                        + sup.getFirstName() + " "
                                                        + sup.getLastName()
                                                        + " * Salario actual: $"
                                                        + sup.getSalary()
                                                );

                                                System.out.println("");

                                                System.out.print("*Ingrese el nuevo salario del supervisor: ");
                                                Double nuevoSalarioSupervisor = Double.parseDouble(input.nextLine());

                                                System.out.println("");

                                                DataBaseSupervisor.update(idModificarSalario, "salary", nuevoSalarioSupervisor);

                                                System.out.println("***** SALARIO MODIFICADO EXITOSAMENTE *****");

                                            } else {

                                                System.out.println(
                                                        "***** NO SE ENCONTRO EL ID: "
                                                        + idModificarSalario
                                                        + " *****"
                                                );
                                            }

                                            System.out.println("");
                                            break;

                                        default:

                                            System.out.println("* Opcion no valida");
                                            System.out.println("");
                                            break;
                                    }
                                }

                                break;

                            //------------------------------------------------------------
                            // OPCION INVALIDA
                            //------------------------------------------------------------
                            default:

                                System.out.println("* Opcion no valida");
                                System.out.println("");
                                break;
                        }
                    }

                    break;
                //------------------------------------------------------------
                //En caso de elegir 4 ingresa al Menu mostrar datos de los
                // trabajadores
                //------------------------------------------------------------

                case "4":
                    eleccionUsuarioSubMenu = "";

                    while (!eleccionUsuarioSubMenu.equals("0")) {

                        System.out.println("***** MENU DE MOSTRAR LOS DATOS DE LOS TRABAJADORES *****");
                        System.out.println("* [0]-> Volver al menu principal.");
                        System.out.println("* [1]-> Mostrar datos de los empleados.");
                        System.out.println("* [2]-> Mostrar datos de los supervisores.");

                        System.out.print("* Ingrese una opcion: ");
                        eleccionUsuarioSubMenu = input.nextLine();
                        System.out.println("");

                        switch (eleccionUsuarioSubMenu) {
                            case "0":
                                System.out.println("* Volviendo al menu principal");
                                System.out.println("");
                                break;

                            case "1":
                                System.out.println("***** MOSTRANDO DATOS DE LOS EMPLEADOS *****");
                                DataBaseEmployee.showAll();

                                System.out.println("");
                                break;

                            case "2":
                                System.out.println("***** MOSTRANDO DATOS DE LOS SUPERVISORES *****");
                                DataBaseSupervisor.showAll();

                                System.out.println("");
                                break;

                            default:
                                System.out.println("* Opcion no valida");
                                System.out.println("");
                                break;
                        }

                    }
                    break;
                //------------------------------------------------------------
                //En caso de elegir 5 ingresa al Menu modificar el salario de
                // un trabajador
                //------------------------------------------------------------
                case "5":

                    break;

                //------------------------------------------------------------
                //En caso de elegir 6 ingresa al Menu modificar el horario de
                // un trabajador
                //------------------------------------------------------------
                case "6":
                    eleccionUsuarioSubMenu = "";

                    while (!eleccionUsuarioSubMenu.equals("0")) {

                        System.out.println("***** MENU DE MODIFICAR EL HORARIO A UN TRABAJADOR *****");
                        System.out.println("* [0]-> Volver al menu principal.");
                        System.out.println("* [1]-> Modificar el horario a un empleado.");
                        System.out.println("* [2]-> Modificar el horario a un supervisor.");

                        System.out.print("* Ingrese una opcion: ");
                        eleccionUsuarioSubMenu = input.nextLine();
                        System.out.println("");

                        switch (eleccionUsuarioSubMenu) {
                            case "0":
                                System.out.println("* Volviendo al menu principal");
                                System.out.println("");
                                break;

                            case "1":
                                System.out.println("***** MODIFICAR HORARIO A UN EMPLEADO *****");
                                System.out.println("");
                                break;

                            case "2":
                                System.out.println("***** MODIFICAR HORARIO A UN SUPERVISOR *****");
                                System.out.println("");
                                break;

                            default:
                                System.out.println("* Opcion no valida");
                                System.out.println("");
                                break;
                        }
                    }
                    break;
                //------------------------------------------------------------
                //En caso de elegir 7 ingresa al Menu modificar el email de
                // un trabajador
                //------------------------------------------------------------
                case "7":

                    break;

                //------------------------------------------------------------
                //En caso de elegir 8 ingresa al Menu ascender un trabajador
                //------------------------------------------------------------
                case "8":
                    eleccionUsuarioSubMenu = "";

                    while (!eleccionUsuarioSubMenu.equals("0")) {

                        System.out.println("***** MENU DE ASCENDER A UN TRABAJADOR *****");
                        System.out.println("* [0]-> Volver al menu principal.");
                        System.out.println("* [1]-> Ascender a un empleado.");
                        System.out.println("* [2]-> Ascender a un supervisor.");

                        System.out.print("* Ingrese una opcion: ");
                        eleccionUsuarioSubMenu = input.nextLine();
                        System.out.println("");
                        switch (eleccionUsuarioSubMenu) {
                            case "0":
                                System.out.println("* Volviendo al menu principal");
                                System.out.println("");
                                break;

                            case "1":
                                System.out.println("***** ASCENDER A UN EMPLEADO *****");
                                System.out.println("");
                                break;

                            case "2":
                                System.out.println("***** ASCENDER A UN SUPERVISOR *****");
                                System.out.println("");
                                break;

                            default:
                                System.out.println("* Opcion no valida");
                                System.out.println("");
                                break;
                        }
                    }
                    break;

                //------------------------------------------------------------
                //En caso de elegir 9 ingresa al Menu jubilar a un trabajador
                //------------------------------------------------------------
                case "9":
                    eleccionUsuarioSubMenu = "";

                    while (!eleccionUsuarioSubMenu.equals("0")) {

                        System.out.println("***** MENU DE JUBILACION A UN TRABAJADOR *****");
                        System.out.println("* [0]-> Volver al menu principal.");
                        System.out.println("* [1]-> Jubilar a un empleado.");
                        System.out.println("* [2]-> Jubilar a un supervisor.");

                        System.out.print("* Ingrese una opcion: ");
                        eleccionUsuarioSubMenu = input.nextLine();
                        System.out.println("");

                        switch (eleccionUsuarioSubMenu) {
                            case "0":
                                System.out.println("* Volviendo al menu principal");
                                System.out.println("");
                                break;

                            case "1":
                                System.out.println("***** JUBILAR A UN EMPLEADO *****");
                                System.out.println("");
                                break;

                            case "2":
                                System.out.println("***** JUBILAR A UN SUPERVISOR *****");
                                System.out.println("");
                                break;

                            default:
                                System.out.println("* Opcion no valida");
                                System.out.println("");
                                break;
                        }
                    }
                    break;
                //------------------------------------------------------------
                //En caso de elegir otra cosa a default y de un mensaje de
                //error al usuario
                //------------------------------------------------------------
                default:
                    System.out.println("* Opcion no valida");
                    System.out.println("");
                    break;
            }
        }
        input.close();
    }
}
