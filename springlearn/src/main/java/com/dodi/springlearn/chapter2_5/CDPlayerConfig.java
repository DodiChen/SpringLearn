package com.dodi.springlearn.chapter2_5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDConfig.class)
@ImportResource("classpath:spring_chapter2_5.xml")
public class CDPlayerConfig {
	
	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc){
		return new CDPlayer(compactDisc);
	}
	
}
