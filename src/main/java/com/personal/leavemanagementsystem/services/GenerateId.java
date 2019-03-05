package com.personal.leavemanagementsystem.services;

import lombok.Getter;

@Getter
public class GenerateId {
    private static int id;
    GenerateId(){
        id++;
    }
}
