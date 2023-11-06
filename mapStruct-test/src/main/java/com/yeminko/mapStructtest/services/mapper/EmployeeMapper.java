package com.yeminko.mapStructtest.services.mapper;

import com.yeminko.mapStructtest.models.division.Division;
import com.yeminko.mapStructtest.models.division.DivisionDTO;
import com.yeminko.mapStructtest.models.employee.Employee;
import com.yeminko.mapStructtest.models.employee.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    @Mapping(target = "employeeId", source = "entity.id")
    @Mapping(target = "employeeName", source = "entity.name")
    @Mapping(target = "division", source = "entity.division")
    @Mapping(target="employeeStartDt", source = "entity.startDt", dateFormat = "dd-MM-yyyy HH:mm:ss")
    EmployeeDTO employeeToEmployeeDTO(Employee entity);

    @Mapping(target = "id", source = "dto.employeeId")
    @Mapping(target = "name", source = "dto.employeeName")
    @Mapping(target = "division", source = "dto.division")
    @Mapping(target="startDt", source="dto.employeeStartDt", dateFormat="dd-MM-yyyy HH:mm:ss")
    Employee employeeDTOtoEmployee(EmployeeDTO dto);

    DivisionDTO divisionToDivisionDTO(Division entity);

    Division divisionDTOtoDivision(DivisionDTO dto);
}