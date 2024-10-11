package org.example.service.employees.impl;

import org.example.model.employees.Employee;
import org.example.model.employees.EmployeeHealthInsurance;
import org.example.service.employees.IEmployeeService;
import org.example.service.employees.IOrganisationService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeHealthOrganisationService implements IOrganisationService {

    private final IEmployeeService employeeService;

    public EmployeeHealthOrganisationService(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public void joinOrganisation(Employee e, EmployeeHealthInsurance healthInsurance) {
       Employee employee =  employeeService.insertEmployee(e);
        employee.setInsurance(healthInsurance);
    }

    @Override
    public void leaveOrganisation(Employee e, EmployeeHealthInsurance healthInsurance) {

    }
}
