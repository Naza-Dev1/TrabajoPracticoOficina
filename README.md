# Trabajo Practico Integrador Grupal
## "Programacion Orientada a Objetos"

### Integrantes:
* Santiago Herrera
* Emiliano Valverde
* Santino Balmaceda
* Santiago Mattar
* Juan Guevara
* Robetino Vergara

### Tema elegido: Herramienta de Gestion de una Oficina.

***

### Link del repositorio original del codigo:
Link

***

## Lista de Objetivos
#### Lista de Objetivos para el Personnel.java
- [x] Crear la clase abstracta Personnel.
- [x] Crear los atributos protegidos. 
- [x] Crear el constructor publico Personnel.
- [x] Crear los metodos publicos get y set de cada atributo.
- [x] Crear al menos un metodo abstracto.


#### Lista de Objetivos para Employee.java
- [x] Crear la clase publica Employee que extiende de Personnel.
- [x] Crear el contructor publico Employee con los atributos heredados de Personnel. 
- [x] Usar @Override para sobre-escribir los metodos abstractos de Personnel


#### Lista de Objetivos para Supervisor.java
- [x] Crear la clase publica Supervisor que extiende de Personnel.
- [x] Crear el contructor publico Supervisor con los atributos heredados de Personnel. 
- [x] Usar @Override para sobre-escribir los metodos abstractos de Personnel


#### Lista de Objetivos para Office.java
- [x] Crear la clase publica Office.
- [x] Declarar la clase main del programa. 
- [x] Declarar las variables del programa.
- [x] Declarar la Lista employees del programa.
- [x] Declarar la Lista supervisors del programa. 
- [x] Usar un bucle while para que el menu no se cierre. 
- [x] Usar un switch para que diriga cada opcion del menu.

 Dentro del switch:
- [x] 0. Salir del programa.
- [x] 1. Agregar un nuevo trabajador.
    - [x] 0. Volver al Menu principal.
    - [x] 1. Agregar un nuevo empleado.
    - [x] 2. Agregar un nuevo supervisor.
    - [x] Default. "Opcion no valida".

- [ ] 2. Dar de baja a un trabajador.
    - [ ] 0. Volver al Menu principal.
    - [ ] 1. Dar de baja a un empleado.
    - [ ] 2. Dar de baja a un supervisor.
    - [ ] Default. "Opcion no valida".

- [ ] 3. Dar de alta a un trabajador.
    - [ ] 0. Volver al Menu principal.
    - [ ] 1. Dar de alta a un empleado.
    - [ ] 2. Dar de alta a un supervisor.
    - [ ] Default. "Opcion no valida".

- [x] 4. Mostrar datos de los trabajadores. 
    - [x] 0. Volver al Menu principal.
    - [x] 1. Mostrar datos de los empleados.
    - [x] 2. Mostrar datos de los supervisores.
    - [x] Default. "Opcion no valida".

- [ ] 5. Modificar el salario de un trabajador.
    - [ ] 0. Volver al Menu principal.
    - [ ] 1. Modificar el salario de un empleado.
    - [ ] 2. Modificar el salario de un supervisores.
    - [ ] Default. "Opcion no valida".


- [ ] 6. Modificar horario de un trabajador.
    - [ ] 0. Volver al Menu principal.
    - [ ] 1. Modificar horario de un empleado.
    - [ ] 2. Modificar horario de un supervisor.
    - [ ] Default. "Opcion no valida".

- [ ] 7. Modificar email de un trabajador.
    - [ ] 0. Volver al Menu principal.
    - [ ] 1. Modificar email de un empleado.
    - [ ] 2. Modificar email de un supervisor.
    - [ ] Default. "Opcion no valida".

- [ ] 8. Ascenso de un trabajador.
    - [ ] 0. Volver al Menu principal.
    - [ ] 1. Ascender un empleado.
    - [ ] 2. Ascender un supervisor.
    - [ ] Default. "Opcion no valida".

- [ ] 9. Jubilar a un trabajador.
    - [ ] 0. Volver al Menu principal.
    - [ ] 1. Jubilar un empleado.
    - [ ] 2. Jubilar un supervisor.
    - [ ] Default. "Opcion no valida".

## Documentacion del Trabajo:

Luego de una busqueda encontramos, gracias a la Chat GPT, el repositorio con el cual vamos a armar el proyecto.
El repositorio contenia 7 proyectos, pero optamos por el primero que era menos complejo de entender y mas facil a la hora de agregar las modificaciones.

El proyecto original solo imprimia por consola los datos de empleados guardados en una Lista, No permitia nada mas.
En equipo decidimos que lo mejor era lograr crear una herramienta con menus y varias funcionalidades con el fin de hacer al programa mas abarcador de areas.

La idea a nivel codigo es en el main tener un switch con el papel de un menu principal, el menu segun la eleccion del usuario va a llamar a los metodos necesarios para realizar determinada accion.

***

**(28/4/26)**

En el dia de hoy llevamos un avance a clases, pero el proyecto no se lograba ejecutar en ninguna de las tres notebook que tenia el grupo.
Se unio a las clases el compañero Robetino, lo integramos al grupo y le explicamos de que consta el proyecto.
Lo agregamos al grupo de whatsapp y le dimos los link al repositorio de github.

***

**(29/5/26)**

En el dia de hoy el compañero Santiago H, logro corregir el error que impedia la ejecucion del programa en el IDE Apache Netbens.
El error estaba en el archivo pom.xml , el mismo por alguna razon buscaba la funcion main en un archivo llamado Ma.java que no existe en el proyecto. Esto fue corregido y ahora busca el archivo que tiene el main (Office.java).

```Se modifico el archivo pom.xml.```

***

**(30/4/26)**

Por whatapp el compañero Santino B propuso agregar a los atributos la edad y los años de experiencia de los empleados.

```Se agrego a la clase Employee el atributo age y yearsOfExperience.```

***
**(1/5/26)**

El compañero Santiago H y Robertino adelantaron el proyecto, 
Propusimos el uso de una clase abstracta para definir los atributos y metodos de los empleados tambien con el fin de reutilizar codigo mediante la herencia de clases.

Propusimos agregar a los empleados un ID unico con el fin de identificar mas rapidamente a cada quien.

```Se agrego id a la Lista employees.```

Propusimos que tambien se puedan admnistrar los supervisores de la oficina asi que creamos una nueva Lista

```Se creo una Lista supervisors en el archivo Office.java.```

El compañero Santiago H creo el archivo DiagramaProyectoIntegrador.draowio con el fin de tener de manera grafica de la ejecucion del programa.

```Se creo el DiagramaProyectoIntegrador.drawio```

***
 
**(5/5/26)**

El compañero Santiago H y Robertino adelantaron el proyecto.

Santiago H creo una lista de objetivos en Github con el fin de tener claros los objetivos y el seguimiento del programa.
Santiago H agrego los submenus de cada una de las opciones del menu pricipal (switch anidados).
Santiago H agrego el atributo isRetired a las clases Personnel y a sus hijas Employee y Supervisor.
Santiago H agrego los metodos abstractos onboard(), dismiss(), changeSalary(), changeHorary(), changeEmail(), promotion(), retired() pero estan vacios aun.

Robertino adelanto el la seccion de codigo que permite mostrar y modificar el salario de los trabajadores. 

```Se creo la Lista de Objetivos a GitHub y se agrego el atributo isRetired a las clases```

***

**(6/5/26)**
