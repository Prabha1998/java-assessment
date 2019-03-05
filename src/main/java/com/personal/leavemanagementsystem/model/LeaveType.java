package com.personal.leavemanagementsystem.model;

public enum LeaveType {
    CASUAL(5),SICK(5),PLANNED(15);
    int maxCount;
    LeaveType(int maxCount){
        this.maxCount=maxCount;
    }
}
