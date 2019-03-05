package com.personal.leavemanagementsystem.model;

import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public abstract class Employee {
    private static int employeeId;
    private Name name;
    private EmailId emailId;
    private Date dateOfJoining;
    private EmployeeType employeeType;
    private Leaves leaves;

    boolean requestLeave(LeaveType leaveType){
      if(this.employeeType==EmployeeType.PROBATION){
          return false;
      }
      else{

      }
    }
}
