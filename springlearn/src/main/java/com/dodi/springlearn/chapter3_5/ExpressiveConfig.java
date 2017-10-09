package com.dodi.springlearn.chapter3_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:app.properties")
// 引用了类路径下的app.propertirs文件
// 这个属性文件会加载到Spring的Environment文件中
public class ExpressiveConfig {
	
	@Autowired
	Environment env;
	
	@Bean
	// @Primary
	// 从属性文件中获取值，创建对象
	public BlankDisc disc(){
		return new BlankDisc(
			env.getProperty("disc.title"),
			env.getProperty("disc.artist")
		);
	}
	
	// @Bean
	// // 从属性文件中获取值，创建对象
	// public BlankDisc disc1(){
	// return new BlankDisc(
	// env.getProperty("disc.title"),
	// env.getProperty("disc.artist")
	// );
	// }
}
