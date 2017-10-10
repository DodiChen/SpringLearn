package com.dodi.springlearn.chapter4_2_1;

import org.springframework.stereotype.Component;

@Component
public class PerformanceImpl implements Performance {

	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("我被通知了");
	}

}
