package com.dodi.springlearn.chapter3_5_2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
//以便在测试开始的时候自动创建Spring的应用上下文
@ContextConfiguration(classes=ExpressiveConfig.class)
//会告诉Spring上下文需要在CDPlayerConfig中加载配置
public class TestSPel {
	
	
	@Autowired
	BlankDisc db;
	
	@Test
	public void test1() {

		db.play();
	}

}
