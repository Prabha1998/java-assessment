package com.personal.leavemanagementsystem.model;

import com.personal.leavemanagementsystem.services.AddHoliday;
import com.personal.leavemanagementsystem.services.RegisterEmployee;
import lombok.AllArgsConstructor;

import java.util.Date;


public class Admin extends Employee implements AddHoliday,RegisterEmployee{
    public Admin(Name name, EmailId emailId, Date dateOfJoining, EmployeeType employeeType, Leaves leaves) {
        super(name, emailId, dateOfJoining, employeeType, leaves);
    }


    public void add(Holiday holiday) {
      HolidayList holidayList=HolidayList.getInstance();
      holidayList.getList().add(holiday);
    }


    public void addToEmployeeDatabase(Employee employee) {

    }
}
