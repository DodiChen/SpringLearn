package com.dodi.springlearn.chapter3_1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class IceCream implements Dessert {
	
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("IceCream");
	}
	
	
}
