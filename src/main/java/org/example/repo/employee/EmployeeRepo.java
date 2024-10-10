package org.example.repo.employee;

import org.example.model.employees.Employee;
import org.example.repo.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface EmployeeRepo extends BaseRepository<Employee> {

    Optional<Employee> findByEmployeeNumber(String employeeNumber);
}
