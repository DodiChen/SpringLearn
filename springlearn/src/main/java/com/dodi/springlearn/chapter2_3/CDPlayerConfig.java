package com.dodi.springlearn.chapter2_3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//这是一个配置类
//@ComponentScan
// 这是组件扫描，本例子重点讲解显式配置，将其注释掉
public class CDPlayerConfig {
	
	@Bean(name="lonelyHeartsClubBand")
	// 这个方法会返回一个对象
	// name 为该对象命名
	public CompactDisc sgtPeppers(){
		return new SegPeppers();
	}
	
	@Bean
	// 在JavaConfig中装配bean的最简单的方法就是引用创建bean的方法
	public CDPlayer cdPlayer(){
		return new CDPlayer(sgtPeppers());
	}
	
}
