package org.example.service.employees;

import org.example.model.employees.Employee;
import org.example.repo.BaseRepository;
import org.example.repo.employee.EmployeeRepo;
import org.example.service.CrudBaseService;

import java.util.Optional;

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
    public void insertEmployee(Employee emp) {
            employeeRepo.save(emp);
    }

    @Override
    public void deleteEmployeeById(String empid) {
            Optional<Employee> employee= employeeRepo.findByEmployeeNumber(empid);

    }
}
