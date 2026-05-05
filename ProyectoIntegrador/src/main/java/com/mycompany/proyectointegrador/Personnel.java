package com.mycompany.proyectointegrador;

//------------------------------------------------------------
//Declaramos a Personnel como clase abstracta.
//------------------------------------------------------------
public abstract class Personnel {

    //------------------------------------------------------------
    //Declaramos los atributos (variables de instanciacion).
    //------------------------------------------------------------
    protected Integer id;
    protected String firstName;
    protected String lastName;
    protected Integer age;
    protected Integer yearsOfExperience;
    protected String email;
    protected String occupation;
    protected Boolean isActive;
    protected Double salary;

    //------------------------------------------------------------
    //Constructor con todos los parametros. 
    //------------------------------------------------------------
    public Personnel(Integer id, String firstName, String lastName, Integer age, Integer yearsOfExperience, String email, String occupation, Boolean isActive, Double salary) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
        this.email = email;
        this.occupation = occupation;
        this.isActive = isActive;
        this.salary = salary;
    }

    //------------------------------------------------------------
    //Metodo get y set del atributo id.
    //------------------------------------------------------------
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //------------------------------------------------------------
    //Metodo get y set del atributo firtsname.
    //------------------------------------------------------------
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //------------------------------------------------------------
    //Metodo get y set del atributo lastName.
    //------------------------------------------------------------
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //------------------------------------------------------------
    //Metodo get y set del atributo age.
    //------------------------------------------------------------
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;

    }

    //------------------------------------------------------------
    //Metodo get y set del atributo yearsOfExperience.
    //------------------------------------------------------------
    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    //------------------------------------------------------------
    //Metodo get y set del atributo email.
    //------------------------------------------------------------
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //------------------------------------------------------------
    //Metodo get y set del atributo occupation.
    //------------------------------------------------------------
    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    //------------------------------------------------------------
    //Metodo get y set del atributo isActive.
    //------------------------------------------------------------
    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    //------------------------------------------------------------
    //Metodo get y set del atributo salary.
    //------------------------------------------------------------
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    //------------------------------------------------------------
    //Atributo abstracto (no lleva cuerpo)
    //------------------------------------------------------------
    public abstract void showDates();

}
