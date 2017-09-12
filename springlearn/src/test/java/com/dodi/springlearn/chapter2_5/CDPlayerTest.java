package com.dodi.springlearn.chapter2_5;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dodi.springlearn.chapter2_5.CDPlayerConfig;
import com.dodi.springlearn.chapter2_5.CompactDisc;

@RunWith(SpringJUnit4ClassRunner.class)
//以便在测试开始的时候自动创建Spring的应用上下文
@ContextConfiguration(classes=CDPlayerConfig.class)
//会告诉Spring上下文需要在CDPlayerConfig中加载配置
public class CDPlayerTest {

	@Autowired
	@Qualifier("compactDisc")
	private CompactDisc cd;
	
	@Autowired
	private MeidaPlayer ls;
	
	@Autowired
	@Qualifier("blankDiscList")
	private BlankDiscList bdl;
	
	@Test
	public void cdShouldNotBeNull(){
		assertNotNull(cd);
		cd.play();
		assertNotNull(ls);
		ls.play();
		assertNotNull(bdl);
		bdl.play();
	}

}
