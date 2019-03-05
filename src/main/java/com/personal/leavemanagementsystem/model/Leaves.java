package com.personal.leavemanagementsystem.model;

public class Leaves {
    private int casualLeaveCount;
    private int sickLeaveCount;
    private int plannedLeaveCount;
    Leaves(){
        casualLeaveCount=LeaveType.CASUAL.maxCount;
        sickLeaveCount=LeaveType.SICK.maxCount;
        plannedLeaveCount=LeaveType.PLANNED.maxCount;
    }
}
