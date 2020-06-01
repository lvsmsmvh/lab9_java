package com.company;

public class Manager extends Employee {

    private double bonus;

    public Manager(int id, String name, String surname, double bonus) throws FieldLengthLimitException, IncorrectSalaryException{
        super(id, name, surname);
        if (bonus < 0) throw new IncorrectSalaryException("Bonus must be bigger than 0.");
        this.bonus = bonus;
    }

    public void setBonus(double bonus) throws IncorrectSalaryException{
        if (bonus < 0) throw new IncorrectSalaryException("Bonus must be bigger than 0.");
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return "\n" + getName() + " " + getSurname() + "\nSalary " + getSalary() + " (bonus " +
                getBonus() + ")" + getManagerName();
    }
}
