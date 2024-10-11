package org.example.service.employees.impl;

import org.example.model.employees.EmployeeHealthInsurance;
import org.example.repo.BaseRepository;
import org.example.repo.employee.EmployeeHealthInsuranceRepo;
import org.example.service.CrudBaseService;
import org.example.service.employees.IHealthInsuranceService;
import org.springframework.stereotype.Service;

@Service
public class HealthInsuranceServiceImpl extends CrudBaseService<EmployeeHealthInsurance> implements IHealthInsuranceService  {

    private final EmployeeHealthInsuranceRepo employeeHealthInsuranceRepo;

    public HealthInsuranceServiceImpl(EmployeeHealthInsuranceRepo employeeHealthInsuranceRepo) {
        this.employeeHealthInsuranceRepo = employeeHealthInsuranceRepo;
    }

    @Override
    public void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance) {

    }

    @Override
    public void deleteEmployeeHealthInsuranceById(String empid) {

    }

    @Override
    public BaseRepository<EmployeeHealthInsurance> getRepository() {
        return employeeHealthInsuranceRepo;
    }
}
