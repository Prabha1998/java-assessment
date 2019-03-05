package com.personal.leavemanagementsystem.model;

import lombok.Getter;

import java.util.Collections;
import java.util.List;

@Getter
public class HolidayList {
    private static List<Holiday> holidayList;
    private static HolidayList ourInstance;

    public static void  setInstance(List<Holiday> holidayList) {
        ourInstance = new HolidayList(holidayList);
    }

    public static HolidayList getInstance() {
        return ourInstance;
    }


    private HolidayList(List<Holiday> holidayList) {
        this.holidayList=holidayList;
    }

    public List<Holiday> getList(){
        return holidayList;
    }

}
