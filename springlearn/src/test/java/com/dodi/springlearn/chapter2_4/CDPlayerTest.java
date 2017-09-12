package com.dodi.springlearn.chapter2_4;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CDPlayerTest {

	@Test
	public void test() {
		ApplicationContext ct=new ClassPathXmlApplicationContext("spring_chapter2_4.xml");
		CDPlayer cd = (CDPlayer) ct.getBean("cdPlayer");
		cd.play();
		BlankDisc bd = (BlankDisc) ct.getBean("blankDisc");
		bd.play();
		
		BlankDiscList cdl = (BlankDiscList) ct.getBean("blankDiscList");
		cdl.play();
		
		CDPlayer cd2 = (CDPlayer) ct.getBean("cdPalyer2");
		cd.play();
		
		BlankDiscListProperty bdlp = (BlankDiscListProperty) ct.getBean("blankDiscListProperty");
		bdlp.play();
		
		BlankDiscListProperty bdlp2 = (BlankDiscListProperty) ct.getBean("blankDiscListProperty2");
		bdlp2.play();
	}

}
