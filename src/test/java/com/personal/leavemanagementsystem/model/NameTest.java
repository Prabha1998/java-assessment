package com.personal.leavemanagementsystem.model;

import com.personal.leavemanagementsystem.exceptions.NameNotValidException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {

    @Test
    public void isValid() {
        boolean value=true;
        try{
            Name name=new Name("abc");
        }catch(NameNotValidException e){
            e.printStackTrace();
            value=false;
        }
        Assert.assertEquals(true,value);
    }
}