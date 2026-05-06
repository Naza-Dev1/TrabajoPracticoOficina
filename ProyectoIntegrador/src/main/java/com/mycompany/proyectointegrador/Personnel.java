package com.mycompany.proyectointegrador;

//------------------------------------------------------------
//Declaramos a Personnel como clase abstracta.
//------------------------------------------------------------
public abstract class Personnel {

    //------------------------------------------------------------
    //Declaramos los atributos (variables de instanciacion).
    // Integer id - identificador unico del trabajador
    // String firstName - primer nombre del trabajador
    // String lastName - apellido del trabajador
    // Integer age - edad del trabajador
    // Integer yearsOfExperience - años de experiencia del trabajador
    // String email - email del trabajador
    // String occupation - puesto de trabajo
    // Boolean isActive - esta activo el trabajador
    // Boolean isRetired - esta jubilado el trabajador
    // Double salary - salario del trabajador
    //------------------------------------------------------------
    protected Integer id;
    protected String firstName;
    protected String lastName;
    protected Integer age;
    protected Integer yearsOfExperience;
    protected String email;
    protected String occupation;
    protected Boolean isActive;
    protected Boolean isRetired;
    protected Double salary;

    //------------------------------------------------------------
    //Constructor con parametros. 
    //------------------------------------------------------------
    public Personnel(Integer id, String firstName, String lastName, Integer age, Integer yearsOfExperience, String email, String occupation, Boolean isActive, Boolean isRetired, Double salary) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
        this.email = email;
        this.occupation = occupation;
        this.isActive = isActive;
        this.isRetired = isRetired;
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
    //Metodo get y set del atributo isRetired.
    //------------------------------------------------------------
    public Boolean getIsRetired() {
        return isRetired;
    }

    public void setIsRetired(Boolean isRetired) {
        this.isRetired = isRetired;
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
    //Atributos abstractos (no lleva cuerpo)
    // showDates() - mostrar datos
    // onboard() - dar de alta
    // dismiss() - dar de baja 
    // changeSalary() - modificar salario
    // changeHorary() - modificar horario
    // changeEmail() - modificar email
    // promotion() - ascender de puesto laboral
    // retired() - jubilarse de su trabajado
    //------------------------------------------------------------
    public abstract void showDates();

    public abstract void onboard();

    public abstract void dismiss();

    public abstract void changeSalary();

    public abstract void changeHorary();

    public abstract void changeEmail();

    public abstract void promotion();

    public abstract void retired();
}
