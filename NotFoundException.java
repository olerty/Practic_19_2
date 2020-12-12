package com.company.z2;

public class NotFoundException extends Exception{
    private String name;
    public String getName(){return name;}
    public NotFoundException(String message, String str){

        super(message);
        name = str;
    }
}
