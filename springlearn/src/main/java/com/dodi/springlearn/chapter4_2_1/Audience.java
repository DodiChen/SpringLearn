package com.dodi.springlearn.chapter4_2_1;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {
	
	@Before("execution(* com.dodi.springlearn.chapter4_2_1.Performance.perform(..))")
	public void silenceCellPhones(){
		System.out.println("Slicecing cell phones");
	}
	
	@Before("execution(* com.dodi.springlearn.chapter4_2_1.Performance.perform(..))")
	public void takeSeats(){
		System.out.println("Taking Seats");
	}
	
	@AfterReturning("execution(* com.dodi.springlearn.chapter4_2_1.Performance.perform(..))")
	public void applause(){
		System.out.println("CLAP CLAP CALP!!!");
	}
	
	@AfterThrowing("execution(* com.dodi.springlearn.chapter4_2_1.Performance.perform(..))")
	public void demandRefund(){
		System.out.println("Demanding a refund");
	}
}
