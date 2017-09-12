package com.dodi.springlearn.chapter2_5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfig {
	
	@Bean
	public CompactDisc compactDisc(){
		return new SegPepprrs();
	}
}
