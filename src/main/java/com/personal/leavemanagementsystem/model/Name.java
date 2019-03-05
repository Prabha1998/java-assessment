package com.personal.leavemanagementsystem.model;
import com.personal.leavemanagementsystem.exceptions.NameNotValidException;
import com.personal.leavemanagementsystem.services.ValidityCheck;

public class Name implements ValidityCheck {

    private String name;


    Name(String name) throws NameNotValidException{
        if(isValid(name)){
            this.name=name;
        }
        else{
            throw  new NameNotValidException();
        }
    }

    @Override
    public boolean isValid(String name){
        return name.length()>50?false:true;
    }


}
