package com.dodi.springlearn.chapter3_5_2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlankDisc implements CompactDisc {
	
	@Value("#{systemProperties['ClassPath']}")
	private String title;
	@Value("artist")
	private String artist;
	
	public BlankDisc(){}
	
//	public BlankDisc(
//			@Value("#{systemProperties['CLASS_PATH']}") String title, 
//			@Value("#{systemProperties['disc.artist']}") String artist) {
//		super();
//		this.title = title;
//		this.artist = artist;
//	}

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing " + title + " by " + artist);
	}

}