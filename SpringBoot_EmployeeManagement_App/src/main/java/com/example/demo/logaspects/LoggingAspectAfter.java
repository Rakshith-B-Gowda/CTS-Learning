/*
 * package com.example.demo.logaspects;
 * 
 * import org.aspectj.lang.JoinPoint; import org.aspectj.lang.annotation.After;
 * import org.aspectj.lang.annotation.Aspect; import
 * org.aspectj.lang.annotation.Before; import org.slf4j.Logger; import
 * org.slf4j.LoggerFactory; import org.springframework.stereotype.Component;
 * 
 * @Aspect
 * 
 * @Component public class LoggingAspectAfter {
 * 
 * private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
 * 
 * @Before("within(com.example.demo.service.*)") public void
 * logBeforeAllServiceClassMesthods() { LOGGER.debug("For All Services"); }
 * 
 * @After("execution(* com.example.demo.service.EmployeeService.*(..))") public
 * void logAfterAllMethods(JoinPoint joinPoint) {
 * LOGGER.debug("****LoggingAspect.logAfterAllMethods() : " +
 * joinPoint.getSignature().getName()); }
 * 
 * @After("execution(* com.example.demo.service.EmployeeService.getEmployeeById(..))"
 * ) public void logAfterGetEmployee(JoinPoint joinPoint) {
 * LOGGER.debug("****LoggingAspect.logAfterGetEmployee() : " +
 * joinPoint.getSignature().getName()); }
 * 
 * @After("execution(* com.example.demo.service.EmployeeService.addEmployee(..))"
 * ) public void logAfterAddEmployee(JoinPoint joinPoint) {
 * LOGGER.debug("****LoggingAspect.logAfterCreateEmployee() : " +
 * joinPoint.getSignature().getName()); }
 * 
 * @After("execution(* com.example.demo.service.EmployeeService.deleteEmployee(..))"
 * ) public void logAfterDeleteEmployee(JoinPoint joinPoint) {
 * LOGGER.debug("****LoggingAspect.logAfterCreateEmployee() : " +
 * joinPoint.getSignature().getName()); }
 * 
 * @After("execution(* com.example.demo.service.EmployeeService.getAllEmployees(..))"
 * ) public void logAfterGetAllEmployees(JoinPoint joinPoint) {
 * LOGGER.debug("****LoggingAspect.logAfterCreateEmployee() : " +
 * joinPoint.getSignature().getName()); } }
 */