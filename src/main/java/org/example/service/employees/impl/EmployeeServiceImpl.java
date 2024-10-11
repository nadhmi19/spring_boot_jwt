package org.example.service.employees.impl;

import org.example.model.employees.Employee;
import org.example.repo.BaseRepository;
import org.example.repo.employee.EmployeeRepo;
import org.example.service.CrudBaseService;
import org.example.service.employees.IEmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends CrudBaseService<Employee> implements IEmployeeService {

    private final EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public BaseRepository<Employee> getRepository() {
        return employeeRepo;
    }

    @Override
    public Employee insertEmployee(Employee emp) {
          return employeeRepo.save(emp);
    }

    @Override
    public void deleteEmployeeById(String empId) {
         employeeRepo.findByEmployeeNumber(empId).ifPresent(employeeRepo::delete);
    }
}
