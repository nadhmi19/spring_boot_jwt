package org.example.model.employees;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.example.model.EntityBase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="employee_health_insurance")
@Getter
@Setter
public class EmployeeHealthInsurance extends EntityBase {

    private String healthInsuranceName;
    private BigDecimal healthInsuranceAmount;

    @OneToMany(mappedBy = "insurance")
    private List<Employee> employeesList = new ArrayList<>();


}
