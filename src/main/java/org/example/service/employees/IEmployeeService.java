package org.example.service.employees;

import org.example.model.employees.Employee;

public interface IEmployeeService {

    void insertEmployee(Employee emp);

    void deleteEmployeeById(String empid);
}
