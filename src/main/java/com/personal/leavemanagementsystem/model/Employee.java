package com.personal.leavemanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;
import java.util.List;
@Getter
public abstract class Employee {
    private static int employeeId;
    private Name name;
    private EmailId emailId;

    public Employee(Name name, EmailId emailId, Date dateOfJoining, EmployeeType employeeType, Leaves leaves) {
        this.name = name;
        this.emailId = emailId;
        this.dateOfJoining = dateOfJoining;
        this.employeeType = employeeType;
        this.leaves = leaves;
    }

    private Date dateOfJoining;
    private EmployeeType employeeType;
    private Leaves leaves;



    boolean requestLeave(LeaveType leaveType){
      if(this.employeeType==EmployeeType.PROBATION){
          return false;
      }
      else {
          if(leaveType.name()=="CASUAL"){
              leaves.grantCasualLeave();
          }
          else if(leaveType.name()=="SICK"){
              leaves.grantSickLeave();
          }
          else if(leaveType.name()=="PLANNED"){
              leaves.grantPlannedLeave();
          }
          else
              return false;

      }
      return false;
    }

    public List<Holiday> viewHolidays(){
        HolidayList list=HolidayList.getInstance();
        return list.getList();
    }


}
