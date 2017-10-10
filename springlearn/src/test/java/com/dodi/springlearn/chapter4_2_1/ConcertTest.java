package com.dodi.springlearn.chapter4_2_1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//以便在测试开始的时候自动创建Spring的应用上下文
@ContextConfiguration(classes=ConcertConfig.class)
public class ConcertTest {
	
	@Autowired
	private Performance per;
	
	@Test
	public void run(){
		per.perform();
	}
	
}
