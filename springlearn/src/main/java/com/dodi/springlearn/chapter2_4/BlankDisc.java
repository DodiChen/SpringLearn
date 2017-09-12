package com.dodi.springlearn.chapter2_4;

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
