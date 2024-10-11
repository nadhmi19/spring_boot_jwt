package org.example.service.employees;

import org.example.model.employees.Employee;

public interface IEmployeeService {

    Employee insertEmployee(Employee emp);

    void deleteEmployeeById(String empid);
}
