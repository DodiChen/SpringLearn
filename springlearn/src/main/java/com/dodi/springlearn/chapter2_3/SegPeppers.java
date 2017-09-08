package com.dodi.springlearn.chapter2_3;

public class SegPeppers implements CompactDisc {
	
	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}
}
