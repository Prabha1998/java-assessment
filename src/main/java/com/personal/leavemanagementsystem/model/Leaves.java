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
    public boolean grantCasualLeave(){
        if(casualLeaveCount<5) {
            casualLeaveCount--;
            return true;
        }
        else
            return false;
    }
    public boolean grantSickLeave(){
        if(sickLeaveCount<5) {
            sickLeaveCount--;
            return true;
        }
        else
            return false;
    }
    public boolean grantPlannedLeave(){
        if(plannedLeaveCount<15) {
            plannedLeaveCount--;
            return true;
        }
        else
            return false;
    }
}
