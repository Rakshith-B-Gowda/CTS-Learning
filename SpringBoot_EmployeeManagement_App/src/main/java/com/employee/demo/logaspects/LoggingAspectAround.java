/*
 * package com.example.demo.logaspects;
 * 
 * import org.aspectj.lang.ProceedingJoinPoint; import
 * org.aspectj.lang.annotation.Around; import
 * org.slf4j.LoggerFactory; import org.springframework.stereotype.Component;
 * 
 * @Aspect
 * 
 * @Component public class LoggingAspectAround {
 * 
 * private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
 * 
 * @Around("execution(* com.example.demo.service.EmployeeService.*(..))") public
 * void logAroundAllMethods(ProceedingJoinPoint joinPoint) throws Throwable {
 * LOGGER.debug("****LoggingAspect.logAroundAllMethods() : " +
 * joinPoint.getSignature().getName() + ": Before Method Execution"); try {
 * joinPoint.proceed(); } finally { //Do Something useful, If you have }
 * LOGGER.debug("****LoggingAspect.logAroundAllMethods() : " +
 * joinPoint.getSignature().getName() + ": After Method Execution"); }
 * 
 * @Around("execution(* com.example.demo.service.EmployeeService.getEmployeeById(..))"
 * ) public void logAroundGetEmployee(ProceedingJoinPoint joinPoint) throws
 * Throwable { LOGGER.debug("****LoggingAspect.logAroundGetEmployee() : " +
 * joinPoint.getSignature().getName() + ": Before Method Execution"); try {
 * joinPoint.proceed(); } finally { //Do Something useful, If you have }
 * LOGGER.debug("****LoggingAspect.logAroundGetEmployee() : " +
 * joinPoint.getSignature().getName() + ": After Method Execution"); }
 * 
 * @Around("execution(* com.example.demo.service.EmployeeService.addEmployee(..))"
 * ) public void logAroundAddEmployee(ProceedingJoinPoint joinPoint) throws
 * Throwable { LOGGER.debug("****LoggingAspect.logAroundAddEmployee() : " +
 * joinPoint.getSignature().getName() + ": Before Method Execution"); try {
 * joinPoint.proceed(); } finally { //Do Something useful, If you have }
 * LOGGER.debug("****LoggingAspect.logAroundAddEmployee() : " +
 * joinPoint.getSignature().getName() + ": After Method Execution"); } }
 */
package com.employee.demo.logaspects;

