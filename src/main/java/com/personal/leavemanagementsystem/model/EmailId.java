package com.personal.leavemanagementsystem.model;

import com.personal.leavemanagementsystem.exceptions.EmailNotValidException;
import com.personal.leavemanagementsystem.services.ValidityCheck;

public class EmailId implements ValidityCheck {
    String emailId;


    EmailId(String emailId) throws EmailNotValidException {
        if(isValid(emailId)){
            this.emailId=emailId;
        }
        else{
            throw new EmailNotValidException();
        }
    }

    @Override
    public boolean isValid(String emailId){

    }
    
}
