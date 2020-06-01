package com.company;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private double salary;
    private Manager manager;

    public Employee(int id, String name, String surname) throws FieldLengthLimitException {
        this.id = id;
        if (name == null || surname == null)
            throw new NullPointerException();
        if (name.length() < 2 || name.length() > 12 || surname.length() < 2 || surname.length() > 12)
            throw new FieldLengthLimitException("Name/surname must be < 12 symbols.");
        this.name = name;
        this.surname = surname;
        this.salary = 1000;
    }


    public void raiseSalary(double p){
        salary += salary * p / 100;
    }

    @Override
    public String toString() {
        return "\n" + getName() + " " + getSurname() + "\nSalary " + getSalary() + getManagerName();
    }

    public String getManagerName(){
        try {
            return "\nManager: " + getManager().getName() + " " + getManager().getSurname();
        } catch (NullPointerException e) {
            return "\nno manager";
        }
    }

    public String getTopManager(){
        try {
            return getManager().getTopManager();
        } catch (NullPointerException e) {
            return "Top manager: " + getName() + " " + getSurname();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
