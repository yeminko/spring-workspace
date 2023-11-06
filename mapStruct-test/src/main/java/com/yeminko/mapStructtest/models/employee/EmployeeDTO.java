package com.yeminko.mapStructtest.models.employee;

import com.yeminko.mapStructtest.models.division.DivisionDTO;
import lombok.Data;

@Data
public class EmployeeDTO {
    private int employeeId;
    private String employeeName;
    private DivisionDTO division;
    private String employeeStartDt;
}