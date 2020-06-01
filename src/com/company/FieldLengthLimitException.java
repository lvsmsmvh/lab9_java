package com.company;

public class FieldLengthLimitException extends Exception {
    public FieldLengthLimitException(){
        super();
    }

    public FieldLengthLimitException(String str){
        super(str);
    }
}
