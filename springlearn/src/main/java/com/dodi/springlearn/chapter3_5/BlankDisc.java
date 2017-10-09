package com.dodi.springlearn.chapter3_5;

import org.springframework.stereotype.Component;

@Component
public class BlankDisc implements CompactDisc {

	private String title;
	private String artist;
	
	public BlankDisc(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing " + title + " by " + artist);
	}

}
