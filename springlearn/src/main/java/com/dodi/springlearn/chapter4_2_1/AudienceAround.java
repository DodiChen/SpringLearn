package com.dodi.springlearn.chapter4_2_1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AudienceAround {
	
	@Pointcut("execution(** com.dodi.springlearn.chapter4_2_1.Performance.perform(..))")
	public void performance(){};
	
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp){
		
		try {
			System.out.println("Silencing cell phones");
			System.out.println("Taking seats");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP");
			jp.proceed();
			jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("Demanding a refund");
		}
	}
	
}
