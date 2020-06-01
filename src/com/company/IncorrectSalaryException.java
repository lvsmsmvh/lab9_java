package com.company;

public class IncorrectSalaryException extends Exception{

    public IncorrectSalaryException() {
    }
    public IncorrectSalaryException(String str) {
        super(str);
    }
}
