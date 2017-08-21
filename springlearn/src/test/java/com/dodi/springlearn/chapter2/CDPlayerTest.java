package com.dodi.springlearn.chapter2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
//以便在测试开始的时候自动创建Spring的应用上下文
@ContextConfiguration(classes=CDPlayerConfig.class)
//会告诉Spring上下文需要在CDPlayerConfig中加载配置
public class CDPlayerTest {
	
	@Autowired
	private CompactDisc cd;
	
	@Test
	public void cdShouldNotBeNull(){
		assertNotNull(cd);
	}
	
}
