package com.personal.leavemanagementsystem.model;

import com.personal.leavemanagementsystem.services.AddHoliday;
import com.personal.leavemanagementsystem.services.RegisterEmployee;

public class Admin extends Employee implements AddHoliday,RegisterEmployee{
    @Override
    public void add(Holiday holiday) {

    }

    @Override
    public void addToEmployeeDatabase(Employee employee) {

    }
}
