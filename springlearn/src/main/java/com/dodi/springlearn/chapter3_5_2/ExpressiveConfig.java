package com.dodi.springlearn.chapter3_5_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.dodi.springlearn.chapter3_5_2.BlankDisc;

@Configuration
@PropertySource("classpath:app.properties")
@ComponentScan(basePackages={"com.dodi.springlearn.chapter3_5_2"})
// 引用了类路径下的app.propertirs文件
// 这个属性文件会加载到Spring的Environment文件中
public class ExpressiveConfig {
	
}
