package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyDemoLoggingAspect {

	// this is where we add all of our related advices for logging
	
	// let's start with an @before advice
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {}
	
	//@Before("execution(public void add*())")
	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n====>>> Executing @Before advice on method");
			 
	}
	
	@Before("forDaoPackage( )")
	public void performApiAnalytics() {
		System.out.println("\n====>>> Performing API analytics");
	}
	
}
