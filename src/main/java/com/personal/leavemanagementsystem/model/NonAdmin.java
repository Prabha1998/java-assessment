package com.personal.leavemanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;


public class NonAdmin extends Employee {
    public NonAdmin(Name name, EmailId emailId, Date dateOfJoining, EmployeeType employeeType, Leaves leaves) {
        super(name, emailId, dateOfJoining, employeeType, leaves);
    }
}
