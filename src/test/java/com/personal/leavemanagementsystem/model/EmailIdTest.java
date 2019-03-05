package com.personal.leavemanagementsystem.model;

import com.personal.leavemanagementsystem.exceptions.EmailNotValidException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmailIdTest {
@Test
    public void isValidEmail(){
    Boolean value=true;
    try {
        EmailId emailId = new EmailId("abc.cd@gmail.com");
    }catch (EmailNotValidException e){
        e.printStackTrace();
        value=false;
    }
    Assert.assertEquals(true,value);
}
}