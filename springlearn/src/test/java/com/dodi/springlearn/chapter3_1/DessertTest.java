package com.dodi.springlearn.chapter3_1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
//以便在测试开始的时候自动创建Spring的应用上下文
@ContextConfiguration(classes=DessertConfig.class)
//会告诉Spring上下文需要在CDPlayerConfig中加载配置
public class DessertTest {
	
	private Dessert de;
	
	@Autowired
	@Qualifier("cold")
	@Cold
	public void setDe(Dessert de){
		this.de = de;
	}
	
	@Test
	public void test() {

		assertNotNull(de);
		de.eat();
	}

}
