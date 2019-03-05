package com.personal.leavemanagementsystem.exceptions;

public class EmailNotValidException extends Exception {
    public EmailNotValidException(){
        System.out.println("Email not in valid format");
    }
}
