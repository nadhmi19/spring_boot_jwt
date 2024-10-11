package org.example.service.employees;

import org.example.model.employees.EmployeeHealthInsurance;

public interface IHealthInsuranceService{

    void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance);

    void deleteEmployeeHealthInsuranceById(String empid);
}
