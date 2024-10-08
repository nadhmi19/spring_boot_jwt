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