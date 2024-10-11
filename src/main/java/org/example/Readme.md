propagation level will define how we want to use the transaction within our method 
1/ use dont use the active transaction 
2/ cancel/suspend the active transaction 
3- create a new transaction 

@Transactional(propagation=Propagation.REQUIRED)
@Transactional(propagation=Propagation.REQUIRES_NEW)
@Transactional(propagation=Propagation.MANDATORY)
@Transactional(propagation=Propagation.SUPPORTS)
@Transaction(propagation=Propagation.NOT_SUPPORTED)
@Transaction(propagation=P


When you set up a Spring Boot application with Spring Data JPA, 
Spring Boot automatically configures the JpaTransactionManager if it 
detects a EntityManagerFactory bean in your application context.
You can also customize the transaction management by defining your own transaction manager bean if needed.

In Spring Boot, the default transaction manager used with Spring Data JPA is the JpaTransactionManager.
This transaction manager is designed to work with JPA (Java Persistence API) 
and is typically configured automatically 
when you include the necessary dependencies for JPA (like Hibernate) in your project.




//application transaction 
sequence of application actions that are considered as a single logical unit 
joinOrganization method == complete transaction 
2 actions : 
persist employee information 
persist health insurance information 


**********organization service *******************

leaveOrganization(Employee,employeeHealthInsurance)

**************************************************
---> employeeService.deleteEmployeeById(id)
---> healthInsuranceService.deleteEmployeeHealthInsuranceBy(id)
---> delete Employee Health insurance by Id


Begin transaction : application transaction ==> app commit or rollback


########### Unidirectional ###########

in this type of association == only the source entity has a relationship field that refers to the target 

########### Bidirectional ###########
each entity has a relationship field that refers to each other 
