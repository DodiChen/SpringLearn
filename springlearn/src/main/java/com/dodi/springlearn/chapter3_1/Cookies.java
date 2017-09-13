package com.dodi.springlearn.chapter3_1;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cold")
public class Cookies implements Dessert {
	
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cookie");
	}
}
