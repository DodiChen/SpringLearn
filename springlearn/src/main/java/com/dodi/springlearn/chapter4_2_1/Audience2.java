package com.dodi.springlearn.chapter4_2_1;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience2 {
	
	@Pointcut("execution(** com.dodi.springlearn.chapter4_2_1.Performance.perform(..))")
	public void performance(){};
	
	@Before("performance()")
	public void silenceCellPhones(){
		System.out.println("Slicecing cell phones");
	}
	
	@Before("performance()")
	public void takeSeats(){
		System.out.println("Taking Seats");
	}
	
	@AfterReturning("performance()")
	public void applause(){
		System.out.println("CLAP CLAP CALP!!!");
	}
	
	@AfterThrowing("performance()")
	public void demandRefund(){
		System.out.println("Demanding a refund");
	}
}
