package org.example.service.employees;

import org.example.model.employees.Employee;
import org.example.model.employees.EmployeeHealthInsurance;

public interface IOrganisationService {

     void joinOrganisation(Employee e, EmployeeHealthInsurance healthInsurance);
     void leaveOrganisation(Employee e, EmployeeHealthInsurance healthInsurance);
}
