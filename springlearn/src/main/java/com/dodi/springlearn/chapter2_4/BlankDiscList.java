package com.dodi.springlearn.chapter2_4;

import java.util.List;

public class BlankDiscList implements CompactDisc {
	
	private String title;
	private String artist;
	private List<String> tracks;
	
	public BlankDiscList(String title, String artist, List<String> tracks){
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}
	
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing " + title + " by " + artist);
		for(String track : tracks){
			System.out.println("-Track:" + track);
		}
	}

}
