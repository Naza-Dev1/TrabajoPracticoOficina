package com.mycompany.proyectointegrador;

public class Employee extends Personnel {

    public Employee(Integer id, String firstName, String lastName, Integer age, Integer yearsOfExperience, String email, String occupation, Boolean isActive, Boolean isRetired, Double salary) {
        super(id, firstName, lastName, age, yearsOfExperience, email, occupation, isActive, isRetired, salary);
    }

    @Override

    public void showDates() {
        System.out.println("***** ***** EMPLEADO ID: " + this.getId() + " ***** ****** ******");
        System.out.println("* Name: " + this.getFirstName() + " - Last name: " + this.getLastName());
        System.out.println("* Age: " + this.getAge() + " - Email: " + this.getEmail());
        System.out.println("* Years of experience: " + this.getYearsOfExperience() + " - Occupation: " + this.getOccupation());
        System.out.println("* Active: " + this.getIsActive() + " - Retired: " + this.getIsRetired());
        System.out.println("* Salary: " + this.getSalary());
        System.out.println("***** ****** ***** ****** ***** ****** ******\n");

    }

    @Override

    public void onboard() {
        System.out.println("Dar de alta");
    }

    @Override

    public void dismiss() {
        System.out.println("Dar de baja");

    }

    @Override

    public void changeSalary() {
        System.out.println("Modifica salario");

    }

    @Override

    public void changeHorary() {
        System.out.println("Modifica horario");

    }

    @Override

    public void changeEmail() {
        System.out.println("Modifica email");
    }

    @Override

    public void promotion() {
        System.out.println("Ascender trabajador");

    }

    @Override

    public void retired() {
        System.out.println("Jubilar trabajador");

    }

}
