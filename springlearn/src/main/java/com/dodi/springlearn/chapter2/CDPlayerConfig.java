package com.dodi.springlearn.chapter2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
//@ComponentScan("com.dodi.springlearn.chapter2")
// 会默认扫描与配置类相同的包以及子包，查找带有@Component注解的类
// 指定基础包
//@ComponentScan(basePackages="com.dodi.springlearn.chapter2")
// 也可以使用basePackages属性进行配置
//@ComponentScan(basePackages={"com.dodi.springlearn.chapter2","com.dodi.springlearn"})
// 设置多个基础包，将其设置为数组即可
//@ComponentScan(basePackageClasses={SgtPeppers.class})
// 除了设定简单的string之外，还可以将其指定为保重所包含的类和接口
public class CDPlayerConfig {

}
