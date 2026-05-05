package com.mycompany.proyectointegrador;

public class Supervisor extends Personnel {

    public Supervisor(Integer id, String firstName, String lastName, Integer age, Integer yearsOfExperience, String email, String occupation, Boolean isActive, Double salary) {
        super(id, firstName, lastName, age, yearsOfExperience, email, occupation, isActive, salary);
    }

    @Override

    public void showDates() {
        System.out.println("***** ***** SUPERVISOR ID: " + this.getId() + " ***** ****** ******");
        System.out.println("* Name: " + this.getFirstName() + " - Last name: " + this.getLastName());
        System.out.println("* Age: " + this.getAge() + " - Email: " + this.getEmail());
        System.out.println("* Years of experience: " + this.getYearsOfExperience() + " - Occupation: " + this.getOccupation());
        System.out.println("* Active: " + this.getIsActive() + " - Salary: " + this.getSalary());
        System.out.println("***** ****** ***** ****** ***** ****** ******\n");
    }
}
