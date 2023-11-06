package com.yeminko.mapStructtest.models.employee;

import com.yeminko.mapStructtest.models.division.Division;
import lombok.Data;

import java.util.Date;

@Data
public class Employee {
    private int id;
    private String name;
    private Division division;
    private Date startDt;
}