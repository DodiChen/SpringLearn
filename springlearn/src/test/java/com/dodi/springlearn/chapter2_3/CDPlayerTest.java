package com.dodi.springlearn.chapter2_3;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dodi.springlearn.chapter2_3.CDPlayerConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
	
	@Autowired
	private MediaPlayer player;
	@Autowired
	private CDPlayer cd;
	
	@Test
	public void cdShouldNotBeNull(){
		assertNotNull(cd);
		assertNotNull(player);
	}
}
