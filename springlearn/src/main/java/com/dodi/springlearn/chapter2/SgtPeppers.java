package com.dodi.springlearn.chapter2;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component
// 这个注解表明该类会作为组件类，并且告诉Spring要为这个类创建bean
//@Component("longlyHeartsClub")
// lonelyHeartsClub 给这个bean取了一个名字
@Named("longlyHeartsClub")
//与Component 给bean命名的作用一致
public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	
	public void play() {
		
		System.out.println("Playing " + title + " by " + artist);

	}

}
