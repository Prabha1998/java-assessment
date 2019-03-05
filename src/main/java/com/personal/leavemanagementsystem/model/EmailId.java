package com.personal.leavemanagementsystem.model;

import com.personal.leavemanagementsystem.exceptions.EmailNotValidException;
import com.personal.leavemanagementsystem.services.ValidityCheck;

import java.util.regex.Pattern;

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

            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}$";

            Pattern pat = Pattern.compile(emailRegex);
            if (emailId == null)
                return false;
            return pat.matcher(emailId).matches();
        }
    }


