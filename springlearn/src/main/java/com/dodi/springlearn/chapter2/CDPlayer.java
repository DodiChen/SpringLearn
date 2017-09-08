package com.dodi.springlearn.chapter2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
	
	private CompactDisc cd;
	@Autowired
	//@Autowired(required=false)
	// 在构造器上面添加了autowired注解，这表明当Spring创建CDPlayer bean的时候，
	// 会通过这个构造器来进行实例化并且会传入一个可设置给CompactDisc 类型的bean
	// required=false, 如果没有匹配的bean, 那么在应用上下文创建的时候，Spring会抛出一个异常
	// 为了避免这个异常的出现，可以将required属性设置为false
	public CDPlayer(CompactDisc cd){
		this.cd = cd;
	}
	
	//@Autowired
	// 在Spring初始化bean之后，他会尽可能去满足bean的依赖，在此处，依赖是通过带有
	// @Autowired注解的方法进行声明的
//	public void setCpmpactDisc(CompactDisc cd){
//		this.cd = cd;
//	}
	
	public void play() {
		cd.play();
	}

}
