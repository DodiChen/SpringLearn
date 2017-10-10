package com.dodi.springlearn.chapter4_2_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
// 启动AspectJ自动代理
public class ConcertConfig {
	
	@Bean
	// 声明Audience 代理
	// Spring 都会为使用@AspectJ注解的bean创建一个代理。这个代理会围绕着所有该切面的切点所匹配的bean
	public AudienceAround audience(){
		return new AudienceAround();
	}
	
	@Bean
	public Performance impl(){
		return new PerformanceImpl();
	}
}
