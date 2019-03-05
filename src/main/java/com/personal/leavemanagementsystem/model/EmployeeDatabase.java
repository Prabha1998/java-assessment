package com.personal.leavemanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class EmployeeDatabase {
    private List<Employee> employeeList;
    public void updateDatabase(){

    }
}
