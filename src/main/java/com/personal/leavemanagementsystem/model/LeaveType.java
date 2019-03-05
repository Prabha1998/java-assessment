package com.personal.leavemanagementsystem.model;

public enum LeaveType {
    CASUAL(6),SICK(6),PLANNED(18);
    int maxCount;
    LeaveType(int maxCount){
        this.maxCount=maxCount;
    }
}
