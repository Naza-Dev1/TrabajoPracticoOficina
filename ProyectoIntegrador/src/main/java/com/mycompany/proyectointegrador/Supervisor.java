package com.mycompany.proyectointegrador;

public class Supervisor extends Personnel {

    public Supervisor(Integer id, String firstName, String lastName, Integer age, Integer yearsOfExperience, String email, String occupation, String workStatus, Double salary) {
        super(id, firstName, lastName, age, yearsOfExperience, email, occupation, workStatus, salary);
    }

    @Override
    public String toString() {

        return id + ","
                + firstName + ","
                + lastName + ","
                + age + ","
                + yearsOfExperience + ","
                + email + ","
                + occupation + ","
                + workStatus + ","
                + salary;
    }
}
