package org.example.model.employees;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.model.User;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

//employee wil join an organization
@Entity
@Table(name="employee")
@SequenceGenerator(name = "employee_seq",initialValue = 1, sequenceName = "student_seq", allocationSize = 1)
@Getter
@Setter
public class Employee extends User {

    @GeneratedValue(strategy = GenerationType.UUID)
    private String employeeNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    private EmployeeHealthInsurance insurance;

}
